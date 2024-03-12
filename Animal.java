public class Animal
{
    private String name;

    public Animal (String nm)
    {
        name = nm;
    }

    // returns the name
    public String getName()
    {
        return name;
    }

    // sets the name
    public void setName(String newName)
    {
        name = newName;
    }

    // returns the info about the Animal
    public String toString()
    {
        return (name + " is an animal!");
    }

    // Makes a noise!
    public void speak()
    {
        System.out.println(name + " says Hi!");
    }
}