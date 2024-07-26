import java.util.Scanner;

public class CheckPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับคะแนนจากผู้ใช้
        System.out.print("กรุณาใส่คะแนน: ");
        float score = scanner.nextFloat();

        // เปรียบเทียบคะแนนและแสดงผลลัพธ์
        if (score > 60) {
            System.out.println("you are pass");
        } else {
            System.out.println("you are not pass");
        }

        scanner.close();
    }
}

