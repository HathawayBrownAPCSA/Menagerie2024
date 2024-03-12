public class Chicken extends Animal {
    
  EasySound voice = new EasySound("chicken.wav");
  
  public Chicken(String nm)
  {
      super(nm);
  }

  // Overriding the toString method
  public String toString()
  {
      return (getName() + " is a Chicken!");
    
  }
  public void speak()
  {
      System.out.println("cluck... cluck... cluckity cluck cluck!");
      voice.play();
  }
}