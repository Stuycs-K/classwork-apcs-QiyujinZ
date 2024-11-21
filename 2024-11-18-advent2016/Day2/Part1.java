import java.io.*;
import java.util.*;

public class Part1{
	public static ArrayList<String> processData(String Filename){
		int lines = 0;
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
		}
		catch(Exception e){
			
		}
		return null;
	}
	
	public static void main (String[] args){
		processData("input.txt");
	}
}












