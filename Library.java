import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    
    public void addBook(Book book) { books.add(book); }
    public void addUser(User user) { users.add(user); }

    
    public void showBooks() {
        System.out.println("\n--- Library Books ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    
    public void issueBook(String isbn, int userId) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn) && !b.isIssued()) {
                b.issueBook();
                System.out.println("Book '" + b.getTitle() + "' issued to User ID " + userId);
                return;
            }
        }
        System.out.println("Book not available or already issued!");
    }

    
    public void returnBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn) && b.isIssued()) {
                b.returnBook();
                System.out.println("Book '" + b.getTitle() + "' returned successfully!");
                return;
            }
        }
        System.out.println("Invalid return request!");
    }
}

