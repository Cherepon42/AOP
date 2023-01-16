package vlad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Autowired
    @Value("КНИГА какая-то")
    private String name;
    @Autowired
    @Value("AUTHOR123")
    private String author;
    @Autowired
    @Value("1999")
    private int year;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
