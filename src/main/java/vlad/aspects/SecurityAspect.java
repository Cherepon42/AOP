package vlad.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("vlad.aspects.Pointcats.allGetMethods()")
    private void allGetMethodsSecurityAdvice() {
        System.out.println("--allMethodsSecurityAdvice");
    }
}
