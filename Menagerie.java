// To demonstrate Inheritance

import java.util.ArrayList;

public class Menagerie {
  public static void main(String[] args) {
    
      ArrayList<Animal> menagerie = new ArrayList<Animal>();

      menagerie.add(new Hippo("Henrietta"));
//      menagerie.add(new Hedgehog("Chuck"));
//      menagerie.add(new Goose("Puddles"));
      menagerie.add(new Sheep("Stacy"));
      menagerie.add(new Chicken("Liam"));
//      menagerie.add(new Koala("Mabel"));
//      menagerie.add(new Snake("Slither"));
//      menagerie.add(new Tiger("Tigger"));
//      menagerie.add(new Capybara("Emmett"));
      menagerie.add(new Platypus("Perry"));
//      menagerie.add(new Lion("Leon"));
    
      for (Animal a : menagerie)
      {
          System.out.println(a);
          a.speak();
          System.out.println();
      }

  }

}