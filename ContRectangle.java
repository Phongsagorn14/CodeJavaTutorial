public class ContRectangle {
    private double length;
    private double width;
    /*
    pubilc void SetWidth(double length){
         length = len;
     }
     pubilc void SetWidth(double w){
        width = w;
     }
     */
    public void setLength(double len){
        length = len;
   }

   public void setWidth(double w){
       width = w;
   }
   public ContRectangle() {
    length = 1.0;
    width = 1.0;
    }
    public ContRectangle(double len, double w) {
        length = len;
        width = w;
    }
    public double getLength(){
        return length;
    }
    public double getwidth(){
        return width;
    }
    public double getArea(){
        return length * width;
    }
}
