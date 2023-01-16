package aop2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Library library = context.getBean("library", Library.class);
        System.out.println("Our book -" + (library.getBook()));

        context.close();
    }
}
