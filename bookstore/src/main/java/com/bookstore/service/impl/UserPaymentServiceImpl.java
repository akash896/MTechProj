package com.bookstore.service.impl;

import com.bookstore.domain.UserPayment;
import com.bookstore.repository.UserPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {

    @Autowired
    private UserPaymentRepository userPaymentRepository;

    @Override
    public UserPayment findById(Long id) {

        return userPaymentRepository.findById(id).orElse(null);
        //        User u=userRepository.findByUsername(username);
//        if(u!=null) return null;
//        else throw new RuntimeException();
    }

    @Override
    public void removeById(Long creditCardId) {
        userPaymentRepository.deleteById(creditCardId);
    }
}
