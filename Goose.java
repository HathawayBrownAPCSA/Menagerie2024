public class Goose extends Animal
{
    EasySound voice = new EasySound("ate.wav");
  
    public Goose(String nm)
    {
        super(nm);
    }

    // Overriding the toString method
    public String toString()
    {
        return (getName() + " is a Goose!");
    }

    //Override the speak method
    public void speak()
    {
        System.out.println("Hoooonkk"); 
        voice.play();
    }
}