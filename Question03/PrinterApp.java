package Question03;

public class PrinterApp {
    public static void main(String[] args) {
        Document doc = new Document("Lab Report", "This is the final lab report for SE1020.");
        Printer printer = new Printer();
        printer.printDocument(doc);
    }
}
