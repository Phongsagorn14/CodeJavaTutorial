import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select calculation : ");
        System.out.println("1. Add numbers");
        System.out.println("2. Multiply numbers");
        System.out.println("3. Divide numbers");
        System.out.println("4. Delete numbers");
        System.out.print("Please select 1-4 : ");
        int choice = scanner.nextInt();

        System.out.print("Fill in the numbers at 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Fill in the numbers at 2 : ");
        int num2 = scanner.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("Add numbers: " +(num1 + num2));
                break;
            case 2 :
                System.out.println("Multiply numbers: " +(num1 * num2));
                break;
            case 3 :
                if (num2 !=0){
                    System.out.println("Divide numbers: " +(num1 / num2));
                } else{
                    System.out.println("cannot be divided by zero");
                }
                break;
            case 4 :
                System.out.println("Delete numbers: " +(num1 - num2));
                break;
            default:
                System.out.println("Incorrect selection. Please select. 1-4");
                break;
        }
    }
}

