import java.io.*;
import java.util.*;

public class Part2{
	public static ArrayList<String> processData(String Filename){
		ArrayList<String> Data = new ArrayList<String>(0);
		try{
			File file = new File (Filename);
			Scanner input = new Scanner(file);
			while (input.hasNext()){
				Data.add(input.nextLine());
			}
			for (int i = 0; i < Data.size(); i ++){
				System.out.println(Data.get(i));
			}
			return Data;
			
		}
		catch(Exception e){
			
		}
		return null;
	}
	

	public static String processLine(String line,String lastDigit){
		int button = Integer.parseInt(lastDigit);
		int change = 0;
		//System.out.println(line);
		for (int i = 0; i < line.length(); i++){
			change = 0;
			if (line.substring(i,i+1).equals("L")&&(!(button == 1 || button == 2 || button == 5 || button == 65/*ASCII value of 'A'*/ || button == 68))){
				change -= 1;
			}
			if (line.substring(i,i+1).equals("R")&&(!(button == 1 || button == 4 || button == 9 || button == 67/*ASCII value of 'C'*/ || button == 68))){
				change += 1;
			}
			if (line.substring(i,i+1).equals("U")&&(!(button == 1 || button == 2 || button == 5 || button == 4 || button == 9))){
				if (button == 65 || button == 66 || button ==67){
					change -= 59;
				}
				if (button == 3 || button == 68){
					change -= 2;
				}
				if (button == 6||button == 7||button == 8){
					change -= 4;
				}
			}
			if (line.substring(i,i+1).equals("D")&&(!(button == 5 || button == 9 || button == 65 || button == 67 || button == 68))){
				if (button == 6 || button == 7 || button ==8){
					change += 59;
				}
				if (button == 1 || button == 66){
					change += 2;
				}
				if (button == 2||button == 3||button == 4){
					change += 4;
				}
			}
			button += change;
			if (button>10&& button<65 || button > 68){
				return ("Error: this number is:  "+button);
			}
		}
		//System.out.println("the button for this line is: " + button);
		//System.out.println("===================== end of line =====================");
		return ""+button;
	}
	
	public static void main (String[] args){
		ArrayList<String> Data = processData("input.txt");
		String button = "5";
		for (int i = 0; i < Data.size(); i ++){
			System.out.println(processLine(Data.get(i),button));
			button = processLine(Data.get(i),button);
			System.out.println("END OF LINE");
		}
	}
}












