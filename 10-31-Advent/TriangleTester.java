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
      while (input.hasNextInt()){
		//System.out.println(""+line.nextInt()+line.nextInt()+line.nextInt());   get rid of later
		count += isTriangle(input.nextInt(),input.nextInt(),input.nextInt());
		input.nextLine();
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
		int index = 0;
		ArrayList<int[]> group = new ArrayList<int[]>();
		while(input.hasNextInt()){
	    for (int i = 0; i < 3; i ++){
			group.add(new int[3]);
		}
		for (int i = 0; i < 3; i ++){
			group.get(index+0)[i] = input.nextInt();
			group.get(index+1)[i] = input.nextInt();
			group.get(index+2)[i] = input.nextInt();
			input.nextLine();
		}
		index += 3;
		}
		for(int i = 0; i < group.size(); i += 3){
			count += isTriangle(group.get(i)[0],group.get(i)[1],group.get(i)[2]);
			count += isTriangle(group.get(i+1)[0],group.get(i+1)[1],group.get(i+1)[2]);
			count += isTriangle(group.get(i+2)[0],group.get(i+2)[1],group.get(i+2)[2]);
			}
		return count;
	}catch (FileNotFoundException ex) {
		System.out.println("File not found");
		return -1;
	}
	}
	
	
    public static int isTriangle(int a, int b, int c){
    if (a+b>c && a+c>b && b+c>a)
      return 1;
    return 0;
    }
    
    public static void main (String[] args){
      System.out.println(countTrianglesA("inputTri.txt"));
      System.out.println(countTrianglesB("inputTri.txt"));
      System.out.println("Second Test");
	  
  } 
}
