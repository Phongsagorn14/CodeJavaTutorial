import java.util.Scanner;
public class  ifAct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาใส่คะแนน: ");
        float score = scanner.nextFloat();

        if (score > 60) {
            System.out.println("you are pass");
        } else {
            System.out.println("you are not pass");
        }

        scanner.close();
    }
}

