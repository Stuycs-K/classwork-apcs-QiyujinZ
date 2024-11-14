public class Animal {
  private String noise;
  private int age;
  private String name;

  public Animal(String noise, int age, String name){
<<<<<<< HEAD
    //initialize the values (hint use this.varname to clarify)
  }

  //2.
=======
    this.noise = noise;
    this.age = age;
    this.name = name;
  }


>>>>>>> 86d7f708b1ef2992c7cc6c8795f69bf4758f34ac
  /*speak() should print the following message replacing
  the ?'s with name/age/noise:
  My name is ?.
  I am ? years old.
  I say ?.

  Note: you MUST use getName() getNoise() here! You will see why later.
  */
  public void speak(){
<<<<<<< HEAD

=======
    System.out.println("My name is "+this.getName()+".");
    System.out.println("I am "+age+" years old.");
    System.out.println("I say "+this.getNoise()+".");
>>>>>>> 86d7f708b1ef2992c7cc6c8795f69bf4758f34ac
  }

  public String getName(){
    return name;
  }
  public String getNoise(){
    return noise;
  }
}
<<<<<<< HEAD


=======
>>>>>>> 86d7f708b1ef2992c7cc6c8795f69bf4758f34ac
