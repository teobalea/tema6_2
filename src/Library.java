import java.util.ArrayList;

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Carte adăugată în bibliotecă: " + book.getTitle());
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Carte ștearsă din bibliotecă: " + book.getTitle());
        } else {
            System.out.println("Cartea nu a fost găsită în bibliotecă.");
        }
    }

    public void displayBooks() {
        System.out.println("Cărți în bibliotecă:");
        for (Book book : books) {
            System.out.println("Titlu: " + book.getTitle() + ", Autor: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}