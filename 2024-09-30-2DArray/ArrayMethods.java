// Qiyujinz@nycstudents.net Jason Zhang ;;; Owen Zeng owenz20@nycstudents.net
public class ArrayMethods{

  public static String arrToString (int[] nums){
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
      String newAry = "[";
      for (int i = 0; i < ary.length-1; i++){
        newAry += arrToString(ary[i]) + ", ";
      }
      if (ary.length != 0){
        newAry += arrToString(ary[ary.length-1]);
      }
      newAry += "]";
      return newAry;
    }

    /*Return the sum of all of the values in the 2D array */
    public static int arr2DSum(int[][]nums){
      //use a nested loop to solve this
      int sum = 0;
      for (int i = 0; i < nums.length; i ++){
        for (int j = 0; j < nums[i].length; j ++){
          sum += nums[i][j];
        }
      }
      return sum;
    }

    /**Rotate an array by returning a new array with the rows and columns swapped.
      * You may assume the array is rectangular and neither rows nor cols is 0.
      * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
      */
    public static int[][] swapRC(int[][]nums){
      int[][] newNums = new int[nums[0].length][nums.length];
      for (int i = 0; i < nums.length; i ++){
        for (int j = 0; j < nums[i].length; j ++){
          newNums[j][i] = nums[i][j];
        }
      }
      return newNums;
    }
    //3. Modify a given 2D array of integer as follows:
    //Replace all the negative values:
    //-When the row number is the same as the column number replace
    //that negative with the value 1
    //-All other negatives replace with 0
   public static void replaceNegative(int[][] vals){
        for( int i =0; i< vals.length; i++){
          for (int j = 0; j < vals[i].length; j++){
            if(vals[i][j] < 0 && i == j){
              vals[i][j] = 1;
            }
            if(vals[i][j] < 0 && i != j){
              vals[i][j] = 0;
            }
          }
        }
        System.out.println(arrToString(vals));
   }

    //4. Make a copy of the given 2d array.
    //When testing : make sure that changing the original does NOT change the copy.
    //DO NOT use any built in methods that "copy" an array.
    //You SHOULD write a helper method for this.
    //If you don't see a good way to do that, you should stop and look at prior methods.
    public static int[][] copy(int[][] nums){
      int [][] newNums = create2DArray(nums);
      int temp = 0;
      for (int i  = 0; i < nums.length; i ++){
        for (int j  = 0; j < nums[i].length; j ++){
          temp = nums[i][j];
          newNums[i][j] = temp;
        }
      }
      return newNums;
    }

    public static int[][] create2DArray(int[][] nums){
      int[][] newNums = new int[nums.length][];
      for (int i = 0; i < nums.length; i ++){
        newNums[i] = new int[nums[i].length];
      }
      return newNums;
  }

    public static void copyTest (int[][] nums){
      int[][] newNums = copy(nums);
      System.out.println(arrToString(newNums));
      replaceNegative(nums);
      System.out.println(arrToString(newNums));
}

    public static void main (String[] args){
        int[][] empty2D = new int[3][0]; // empty rows
        int[][] rectangular2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}}; // [4][3]
        int[][] square2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // [3][3]
        int[][] ragged2D = {{1, 2, 3, 4, 5, 6}, {7}, {8, 9}, {10, 11, 12, 13}}; // ragged with varying lengths
        int[][] negative2D = {{-1, -25, 25, 1}, {23, 34, -100, 0, -3}};
      int[][] arry1 = new int[][]{{0,1,2,3},{4,5,6,7},{8,9,10,11}};
      System.out.println(arrToString(arry1));
      System.out.println(arr2DSum(arry1));
      System.out.println(arrToString(swapRC(arry1)));
        // arrToString tests with 2D arrays
        System.out.println("String tests: ");
        System.out.println(arrToString(empty2D));
        System.out.println(arrToString(rectangular2D));
        System.out.println(arrToString(square2D));
        System.out.println(arrToString(ragged2D));

        // 2D sum tests
        System.out.println("Sum tests: ");
        System.out.println(arr2DSum(empty2D));
        System.out.println(arr2DSum(rectangular2D));
        System.out.println(arr2DSum(square2D));
        System.out.println(arr2DSum(ragged2D));

        // swapRC tests
        System.out.println("swapRC tests: ");
        System.out.println(arrToString(swapRC(empty2D)));
        System.out.println(arrToString(swapRC(rectangular2D)));
        System.out.println(arrToString(swapRC(square2D)));
        System.out.println(arrToString(swapRC(ragged2D))); // will create some arrays with 0 as other indexes because first array is larger.


        // copy array tests
        System.out.println("copy tests: ");
        copyTest(negative2D);

        // replace negative tests
        System.out.println("replaceNegative tests: ");
        replaceNegative(negative2D);
        replaceNegative(empty2D);
  }
}
