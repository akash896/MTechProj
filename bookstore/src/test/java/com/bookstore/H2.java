package com.bookstore

import com.bookstore.domain.Book;

public class H2 {
    public static  void main(int args[]){

    Book book1=new Book(
        Debug.makeSymbolicInteger("Id"),
        Debug.makeSymbolicInteger("title"),
        Debug.makeSymbolicInteger("author"),
        Debug.makeSymbolicInteger("publisher"),
        Debug.makeSymbolicInteger("publicationDate"),
        Debug.makeSymbolicInteger("language"),
         Debug.makeSymbolicInteger("category"),
        Debug.makeSymbolicInteger("numberOfPages"),
        Debug.makeSymbolicInteger("format"),
        Debug.makeSymbolicInteger("isbn"),
        Debug.makeSymbolicInteger("shippingWeight"),
        Debug.makeSymbolicInteger("listPrice"),
        Debug.makeSymbolicInteger("ourPrice"),
        Debug.makeSymbolicInteger("active =true"),
    );


        Book result=model.find("book");
        boolean c1=false;
        if(     result.id==book1.id &&
                result.title==book1.title &&
                result.author==book1.author &&
                result.publisher==book1.publisher &&
                result.publucationDate==book1.publucationDate &&
                result.language==book1.language &&
                result.category==book1.category &&
                result.numberOfPages==book1.numberOfPages &&
                result.format==book1.format &&
                result.isbn==book1.isbn &&
                result.shippingWeight==book1.shippingWeight &&
                result.listPrice==book1.listPrice &&
                result.ourPrice==book1.ourPrice &&
                result.active==book1.active &&
        )   c1=true;

    assert(c1);

    }
}
