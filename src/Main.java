import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crearea unor instanțe de Book
        Book book1 = new Book("Java Programming", "John Doe", "123456789");
        Book book2 = new Book("Python Basics", "Jane Smith", "987654321");
        Book book3 = new Book("Data Structures", "Bob Johnson", "111223344");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.removeBook(book2);

        library.displayBooks();
    }
}
