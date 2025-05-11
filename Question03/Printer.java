package Question03;

public class Printer {
    public void printDocument(Document doc) {
        System.out.println("Printing document: " + doc.getTitle());
        doc.displayDocument();
    }
}

