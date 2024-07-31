import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("เลือกการคำนวณ : ");
        System.out.println("1. บวกเลข");
        System.out.println("2. คูณเลข");
        System.out.println("3. หารเลข");
        System.out.println("4. ลบเลข");
        System.out.print("กรุณาเลือก 1-4 : ");
        int choice = scanner.nextInt();

        System.out.print("กรอกตัวเลขที่ 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("กรอกตัวเลขที่ 2 : ");
        int num2 = scanner.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("ผลบอก: " +(num1 + num2));
                break;
            case 2 :
                System.out.println("ผลคูณ: " +(num1 * num2));
                break;
            case 3 :
                if (num2 !=0){
                    System.out.println("ผลคูณ: " +(num1 / num2));
                } else{
                    System.out.println("ไม่สามารถหารด้วยศูนย์ได้");
                }
                break;
            case 4 :
                System.out.println("ผลลบ: " +(num1 - num2));
                break;
            default:
                System.out.println("การเลือกไม่ถูกต้อง กรุณาเลือก 1-4");
                break;
        }
    }
}

