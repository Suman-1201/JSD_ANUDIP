import java.util.Scanner;

public class KidsLaptop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Choose an option:");
        System.out.println("1. Addition ");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication ");
        System.out.println("4. Even or Odd Number");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter two numbers to add:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
           System.out.println("Enter two numbers to subtract:");
                int minus = input.nextInt();
                int sub = input.nextInt();
                result = minus - sub;
                System.out.println("Result: " + result);
                break;
            case 3:
                System.out.println("Enter two numbers to multiply:");
                int factor1 = input.nextInt();
                int factor2 = input.nextInt();
                result = factor1 * factor2;
                System.out.println("Result: " + result);
                break;
            case 4:
  System.out.println("Enter a number to check if it's even or odd:");
                int number = input.nextInt();
                if (number % 2 == 0) {
                    System.out.println(number + " is even.");
                } else {
                    System.out.println(number + " is odd.");
                }
                break;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }

        input.close();
    }
