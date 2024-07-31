import java.util.Scanner;
public class TestGrade {
    public static void main(String[] args) {
        int score;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your score : ");
        score = in.nextInt();
        if (score < 50) {
            //Statement 1
            System.out.println("Your Grade is F .");
        }else if(score < 60) {
            //Statement 2
            System.out.println("Your Grade is D .");
        }else if(score < 70) {
            //Statement 3
            System.out.println("Your Grade is C .");
        }else if(score < 80) {
            //Statement 4
            System.out.println("Your Grade is B .");
        }else if(score <= 100) {
            //Statement 5
            System.out.println("Your Grade is A .");
        }else{
           //false
           System.out.println("Invalid score. ");
        }
    }
}
