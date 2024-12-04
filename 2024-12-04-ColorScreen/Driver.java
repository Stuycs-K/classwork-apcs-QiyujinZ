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
    
    public static void drawLines(int width){
      int interval = (width-2)/3;
      for (int i = 0; i < 3; i ++){
        go(3,11);
        color(background(BLUE)); 
        for (int j = 0; j < (width-interval*i)-2; j ++){
          System.out.print(" ");
        }
      }
    }
    
    public static void printInteger(int[] data, int width){
      System.out.print("\033[0m");
      int interval = (width-2)/3;
      for (int i = 0; i < 3; i ++){
        go(2,11);
        if (data[i] < 25)
            color(BRIGHT,RED);
        else if (data[i] > 75)
            color(BRIGHT,GREEN);
        else
            color(BRIGHT,WHITE);   
        for (int j = 0; j < (width-interval*(i+0.5))-4; j ++){
          System.out.print(" ");
          }
          System.out.print(data[i]);
        }
      }
    
    public static int[]randomList (int size){
        int[] numList = new int[size];
        for (int i = 0; i < size; i ++){
            numList[i] = (int) (Math.random()*100);
        } 
        return numList;
      }
      
    public static void drawRainbow(){
        go(0,0);
        int startx = 34; 
        int starty = 18;
        for (int i = 0; i < 6; i ++){
          go(startx,starty);
          if (i == 0)
            color(background(RED));
          if (i == 1)
            color(background(YELLOW));
          if (i == 2)
            color(background(GREEN));
          if (i == 3)
            color(background(CYAN));
          if (i == 4)
            color(background(BLUE));
          if (i == 5)
            color(background(MAGENTA));
          for (int j = 0; j < 3; j ++){
            System.out.print("  ");
            go(starty+1,startx+2);
          }
          for (int k = 0; k < 3; k ++){
            System.out.print("  ");
            go(starty-1,startx+2);
          }
          starty-=1;
        }
    }
    
    public static void main (String[] args){
        System.out.print(CLEAR_SCREEN);
        System.out.print(HIDE_CURSOR);
        go(0,0);
        drawBorder(30,80);
        go(0,0);
        int[] numbers = randomList(3);
        drawLines(80);
        printInteger(numbers,80);
        drawRainbow();
        System.out.println(RESET);
        go(31,0);
  }
}













