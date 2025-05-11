package Question03;

public class Document {
    private String title;
    private String content;

    // Constructor
    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    //Getter for title
    public String getTitle() {
        return title;
    }

    //Display document details
    public void displayDocument() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }
}

