public class Book {

    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Không tên";
        this.author = "Không rõ";
        this.price = 0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        setPrice(price);
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Giá sách không được âm. Giữ nguyên giá cũ.");
        }
    }
    public void displayInfo() {
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá: " + price + " VND");
    }
}
