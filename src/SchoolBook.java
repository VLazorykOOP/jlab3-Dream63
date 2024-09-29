public class SchoolBook extends PrintedWork {
    private String author;
    private int numOfPages;

    public SchoolBook(String Author, int NumOfPages) {
        super(Author, 123);
    }

    public SchoolBook() {
        super();
    }

    @Override
    public String Show() {
        return "SchoolBook - Author: " + author + " | number of pages: " + numOfPages; 
    }
}
