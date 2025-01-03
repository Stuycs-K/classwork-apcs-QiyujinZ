public class makeWords{

  public static void makeWords(int remainingLetters, String result, String alphabet){
    System.out.println(result);
    if(remainingLetters > 0){
      for (int i = 0; i < alphabet.length(); i ++){
        makeWords(remainingLetters-1,result+alphabet.substring(i,i+1),alphabet);
      }
    }
  }
  
  
  public static void main(String[] args){
    makeWords(Integer.valueOf(args[0]),args[1],args[2]);
  }
}
