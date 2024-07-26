public class MotionCalculation {
    public static void main(String[] args) {
        // กำหนดค่าเริ่มต้น
        double u = 10.0; // ความเร็วเริ่มต้น (เมตร/วินาที)
        double t = 5.0;  // เวลา (วินาที)
        double g = 9.8;  // ความเร่งเนื่องจากแรงโน้มถ่วง (เมตร/วินาที^2)

        // คำนวณระยะทาง s = ut + ½ gt^2
        double s = u * t + 0.5 * g * t * t;

        // แสดงผลลัพธ์
        System.out.println("ระยะทาง s = " + s + " เมตร");
    }
}
