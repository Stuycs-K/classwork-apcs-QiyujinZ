public class Caster extends Adventurer{

  private int mana,manaMax;
  
  public Caster(String name, int hp, int mana){
    super(name,hp);
    this.mana = mana;
    this.manaMax = mana;
  }
  
  public Caster(String name){
	super(name,5);
    this.setSpecial(20);
    this.manaMax = 20;
  }
  
  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "mana";
  }
  //accessor methods
  public int getSpecial(){
    return mana;
    }
    
  public void setSpecial(int n){
    if (n > getSpecialMax()){
      setSpecial(getSpecialMax());
    }
    else 
      this.mana = n;
  }
  
  public int getSpecialMax(){
    return this.manaMax;
  }
  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    other.applyDamage(8);
    setSpecial(getSpecial()+3);
	return ("Opponent's HP:"+other.getHP() + "/" + other.getmaxHP()+"; Current HP: " + this.getHP() + "/"+ this.getmaxHP()
	+"; Current mana: " + this.getSpecial() + "/"+ this.getSpecialMax());
  }
  //heall or buff the target adventurer
  public String support(Adventurer other){
    if (other.getHP() + 3 < other.getmaxHP())
        other.setHP(other.getHP() + 3);
    else
        other.setHP(other.getmaxHP());
	return ("Ally's HP:"+other.getHP() + "/" + other.getmaxHP()+"; Current HP: " + this.getHP() + "/"+ this.getmaxHP()
	+"; Current mana: " + this.getSpecial() + "/"+ this.getSpecialMax());
  }
  //heall or buff self
  public String support(){
    this.setHP(this.getHP()+2);
    setSpecial(getSpecial()+7);
	return ("Current HP: " + this.getHP() + "/"+ this.getmaxHP()
	+"; Current mana: " + this.getSpecial() + "/"+ this.getSpecialMax());
  }
  
  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
	  other.setHP(other.getHP()/2);
	  this.setSpecial(0);
	  return ("Opponent's HP:"+other.getHP() + "/" + other.getmaxHP()+"; Current HP: " + this.getHP() + "/"+ this.getmaxHP()
	+"; Current mana: " + this.getSpecial() + "/"+ this.getSpecialMax());
  }
  
}
