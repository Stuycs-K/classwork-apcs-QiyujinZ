public class ColorDemo{
  public static final String ESC = "\u001b[";
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  
  public static void go(int x,int y){
    System.out.print("\u001b[" + x + ";" + y + "f");
  }
    
  public static void main (String[] args){
    for (int i = 0; i < 10; i ++){
        for (int j = 0; j < 256; j++){
          System.out.print(ESC+"48;2;"+j+";"+i+";12m.");
            }
        }
    }
}
