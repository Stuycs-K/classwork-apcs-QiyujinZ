import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Driver{
  private int direction = 0;
  
  public static int getDirections(String Filename){
    String directions = "";
    int right = 0
    int left = 0;
    int north = 0;
    int south = 0;
    int east = 0;
    int west = 0;
    try{
      File file = new File(Filename);
      Scanner input = new Scanner(file);
      while(input.hasNext()){
        directions += input.next();
        }
      String Directions[] = directions.split(",");
      for (int i = 0; i < Directions.length; i ++){
        if(Directions[i].charAt(0) == 'R'){
          direction += 90;
          }
        else{
          direction -= 90;
        }
        
        if (direction % 360 = 0){
        north += (int) Directions[i].substring(1);
        }
        if (direction % 360 = 90){
        east += (int) Directions[i].substring(1);
        }
        if (direction % 360 = 180){
        south += (int) Directions[i].substring(1);
        }
        if (direction % 360 = 270){
        west += (int) Directions[i].substring(1);
        }
        }
        }
      }
      
      
    }
  }
  public static void main (String[] args){
    
  }
}
