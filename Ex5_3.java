public class Ex5_3 {
    public static int findMax(int a, int b) {
        if (a > b) {
            return a; 
        } else {
            return b; 
        }
    }

    public static void main(String[] args) {
        int num1 = 15; 
        int num2 = 25; 

        int max = findMax(num1, num2); 
        System.out.println("The maximum value is: " + max); 
    }
}
