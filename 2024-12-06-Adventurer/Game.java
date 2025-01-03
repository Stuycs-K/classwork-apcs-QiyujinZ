import java.util.*;
import java.io.*;

public class Game{
  
  public static void main (String[] args){
    int pAction = 0;
    int eAction = 0;
    CodeWarrior Enemy = new CodeWarrior ("Enemy");
    Caster Player = new Caster ("Player");
    System.out.println("Hello! This is a fun RPG. Your mission is to beat your enemy. type 'a' or 'attack' to attack. type 'sp' or 'special' to do special Attack. type 'su' or 'support' to recover HP and mana. type 'quit' to quit. ");
    System.out.println(Player.getName() + ", HP: " + Player.getHP() + "/" + Player.getmaxHP() + ", mana: " + Player.getSpecial() + "/" + Player.getSpecialMax());
    System.out.println(Enemy.getName() + ", HP: " + Enemy.getHP() + "/" + Enemy.getmaxHP() + ", mana: " + Enemy.getSpecial() + "/" + Enemy.getSpecialMax() + "\n");
    while (true){
      if(Player.getHP() <= 0){
        System.out.println("The winner is " + Enemy.getName());
        break;
      }
      else if(Enemy.getHP() <= 0){
        System.out.println("The winner is " + Player.getName());
        break;
      }
      System.out.println(Player.getName() + ", it's your turn to action!");
      Scanner userInput = new Scanner (System.in);
      String input = userInput.nextLine();
      if (input.equals("quit")||input.equals("quit ")){
        break;
      }
      else{
          if (input.equals("a")|| input.equals("attack")){
            System.out.println(Player.attack(Enemy));
            }
          else if (input.equals("sp")||input.equals("special")){
            System.out.println(Player.specialAttack(Enemy));
          }
          else if (input.equals("su")||input.equals("support")){
            System.out.println(Player.support());
          }
          else{
            System.out.println("\nThat is not a valid option! As a reminder: type 'a' or 'attack' to attack. type 'sp' or 'special' to do special Attack. type 'su' or 'support' to recover HP and mana. type 'quit' to quit. ");
          }
          System.out.println("\n"+Enemy.getName() + ", it's your turn to action!");
          int option = (int) Math.random()*3;	
            if (option == 1){
              System.out.println(Enemy.attack(Player));
            }
            else if (option == 2){
              System.out.println(Enemy.specialAttack(Player));
            }
            else if (option == 0){
              System.out.println(Enemy.support());
            }
          System.out.println(Player.getName() + ", HP: " + Player.getHP() + "/" + Player.getmaxHP() + ", mana: " + Player.getSpecial() + "/" + Player.getSpecialMax());
          System.out.println(Enemy.getName() + ", HP: " + Enemy.getHP() + "/" + Enemy.getmaxHP() + ", mana: " + Enemy.getSpecial() + "/" + Enemy.getSpecialMax()+"\n");
        }
      }
    }
    }
