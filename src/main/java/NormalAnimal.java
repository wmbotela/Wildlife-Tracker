import java.util.List;
import java.util.ArrayList;
import org.sql2o.*;

public class NormalAnimal extends Animal {

  public static final String isEndangered = "no";

  // Constructor

  public NormalAnimal(String name) {
    this.name = name;
    endangered = isEndangered;
  }
}
