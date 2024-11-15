import java.util.ArrayList;

public class ArrayListPractice
{
  public static ArrayList<String> createRandomArray(int size)
  {
    ArrayList<String> Random = new ArrayList<String>(size);

    for (int i = 0; i<size; i++)
    {
      Random.add(""+((int)(21*Math.random())));
      if (Random.get(i).equals("0"))
        Random.set(i, "");
    }

    return Random;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
    for (int i = 0; i < original.size() ; i ++ ) {
      if(original.get(i).equals("")){
        original.set(i,"Empty");
      }
    }
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
    ArrayList<String>reversed = new ArrayList<String>(original.size());
    for (int i = original.size()-1; i >= 0; i -- ) {
      reversed.add(original.get(i));
    }
    return reversed;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String> longer = new ArrayList<String>(0);
    ArrayList<String> shorter = new ArrayList<String>(0);
    ArrayList<String> mixed = new ArrayList<String>(0);
    if (a.size()>b.size())
    {
      longer = a;
      shorter = b;
    }
    else
    {
      longer = b;
      shorter = a;
    }

    for (int i = 0; i < shorter.size(); i ++ ) {
		mixed.add(a.get(i));
		mixed.add(b.get(i));
    }
	for (int i = shorter.size(); i < longer.size(); i ++) {
		mixed.add(longer.get(i));
	}
	return mixed;
  }

  public static void main(String[] args) {
    /*
    System.out.println(createRandomArray(5));
    System.out.println(createRandomArray(1));
    System.out.println(createRandomArray(0));
    System.out.println(createRandomArray(100));
    */
    /*
    //test replaceEmpty
    ArrayList<String> a1 = createRandomArray(100);
    System.out.println(a1);
    replaceEmpty(a1);
    System.out.println(a1);*/
	
    /*
    //test makeReversedList
    ArrayList<String> a2 = createRandomArray(100);
    System.out.println(a2);
    System.out.println(makeReversedList(a2));
	*/
	/*
	//test mixLists
	ArrayList<String>a3 = createRandomArray(10);
	ArrayList<String>b1 = createRandomArray(20);
	ArrayList<String>b2 = createRandomArray(10);
	replaceEmpty(a3);
	replaceEmpty(b1);
	replaceEmpty(b2);
	System.out.println(a3);
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(mixLists(a3,b1));
	System.out.println(mixLists(a3,b2));
	*/
	
  }
}
