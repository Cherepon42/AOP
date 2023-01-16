package aop2;

import org.springframework.stereotype.Component;

@Component
public class Library {

    public String getBook() {
        return "book1";
    }
}
