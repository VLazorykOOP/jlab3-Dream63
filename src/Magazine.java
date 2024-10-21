public class Magazine extends PrintedWork {
    private final double price;

    public Magazine(String Author, int NumOfPages, double Price) {
        super(Author, NumOfPages);
        price = Price;
    }

    public Magazine() {
        super();
        price = 0;
    }

    @Override
    public String Show() {
        return "Magazine --- Price: " + price + " | " + super.Show(); 
    }
}
