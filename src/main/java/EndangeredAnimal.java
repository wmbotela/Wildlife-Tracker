import java.util.List;
import java.util.ArrayList;


public class EndangeredAnimal extends Animal {
  private String health;
  private int age;

  public static final String Good = "good";
  public static final String Poor = "poor";
  public static final String isEndangered = "yes";

  // Object Constructor

  public EndangeredAnimal(String name, String health, int age) {
    this.name = name;
    this.health = health;
    this.age = age;
    endangered = isEndangered;

  }

  // Getters/Setters

  public String getHealth() {
    return health;
  }

  public int getAge() {
    return age;
  }
}
