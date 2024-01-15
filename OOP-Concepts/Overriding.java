class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method to be overridden
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class LibraryBook extends Book {
    private int shelfNumber;

    // Constructor
    public LibraryBook(String title, String author, int shelfNumber) {
        super(title, author);
        this.shelfNumber = shelfNumber;
    }

    // Getter
    public int getShelfNumber() {
        return shelfNumber;
    }

    // Overriding the displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Shelf Number: " + shelfNumber);
    }
}

public class Overriding {
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Displaying information using the Book class
        System.out.println("Book Information:");
        book.displayInfo();
        System.out.println();

        // Creating a LibraryBook object
        LibraryBook libraryBook = new LibraryBook("Java Programming", "John Doe", 101);

        // Displaying information using the overridden method in LibraryBook class
        System.out.println("Library Book Information:");
        libraryBook.displayInfo();
    }
}
