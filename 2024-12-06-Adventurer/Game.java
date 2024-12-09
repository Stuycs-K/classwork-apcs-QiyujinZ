import java.util.*;
import java.io.*;

public class Game{
  
  public static void main (String[] args){
    int pAction = 0;
    int eAction = 0;
    CodeWarrior Enemy = new CodeWarrior ("Enemy");
    Caster Player = new Caster ("Player");
    Scanner userInput = new Scanner (System.in);
    String input = userInput.nextLine();
    while (!(input.equals("quit"))){
      if(Player.getHP() == 0){
        System.out.println("The winner is" + Enemy.getName());
      }
      else if(Enemy.getHP() == 0){
        System.out.println("The winner is" + Player.getName());
      }
      else{
        System.out.println(Player.getName() + ", HP: " + Player.getHP() + "/" + Player.getmaxHP() + ", mana: " + Player.getSpecial() + "/" + Player.getSpecialMax());
        System.out.println(Enemy.getName() + ", HP: " + Enemy.getHP() + "/" + Enemy.getmaxHP() + ", mana: " + Enemy.getSpecial() + "/" + Enemy.getSpecialMax());
        if (pAction == eAction){
          pAction += 1;
          System.out.println(Player.getName() + ", it's your turn to action!");
          if (input.equals("a")|| input.equals("attack")){
            Player.attack(Enemy);
            }
          else if (input.equals("sp")||input.equals("special")){
            Player.specialAttack(Enemy);
          }
          else if (input.equals("su")||input.equals("support")){
            Player.support();
          }
          }
        else if (eAction < pAction){
          eAction += 1;
          System.out.println(Enemy.getName() + ", it's your turn to action!");
          }
        }
      }
    }
    }
