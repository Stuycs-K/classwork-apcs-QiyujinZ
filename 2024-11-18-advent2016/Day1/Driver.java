import java.io.*;
import java.util.*;

public class Driver{  
  public static int getDirections(String Filename){
    int direction = 0;
    String directions = "";
    int right = 0;
    int left = 0;
    int north = 0;
    int south = 0;
    int east = 0;
    int west = 0;
    int count = 0;
    try{
      File file = new File(Filename);
      Scanner input = new Scanner(file);
      while(input.hasNext()){
        directions += input.next();
        }
      String Directions[] = directions.split(",");
        System.out.println(Arrays.toString(Directions));
        System.out.println(Directions.length);
      for (int i = 0; i < Directions.length; i ++){
        if(Directions[i].charAt(0) == 'R'){
          direction += + 360 + 90;
          }
        if(Directions[i].charAt(0) == 'L'){
          direction += 360 - 90;
        }
        System.out.println(Math.abs(direction % 360));
        
        if (Math.abs(direction) % 360 == 0){
        north += Integer.parseInt(Directions[i].substring(1));
        }
        if (Math.abs(direction) % 360 == 90){
        east += Integer.parseInt(Directions[i].substring(1));
        }
        if (Math.abs(direction) % 360 == 180){
        south += Integer.parseInt(Directions[i].substring(1));
        }
        if (Math.abs(direction) % 360 == 270){
        west += Integer.parseInt(Directions[i].substring(1));
        }
        count += 1;
        System.out.println("North: "+north + "  South: "+south+"  East: "+east+"  West: "+west+" Count: " + count);
       }
       left = Math.abs(east - west);
       right = Math.abs(north - south);
       return (left+right);
      }
    catch(Exception e){
    
      } 
      return 0;
    }
  public static void main (String[] args){
    System.out.println(getDirections("inputTxt.txt"));
        System.out.println(0%360);
    System.out.println(90%360);
    System.out.println(180%360);
    System.out.println(270%360);
    System.out.println(450%360);
    System.out.println(360%360);
    System.out.println(Math.abs(-90)%360);
    System.out.println(-180%360);
    System.out.println(-270%360);
    System.out.println(-450%360);
    System.out.println(-360%360);
  }
  
  
  
  
  
  
  
  
  
  
}
