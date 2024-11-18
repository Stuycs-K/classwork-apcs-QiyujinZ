import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver{
  private int direction = 0;
  
  public static int getDirections(String Filename){
    String directions = "";
    try{
      File file = new File(Filename);
      Scanner input = new Scanner(file);
      while(input.hasNext()){
        directions += input.next(); 
      }
      
      
    }
  }
  public static void main (String[] args){
    
  }
}
