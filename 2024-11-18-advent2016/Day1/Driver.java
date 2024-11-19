import java.io.*;
import java.util.*;

public class Driver{  
  public static String getDirections(String Filename){
    int direction = 0;
    String directions = "";
    int right = 0;
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
        System.out.println(Arrays.toString(Directions));
      for (int i = 0; i < Directions.length; i ++){
        if(Directions[i].charAt(0) == 'R'){
          direction += 90;
          }
        else{
          direction -= 90;
        }
        
        if (direction % 360 == 0){
        north += Integer.parseInt(Directions[i].substring(1));
        }
        if (direction % 360 == 90){
        east += Integer.parseInt(Directions[i].substring(1));
        }
        if (direction % 360 == 180){
        south += Integer.parseInt(Directions[i].substring(1));
        }
        if (direction % 360 == 270){
        west += Integer.parseInt(Directions[i].substring(1));
        }
       }
       left = east - west;
       right = north - south;
       return ("east/west: " + left + "north/south: " + right+"");
      }
    catch(Exception e){
    
    }
    return "0";  
    }
  public static void main (String[] args){
    System.out.println(getDirections("inputTxt.txt"));
  }
}
