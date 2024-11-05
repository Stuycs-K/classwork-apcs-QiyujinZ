import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class TriangleTester{
    public static int countTrianglesA(String filename){
    int count = 0; 
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
		Scanner line = new Scanner(input.nextLine());
		//System.out.println(""+line.nextInt()+line.nextInt()+line.nextInt());   get rid of later
		count += isTriangle(line.nextInt(),line.nextInt(),line.nextInt());
        }
      input.close();
	  return count; 

    }catch (FileNotFoundException ex) {
      System.out.println("File not found");
      return -1;
      } 
	}
    
	public static int countTrianglesB(String filename){
	int count = 0;
	try{
		File file = new File(filename);
		Scanner input = new Scanner(file);
		ArrayList<String[]> group = new ArrayList<String[]>(20);
		while(input.hasNextLine()){
			group.add(input.nextLine().split("  "));
		}
		/*
		for (int i = 0; i < group.size(); i ++){
			System.out.println(group.get(i));
		}
		*/
		for(int i = 0; i < group.size(); i += 3){
			count += isTriangle(Integer.valueOf(group.get(i)[0]), Integer.valueOf(group.get(i+1)[0]),Integer.valueOf(group.get(i+2)[0]));
			count += isTriangle(Integer.valueOf(group.get(i)[1]), Integer.valueOf(group.get(i+1)[1]),Integer.valueOf(group.get(i+2)[1]));
			count += isTriangle(Integer.valueOf(group.get(i)[2]), Integer.valueOf(group.get(i+1)[2]),Integer.valueOf(group.get(i+2)[2]));
			}
		return count;
	}catch (FileNotFoundException ex) {
		System.out.println("File not found");
		return -1;
	}
	}
	
	
    public static int isTriangle(int a, int b,int c){
    if (a+b>c && a+c>b && b+c>a)
      return 1;
    return 0;
    }
    
    public static void main (String[] args){
      System.out.println(countTrianglesA("inputTri.txt"));
      System.out.println(countTrianglesB("inputTri.txt"));
	  
  } 
}
