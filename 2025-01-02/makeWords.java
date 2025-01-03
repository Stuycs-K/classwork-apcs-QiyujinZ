public class makeWords{

  public static void makeWords(int remainingLetters, String result, String alphabet){
    System.out.println(result);
    if(remainingLetters > 0){
      for (int i = 0; i < alphabet.length(); i ++){
        makeWords(remaingingLetters-1,result+alphabet.substring(i,i+1),alphabet);
      }
    }
  }
  
  
  public static void main(String[] args){
    makeWords(args[1],args[2],args[3]);
  }
}
