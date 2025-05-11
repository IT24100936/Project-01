package Question02;

public class LibraryApp {
    public static void main(String[] args) {

        //Create a Library object
        Library library = new Library("Main Library");

        //Create 3 Book objects
        Book book1 = new Book("B0001", "Python");
        Book book2 = new Book("B0002", "Java");
        Book book3 = new Book("B0003", "C++");

        //Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        //Display Library details
        library.displayLibraryDetails();
    }
}

