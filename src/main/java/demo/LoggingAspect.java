package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //Here we are telling spring to run this method before execution of checkout() method of shoppingcart class
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(){
        System.out.println("before logger --> executing the business logic");
    }

    //Here we are telling spring to run this method before execution of checkout() method of shoppingcart class
    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("after logger --> executing the business logic");
    }

}
