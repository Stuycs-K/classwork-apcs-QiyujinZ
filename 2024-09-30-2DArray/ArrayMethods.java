// Qiyujinz@nycstudents.net Jason Zhang ;;; Owen Zeng owenz20@nycstudents.net
public class ArrayMethods{

  public static String aryToString (int[] nums){
    String aryContent = "[";
    for (int i = 0; i < nums.length-1; i ++){
      aryContent += nums[i] + ", ";
    }
    if (nums.length != 0)
      aryContent += nums[nums.length-1];
    aryContent += "]";
    return aryContent;
  }
      //3. Write arrToString, with a 2D array parameter.
    //Note: Different parameters are allowed with the same function name.
    /**Return a String that represets the 2D array in the format:
      * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
      * Note the comma+space between values, and between arrays
      * You are encouraged to notice that you may want to re-use
      * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
      */
    public static String arrToString(int[][]ary){
      //this should use arrToString(int[])
      
      String ans = "[";
      
      for (int i = 0; i < ary.length-1; i++){
        ans += aryToString(ary[i]) + ", ";
      }
      if (ary.length != 0){
        ans += ary[ary.length-1];       
      }
      ary += "]";
      return ans;
    }

    /*Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][]nums){
      //use a nested loop to solve this
      int[][] ans = new int[][]{}
    }

    /**Rotate an array by returning a new array with the rows and columns swapped.
      * You may assume the array is rectangular and neither rows nor cols is 0.
      * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
      */
    public static int[][] swapRC(int[][]nums){
      return new int[1][1];
    }
    
    public static void main (String[] args){
    
  }
}

