import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        System.out.println("==> Hình chữ nhật mặc định:");
        Rectangle rect1 = new Rectangle();
        rect1.display();

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

