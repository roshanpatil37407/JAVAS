import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        scanner.close();
    }
}






//public class Main {
//    public static void main(String[] args) {
//        int num = 10;
//
//        if (num % 2 == 0) {
//            System.out.println("The number is even.");
//        } else {
//            System.out.println("The number is odd.");
//        }
//    }
//}

