public class PrintedWork {
    String author;
    int numOfPages;

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
