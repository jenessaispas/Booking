
import java.util.ArrayList;
import java.util.List;

//Klasse Library als Bibliothek.
public class Library {
    //Erstellen von zwei Listen Objekte für jeweiligen Bücher und Benutzer.
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    //Library Konstruktor mit Übergabeparameter um diese belegen zu können, da private gesetzt und anders ein Zugriff
    //darauf nicht möglich ist.
    public Library(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;

    }

    //Setter und Getter für die Klasse Library
    public List<Book> getBooks() {
        return books;

    }

    public void setBooks(List<Book> books) {
        this.books = books;
        System.out.println("Library get new book called " + books);
        System.out.println("Books updated with " + books.size() + " books");
    }

    public List<User> getUsers() {
        return users;

    }

    public void setUsers(List<User> users) {
        this.users = users;
        System.out.println("Users updated with " + users.size() + " users");
    }

    //Methode um alle Bücher aus der List Sammlung auf der Konsole auszugeben.
    public void showBooks(List<Book> books) {
        for (Book book : books) {
            if (books.isEmpty()) {
                System.out.println("Theres no books to show");
            } else {
                System.out.println("You have the choice between following books: Book ID: " + book.getId() + " Title: " + book.getTitle() + " Author: " + book.getAuthor());
            }
        }
    }
    public void borrowBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isBorrowed()){
                book.setBorrowed(true);
                    System.out.println("Book " + book.getTitle() + " borrowed successfully");
                    return;
                }else {
                    System.out.println("Book " + book.getTitle() + " is already borrowed");
                    return;
                }
            }
        }
        System.out.println("Book whit ID " + bookId + " not found");
    }
}

