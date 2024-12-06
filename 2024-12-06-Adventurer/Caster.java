public class Caster extends Adventurer{

  private int mana,manaMax;
  
  public Caster(String name){
    Caster(name,5,20);
  }
  
  public Caster(String name, int hp, int mana){
    super(name,hp);
    this.mana = mana;
    this.manaMax = mana;
  }
  
  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "Caster";
  }
  //accessor methods
  public int getSpecial(){
    return mana;
    }
    
  public void setSpecial(int n){
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
  }
  //heall or buff the target adventurer
  public String support(Adventurer other);
    if (other.getHP() + 3 < other.getmaxHP())
        other.setHp(other.getHP() + 3);
    else
        other.setHp(other.getmaxHP());
    
  //heall or buff self
  public String support();
    this.setHP (this.getHp());
    
  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other);
  
}
