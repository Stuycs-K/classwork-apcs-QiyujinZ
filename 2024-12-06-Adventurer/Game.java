import java.util.*;
import java.io.*;

public class Game{
  
  public static void main (String[] args){
    int pAction, eAction = 0;
    CodeWarrior Enemy = new CodeWarrior ("Enemy");
    Caster Player = new Caster ("Player");
    
    Scanner userInput = new Scanner (System.in);
    String input = userInput.nextLine();
    while (!(input.equals("quit"))){
      if(Player.getHP() == 0){
        System.out.println("The winner is" + Enemy.getName());
      }
      if(Enemy.getHP() == 0){
        System.out.println("The winner is" + Player.getName());
      }
      else{
         if (pAction == eAction){
           pAction += 1;
           System.out.println(Player.getName() + ", it's your turn to action!");
           
         }
      }
    }
    }
  }
