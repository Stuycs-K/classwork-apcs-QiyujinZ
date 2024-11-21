import java.io.*;
import java.util.*;

public class Part1{
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
	
	public static String processLine(String line,int lastDigit){
		int number = lastDigit;
		//System.out.println(number);
		//System.out.println(line);
		for (int i = 0; i < line.length(); i++){
			if (line.substring(i,i+1).equals("L")&&(!(number == 1 || number == 4 || number == 7))){
				number -= 1;
			}
			if (line.substring(i,i+1).equals("R")&&(!(number == 3 || number == 6 || number == 9))){
				number += 1;
			}
			if (line.substring(i,i+1).equals("U")&&(!(number == 1 || number == 2 || number == 3))){
				number -= 3;
			}
			if (line.substring(i,i+1).equals("D")&&(!(number == 7 || number == 8 || number == 9))){
				number += 3;
			}
			if (number> 9 || number < 1){
				return ("Error: code broken. number: " + number);
			}
			//System.out.println(number);
		}
		//System.out.println("the number for this line is: " + number);
		//System.out.println("===================== end of line =====================");
		return ""+number;
	}
	
	public static void main (String[] args){
		ArrayList<String> Data = processData("input.txt");
		int Number = 5;
		for (int i = 0; i < Data.size(); i ++){
			System.out.println(processLine(Data.get(i),Number));
			Number = Integer.parseInt(processLine(Data.get(i),Number));
		}
	}
}












