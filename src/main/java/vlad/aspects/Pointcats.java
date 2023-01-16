package vlad.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcats {
    @Pointcut("execution(* vlad.Library.get*(..))")
    public void allGetMethods() {
    }
}
