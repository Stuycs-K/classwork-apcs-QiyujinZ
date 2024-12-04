public class Driver extends Text{

    public static void drawBorder(int length, int width){
      for (int i = 0; i < width; i ++){
        color(background(GREEN));
        System.out.print(".");
      }
      
    }
    
    
    public static void main (String[] args){
        drawBorder(30,100);
        System.out.println(RESET);
  }
}
