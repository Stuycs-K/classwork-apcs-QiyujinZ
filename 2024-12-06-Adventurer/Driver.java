public class Driver{
  
  public static void main(String[] args){
    Caster Alpha = new Caster("Alpha");
    Caster Bravo = new Caster("Bravo",10,30);
	System.out.println(Alpha.attack(Bravo));
	System.out.println(Alpha.support(Bravo));
  }
}
