import java.io.*;
import java.util.*;

public class Part2{  
  public static int getDirections(String Filename){
    int direction = 0;
    String directions = "";
    String point = "";
    int horizontal = 0;
    int vertical = 0;
    ArrayList<String> Coordinates = new ArrayList<String>(200);
    try{
      File file = new File(Filename);
      Scanner input = new Scanner(file);
      while(input.hasNext()){
        directions += input.next();
        }
      String Directions[] = directions.split(",");
      for (int i = 0; i < Directions.length; i ++){
        if(Directions[i].charAt(0) == 'R'){
          direction += + 360 + 90;
          }
        if(Directions[i].charAt(0) == 'L'){
          direction += 360 - 90;
        }
        
        if (Math.abs(direction) % 360 == 0){
        vertical += Integer.parseInt(Directions[i].substring(1));
        }
        if (Math.abs(direction) % 360 == 90){
        horizontal += Integer.parseInt(Directions[i].substring(1));
        }
        if (Math.abs(direction) % 360 == 180){
        vertical -= Integer.parseInt(Directions[i].substring(1));
        }
        if (Math.abs(direction) % 360 == 270){
        horizontal -= Integer.parseInt(Directions[i].substring(1));
        }
        point = "";
        point = "("+horizontal+","+vertical+")";
        System.out.println(point);
        for (int j = 0; j < Coordinates.size(); i++){
          if (Coordinates.get(j).equals(point)){
            return (Math.abs(horizontal)+Math.abs(vertical));
          }
        }
        Coordinates.add(point);
       }
      }
    catch(Exception e){
    
      } 
      return -1;
    }
  public static void main (String[] args){
    System.out.println(getDirections("inputTxt.txt"));
  }
  
  
  
  
  
  
  
  
  
  
}
