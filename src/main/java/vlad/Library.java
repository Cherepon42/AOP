package vlad;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook(String name, Book book) {
        System.out.println("GETTING BOOK " + (name));
    }

    public void getMagazine() {
        System.out.println("GETTING MAGAZINE");
    }

    public void returnMagazine() {
        System.out.println("RETURNING MAGAZINE");
    }

    public void returnBook() {
        System.out.println("RETURNING BOOK");
    }

}
