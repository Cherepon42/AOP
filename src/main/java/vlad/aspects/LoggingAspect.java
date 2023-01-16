package vlad.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import vlad.Book;

//@Component
//@Aspect
//@Order(1)
public class LoggingAspect {
   // @Before("vlad.aspects.Pointcats.allGetMethods()")
   // private void allGetMethodsLoggerAdvice(JoinPoint joinPoint) {
     //   MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
      //  Object[] arguments = joinPoint.getArgs();
//        System.out.println("--allMethodsLoggerAdvice: " + (methodSignature.getReturnType()));
//        System.out.println("--allMethodsLoggerAdvice: " + (methodSignature.getMethod()));
//        System.out.println("--allMethodsLoggerAdvice: " + (methodSignature.getName()));

//        if(methodSignature.getName().equals("getBook")) {
//            for(Object o : arguments) {
//                if(null instanceof Book) {
//                    Book book = (Book) o;
//                    System.out.println("--BOOK: " + (book.getAuthor()));
//                }
//            }
//        }

    //}
    //@Before("execution(public void vlad.Library.getBook())")
    //@Before("execution(public void get*())") - все методы с get
    //@Before("execution(public * get*())") - все методы с get, и любым возвращаемым типом
    //@Before("execution(* get*())") //- все методы с get, и любым возвращаемым типом, любой модификор доступа
    //@Before("execution(* *(*))") //- все и вся - с одним параметром
    //@Before("execution(* *(..))") //- все и вся - с любыми параметрами
    //@Before("execution(* *(vlad.Book, ..))") // - с параметром БУК и другими

    /*@Pointcut("execution(* vlad.Library.*(..))")
    private void all(){}
    @Before("all()")
    public void beforeGetBookAdvice() {
        System.out.println("BEFORE GETTING BOOK");
    }
    @Before("all()")
    public void beforeGetBookSecondAdvice() {
        System.out.println("BEFORE GETTING BOOK SECOND ADVICE");
    }*/

   /* @Pointcut("execution(* vlad.Library.get*(..))")
    private void allGetsMethodsFromLibrary() {}

    @Pointcut("execution(* vlad.Library.return*(..))")
    private void allReturnMethodsFromLibrary(){}

    @Pointcut("allGetsMethodsFromLibrary() || allReturnMethodsFromLibrary()")
    private void allGetAndReturnMethodsFromLibrary(){}

    @Before("allGetsMethodsFromLibrary()")
    public void beforeGetLoggingAdvice() {
        System.out.println("--BEFORE LOGGING GETTING");
    }

    @Before("allReturnMethodsFromLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("--BEFORE LOGGING RETURN");
    }

    @Before("allGetAndReturnMethodsFromLibrary()")
    public void beforeAllGetAndReturnMethodsFromLibrary() {
        System.out.println("--BEFORE LOGGING ALL");
    }*/

    /*@Pointcut("execution(* vlad.Library.*(..))")
    private void allMethodsFromLibrary() {
    }

    @Pointcut("execution(* vlad.Library.returnMagazine(..))")
    private void returnMethodFromLibrary() {
    }

    @Pointcut("allMethodsFromLibrary() && !returnMethodFromLibrary()")
    private void allExceptReturnMethodsFromLibrary() {
    }

    @Before("allExceptReturnMethodsFromLibrary()")
    private void allMethodsFromLibraryAdvice() {
        System.out.println("--not a return magazine");
    }*/
}
