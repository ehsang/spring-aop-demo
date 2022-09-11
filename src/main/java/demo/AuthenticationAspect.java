package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    //execute this PointCut method for all the types(its classes)(*) within demo package
    @Pointcut("within(demo..*)")
    public void authenticatingPointCut(){
    }

    //Its the same with previous one but only runs the PointCut method for all the methods within ShoppingCart class
    @Pointcut("within(demo..*)")
    public void authorizationPointCut(){
    }

    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the request");
    }
}
