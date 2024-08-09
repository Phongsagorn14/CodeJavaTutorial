public class ConstructorDemo {
    public static void main(String[] args) {
        ContRectangle boxA = new ContRectangle(8.0, 12.0);
        ContRectangle boxB = new ContRectangle();
        /*
        Rectangle box = new Rectagle();
        box.setLength(8.0);
        box.setWidth(12.0);
        */
        System.out.println("The box's length is " +boxA.getLength());
        System.out.println("The box's width is " +boxA.getwidth());
        System.out.println("The box's area is " +boxA.getArea());

        System.out.println("The box's length is " +boxB.getLength());
        System.out.println("The box's width is " +boxB.getwidth());
        System.out.println("The box's area is " +boxB.getArea());
    }
}
