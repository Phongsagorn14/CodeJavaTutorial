public class ExNo3 {
    public static void main(String[] args) {
        int multiplier = 8; 

        System.out.println("Multiplication Table for " + multiplier + ":");
        
        
        for (int i = 1; i <= 10; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }
    }
}

