import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        int age = 2020 - yearOfBirth;
        scanner.nextLine();
        scanner.nextLine();

        System.out.println("Your name is " + name + " and you are " + age);
        scanner.close();


    }
}
