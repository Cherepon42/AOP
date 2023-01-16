package aop2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(10)
@Component
public class AspectLog {
    @Pointcut("execution(* aop2.Library.get*(..))")
    private void allGetMethodsFromLibrary() {
    }

    @Around("allGetMethodsFromLibrary()")
    private String AllGetMethodsWithReturningBooksFromLibrary(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("ADVICE start");
        String object = (String) proceedingJoinPoint.proceed();
        System.out.println("ADVICE end");
        return object;
    }

    @Pointcut("execution(* aop2.Library.*(..))")
    private void exceptionHandlerFromLibrary() {
    }

    @AfterThrowing(pointcut = "exceptionHandlerFromLibrary()", throwing = "exception")
    private void exceptionHandlerAdvice(Throwable exception) {
        System.out.println(exception.getMessage());
        System.out.println("exception advice");
    }

}
