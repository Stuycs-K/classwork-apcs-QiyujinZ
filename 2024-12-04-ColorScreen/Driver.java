import java.util.*;
import java.io.*;

public class Driver extends Text{

    public static void drawBorder(int height, int width){
        for (int j = 0; j < height; j ++){
            System.out.print("         ");
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
        //System.out.print("\n\n\n\n");
    }
    
    public static void drawIntegers(int[] data, int width){
      System.out.println("");
      System.out.print("..........");
    }
    
    public static int[]randomList (int size){
        int[] numList = new int[size];
        for (int i = 0; i < size; i ++){
            numList[i] = (int) (Math.random()*100);
        } 
        return numList;
      }
      
      
    public static void main (String[] args){
        System.out.print(CLEAR_SCREEN);
        System.out.print(HIDE_CURSOR);
        go(0,0);
        drawBorder(30,80);
        go(0,0);
        int[] numbers = randomList(3);
        drawIntegers(numbers,80);
        System.out.println(RESET);
        for (int i = 0; i < 35; i ++){
          System.out.print("\n");
        }
  }
}













