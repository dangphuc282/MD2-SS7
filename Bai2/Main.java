public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.setTitle("Lập trình Java cơ bản");
        book1.setAuthor("Nguyễn Văn A");
        book1.setPrice(150000);

        System.out.println("==> Thông tin sách 1:");
        book1.displayInfo();

        System.out.println("\nThử gán giá âm:");
        book1.setPrice(-10000); // không hợp lệ

        System.out.println("==> Sau khi gán giá âm:");
        book1.displayInfo();

        Book book2 = new Book("Clean Code", "Robert C. Martin", 300000);
        System.out.println("\n==> Thông tin sách 2:");
        book2.displayInfo();
    }
}
