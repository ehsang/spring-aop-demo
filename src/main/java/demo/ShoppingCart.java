package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    /*These are the samples of cross-cutting concerns that we're trying to separate out from the business logic of the
    application using AOP which is aspectJ library*/
    //Logging --> This is an aspect
    //Authentication & Authorization --> This is an aspect
    //Sanitize the data --> This is an aspect
    public void checkout(String status){
        System.out.println("checkout method from shoppingcart called");
    }
}
