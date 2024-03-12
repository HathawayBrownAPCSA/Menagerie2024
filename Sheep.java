public class Sheep extends Animal
{
    EasySound voice = new EasySound("sheep.wav");
    public Sheep(String nm)
    {
        super(nm);
    }

    // Overriding the toString method
    public String toString()
    {
        return (getName() + " is a Sheep!");
    }

    public void speak()
    {
      System.out.println("Baaaaah!");
      voice.play();
    }
}