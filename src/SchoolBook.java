public class SchoolBook extends PrintedWork {
    private final String lesson;

    public SchoolBook(String Author, int NumOfPages, String Lesson) {
        super(Author, NumOfPages);
        lesson = Lesson;
    }

    public SchoolBook() {
        super();
        lesson = "unknown";
    }

    @Override
    public String Show() {
        return "SchoolBook --- Lesson: " + lesson + " | " + super.Show(); 
    }
}
