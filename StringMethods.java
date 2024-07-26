public class StringMethods { 
    public static void main(String[] args) {
        String message = "Java is Great Fun";
    /*
    เมธอดพื้นฐาน
     1.toUpperCase() ปรับพิมพ์ใหญ่
     2.toLowerCase() ปรับพิมเล็ก
     3.length() นับจำนวนขอความ
     4.charAt() ตำแหน่งข้อความ
    */
    String upper = message.toUpperCase();
    System.out.println(upper);

    String lower = message.toLowerCase();
    System.out.println(lower);

    int stringSize = message.length();
    System.out.println(stringSize);

    char lenter = message.charAt(3);
    System.out.println(lenter);
    }
}
