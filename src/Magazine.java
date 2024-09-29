public class Magazine extends PrintedWork {
    private String author;
    private int numOfPages;

    public Magazine(String Author, int NumOfPages) {
        super(Author, 123);
    }

    public Magazine() {
        super();
    }

    @Override
    public String Show() {
        return "Magazine - Author: " + author + " | number of pages: " + numOfPages; 
    }
}
