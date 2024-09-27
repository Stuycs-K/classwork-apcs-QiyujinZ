public class MyArrays{

  public static String aryToString (int[] nums){
    String aryContent = "["
    for (int i = 0; i < nums.length-1; i ++){
      aryContent += nums[i] + ", ";
    }
    if (nums.length != 0)
      aryContent += nums[length-1];
    aryContent += "]";
    return aryContent;
  }
  
  public static int[] returnCopy(int[]ary){
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i ++){
      newAry[i] = ary[i];
    }
    return newAry;
  }
  
  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] newAry = new int[ary1.length + ary2.length];
    int index = 0;
    for (int i = 0; i < ary1.length; i ++){
      newAry[index] = ary1[i];
      index += 1;
    }
    for (int i = 0; i < ary2.length; i ++){
      newAry[index] = ary2[i];
      index += 1; 
    }
    return newAry;
  }
  
  public static void main[Str[] args]{
    int[] array1 = new int[] {0,1,2,3,4,5,6,7,8,9,10};
    System.out.println(array1 == returnCopy(array1));
    String[] arrayStr = new String[] {"a","b","c","d","e","f","g"};
    System.out.println(arrayStr == returnCopy(arrayStr));
    String[] arrayEmpty = new String[0];
    System.out.println(arrayEmpty == returnCopy(arrayEmpty));
    int[] array2 = new int[] {11,12,13,14,15,16};
    System.out.println(concatArray(array1,array2))
  }
}
