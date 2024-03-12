public class Platypus extends Animal
{
  EasySound voice = new EasySound("ate.wav");
  
  public Platypus(String nm)
  {
    super(nm);
  }

  public String toString()
  {
    return (getName() + " is a Platypus!");
  }

  public void speak()
  {
    System.out.println("*growls*");
    voice.play();
  }
}