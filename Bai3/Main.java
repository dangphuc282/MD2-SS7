import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person();
        System.out.print("Nhập tên người thứ nhất: ");
        person1.setName(scanner.nextLine());
        System.out.print("Nhập tuổi người thứ nhất: ");
        person1.setAge(scanner.nextInt());
        scanner.nextLine();

        Person person2 = new Person();
        System.out.print("Nhập tên người thứ hai: ");
        person2.setName(scanner.nextLine());
        System.out.print("Nhập tuổi người thứ hai: ");
        person2.setAge(scanner.nextInt());


        System.out.println("\n==> Kết quả so sánh tuổi:");
        if (person1.getAge() > person2.getAge()) {
            System.out.println(person1.getName() + " lớn tuổi hơn " + person2.getName());
        } else if (person1.getAge() < person2.getAge()) {
            System.out.println(person2.getName() + " lớn tuổi hơn " + person1.getName());
        } else {
            System.out.println("Cả hai người có cùng tuổi.");
        }
    
    }
}
