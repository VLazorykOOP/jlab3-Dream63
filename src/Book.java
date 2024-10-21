public class Book extends PrintedWork {
    private final String genre;

    public Book(String Author, int NumOfPages, String Genre) {
        super(Author, NumOfPages);
        genre = Genre;
    }

    public Book() {
        super();
        genre = "unknowm";
    }

    @Override
    public String Show() {
        return "Book --- Genre: " + genre + " | " + super.Show(); 
    }
}
