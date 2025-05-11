package Question02;

public class Library {
    private String libraryName;
    private Book[] books = new Book[3];
    private int bookCount = 0;

    //Constructor to initialize the library name
    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    //Getter for library name
    public String getLibraryName() {
        return libraryName;
    }

    //Add a book
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            book.setLibrary(this);
            bookCount++;
        } else {
            System.out.println("Cannot add more books to the library.");
        }
    }

    //Display library details
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookDetails();
        }
    }
}
