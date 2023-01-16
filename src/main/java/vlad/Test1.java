package vlad;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Book book = context.getBean("book", Book.class);
        Library library = context.getBean("libraryBean", Library.class);
        library.getBook("AKSLDJASLD", book);
        library.returnMagazine();

        context.close();
    }
}
