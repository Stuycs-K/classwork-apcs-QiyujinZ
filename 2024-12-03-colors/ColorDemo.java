public class ColorDemo{
  
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  
  public static void go(int x,int y){
    System.out.print("\u001b[" + x + ";" + y + "f");
  }
    
  public static void main (String[] args){
    
  }
}
