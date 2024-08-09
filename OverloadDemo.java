public class OverloadDemo {
    int x;
    OverloadDemo(){
        System.out.println("Insedde OverloadDema(). ");
        x = 0;
    }
    OverloadDemo(int i){
        System.out.println("Insedde OverloadDema(int). ");
        x = i;
    }
    OverloadDemo(double d){
        System.out.println("Insedde OverloadDema(double). ");
        x = (int)d;
    }
    OverloadDemo(int i, int j){
        System.out.println("Insedde OverloadDema(int , int). ");
        x = i * j;
    }
}
