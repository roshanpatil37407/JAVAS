import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = scanner.nextInt();

        if (a == 20) {
            if (a == 10) {
                System.out.println("Small number");
            } else if (a == 15) {
                System.out.println("Small medium");
            } else if (a == 25) {
                System.out.println("Small large");
            } else {
                System.out.println("Number is 20 but doesn't match other conditions");
            }
        } else {
            System.out.println("Error: The number is not 20");
        }

        scanner.close();
    }
}
