package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //Here we are telling spring to run this method before execution of checkout() method of shoppingcart class
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp) {
        //We can extract different kinds of details using JoinPoint
        //System.out.println(jp.getSignature());
        //here we use .getArgs() method of the jp object to extract the args of the method (which is checkout here)
        String arg = jp.getArgs()[0].toString();
        System.out.println("before logger --> executing the business logic with argument:" + arg);
    }

    //Here we are telling spring to run this method before execution of checkout() method of shoppingcart class
    @After("execution(* *.*.checkout(..))")
    public void afterLogger() {
        System.out.println("after logger --> executing the business logic");

    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut() {

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",
            returning = "retVal")
    public void afterReturning(String retVal) {
        System.out.println("after returning: " + retVal);
    }

}
