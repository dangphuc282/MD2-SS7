import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ✅ Khởi tạo hình chữ nhật mặc định
        System.out.println("==> Hình chữ nhật mặc định:");
        Rectangle rect1 = new Rectangle();
        rect1.display();

        // ✅ Khởi tạo hình chữ nhật với kích thước do người dùng nhập
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhập chiều dài: ");
        double length = scanner.nextDouble();

        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        Rectangle rect2 = new Rectangle(length, width);
        System.out.println("\n==> Hình chữ nhật người dùng nhập:");
        rect2.display();
    }
}

