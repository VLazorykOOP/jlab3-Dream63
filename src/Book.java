public class Book extends PrintedWork {
    private String author;
    private int numOfPages;

    public Book(String Author, int NumOfPages) {
        super(Author, 123);
    }

    public Book() {
        super();
    }

    @Override
    public String Show() {
        return "Book - Author: " + author + " | number of pages: " + numOfPages; 
    }
}
