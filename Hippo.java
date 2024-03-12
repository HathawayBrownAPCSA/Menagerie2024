public class Hippo extends Animal
{
    public Hippo(String nm)
    {
        super(nm);
    }

    // Overriding the toString method
    public String toString()
    {
        return (getName() + " is a Hippo!");
    }

    // Overriding the speak method
    public void speak()
    {
        super.speak();
        System.out.println("Whee ... wheee. .. WHEEEEZZZEEE!");
    }
}