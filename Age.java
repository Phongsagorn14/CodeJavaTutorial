import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        final int AGE = 20;
        int inputAge ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");    
        inputAge = scan.nextInt();
        System.out.print("your entered : " +inputAge);
        if(inputAge < 20)
            System.out.println(" you are still young");
        System.out.println("Good Bye!!");   
    }
}
