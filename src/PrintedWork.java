public class PrintedWork {
    private String author;
    private int numOfPages;

    public PrintedWork(String Author, int NumOfPages) {
        author = Author;
        numOfPages = NumOfPages;
    }
    public PrintedWork() {
        author = "Unknown";
        numOfPages = 1;
    }

    public String Show() {
        return "Author: " + author + " | number of pages: " + numOfPages; 
    }
}
