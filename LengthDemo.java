public class LengthDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle();
        System.out.println("Sending the value 10.0 to the setLength method");
        box.setLength(20.0);
        box.setWidth(20.0);
        box.getLength();
        System.out.println("The box's length is " +box.getLength());
        System.out.println("The box's length is " +box.getWidth());
        System.out.println("The box's area is " +box.getArea());
        box.getWidth();
        System.out.println("Done");
    }
}
