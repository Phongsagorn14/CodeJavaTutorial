import java.util.Scanner; /* step1 เรียกใช้  Scanner */
public class calnum {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in); /* step2 สร้างออมเจ็กต์ in สำหรับข้อมูล */
        System.out.print("Input Number1 : ");
        x  = in.nextInt(); /* step3 รับตัวเลขเป็นจพนานเต็มในตัวแปร x */
        System.out.println("your Number is "+x);
        System.out.print("Input Number2 : ");
        y = in.nextInt();
        System.out.println("your Number is "+y);
        System.out.println(x+ " + " +y+ " = " +(x+y));
    }
}
