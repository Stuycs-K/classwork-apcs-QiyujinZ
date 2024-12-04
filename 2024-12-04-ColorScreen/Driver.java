public class Driver extends Text{

    public static void drawBorder(int height, int width){
        for (int j = 0; j < height; j ++){
            for (int i = 0; i < width; i ++){
              if (j == 0 || j == height-1){
                color(background(GREEN));
                }
              else{
                  if (i == 0 || i == width -1){
                    color(background(GREEN));
                  }
                  else{
                    System.out.print("\033[0m");
                  }
                }
              System.out.print(" ");
             }
             System.out.println("\033[0m");
        }
    }
    
    
    public static void main (String[] args){
        drawBorder(30,100);
        System.out.println(RESET);
  }
}
