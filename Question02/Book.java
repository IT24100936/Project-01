package Question02;

public class Book {
    private String isbn;
    private String title;
    private Library library;

    //Parameterized constructor
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    //Setter to assign the library
    public void setLibrary(Library library) {
        this.library = library;
    }

    //Display book details
    public void displayBookDetails() {
        System.out.println("Book ISBN: " + isbn + ", Title: " + title);
        if (library != null) {
            System.out.println("Library Name: " + library.getLibraryName());
        }
    }
}
