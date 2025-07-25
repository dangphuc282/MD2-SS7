import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("An", 20, "12A1", 8.5));
        students.add(new Student("Bình", 21, "12A2", 6.7));
        students.add(new Student("Chi", 19, "12A3", 9.2));
        students.add(new Student("Dũng", 22, "12A4", 5.3));
        students.add(new Student("Hà", 20, "12A1", 7.0));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm tối thiểu (min): ");
        double min = scanner.nextDouble();
        System.out.print("Nhập điểm tối đa (max): ");
        double max = scanner.nextDouble();

        System.out.println("\n==> Sinh viên có điểm TB từ " + min + " đến " + max + ":");
        boolean found = false;
        for (Student student : students) {
            if (student.getAvgScore() >= min && student.getAvgScore() <= max) {
                student.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có sinh viên nào trong khoảng điểm này.");
        }
    }
}
