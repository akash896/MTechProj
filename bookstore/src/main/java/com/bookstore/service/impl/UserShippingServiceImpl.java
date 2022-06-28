package com.bookstore.service.impl;

import com.bookstore.domain.UserShipping;
import com.bookstore.repository.UserShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShippingServiceImpl implements UserShippingService {

    @Autowired
    private UserShippingRepository userShippingRepository;

    @Override
    public UserShipping findById(Long id) {

//        return userShippingRepository.findById(id).orElse(null);
        UserShipping u=userShippingRepository.findById(id).orElse(null);
        if(u!=null) return null;
        else throw new RuntimeException();
    }


    @Override
    public void removeById(Long userShippingId) {
        userShippingRepository.deleteById(userShippingId);
    }
}
