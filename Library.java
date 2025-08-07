import java.util.*;

public class Library {
    private Map<Integer, Book> books = new HashMap<>();
    private Map<Integer, User> users = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void issueBook(int bookId, int userId) {
        Book book = books.get(bookId);
        User user = users.get(userId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        if (book.getIssuedTo() != null) {
            System.out.println("Book already issued.");
            return;
        }
        book.setIssuedTo(user);
        System.out.println("Book '" + book.getTitle() + "' issued to " + user.getName() + ".");
    }

    public void returnBook(int bookId) {
        Book book = books.get(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (book.getIssuedTo() == null) {
            System.out.println("Book is not issued to anyone.");
            return;
        }
        System.out.println("Book '" + book.getTitle() + "' returned by " + book.getIssuedTo().getName() + ".");
        book.setIssuedTo(null);
    }

    public void listBooks() {
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public void listUsers() {
        for (User user : users.values()) {
            System.out.println(user);
        }
    }
}
