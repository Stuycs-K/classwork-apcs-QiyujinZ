public class ColorDemo{
  public static final String ESC = "\u001b[";
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
	
  public static void drawStars() {
    int starRows = 9;
    int starCols6 = 6;
    int starCols5 = 5;
    int starRowSpacing = 2;
    int starColSpacing = 8;

    for (int row = 0; row < starRows; row++) {
        int starCols;
        if (row % 2 == 0) {
            starCols = starCols6;
        } else {
            starCols = starCols5;
        }
         for (int col = 0; col < starCols; col++) {
            int x;
            if (row % 2 == 0) {
                x = col * starColSpacing + 7;
            } else {
                x = col * starColSpacing + 11;
            }
            int y = row * starRowSpacing + 4;

            System.out.print(ESC + y + ";" + x + "H" + ESC + "48;2;60;59;110m" + ESC + "38;2;255;255;255m" + "*" + ESC + "0m");
        }
    }
}


  public static void myOutput(){
	int width = 130;
	System.out.println("");
	for (int i = 0; i < 39; i ++){
        for (int j = 0; j < width; j++){
          System.out.print(ESC+"48;2;"+255+";"+255+";"+255+"m ");
            }
		System.out.println("");
        }
	System.out.println("\u001b[H");
	for (int a = 0; a < 7; a ++){
		for (int k = 0; k < 3; k ++){
			for (int b = 0; b < width; b++){
				System.out.print(ESC+"48;2;"+172+";"+22+";"+44+"m ");
				}
			System.out.println("");
			}
		System.out.print("\n\n\n");
        }
	System.out.println("\u001b[H");	
	for (int c = 0; c < 21; c ++){
        for (int d = 0; d < width*3/7; d++){
          System.out.print(ESC+"48;2;"+60+";"+59+";"+110+"m ");
            }
		System.out.println("");
        }
	drawStars();
	System.out.print(ESC+"0m");
    }
	
  public static void main (String[] args){
	System.out.println(CLEAR_SCREEN);
	System.out.print("\u001b[H");
	myOutput();
	for (int i = 0; i < 30; i ++){
		System.out.println("");
	}
  }
	
}
