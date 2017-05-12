import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class EndangeredAnimalTest {


  @Test
  public void endangeredAnimal_instantiatesNewEndangeredAnimal_true() {
    EndangeredAnimal newEndangeredAnimal = new EndangeredAnimal("Bison", "good", 3);
    assertEquals(true, newEndangeredAnimal instanceof EndangeredAnimal);
  }

  @Test
  public void getName_endangeredAnimalInstantiatesWithName_Bison() {
    EndangeredAnimal newEndangeredAnimal = new EndangeredAnimal("Bison", "good", 3);
    assertEquals("Bison", newEndangeredAnimal.getName());
  }

  @Test
  public void getHealth_endangeredAnimalHealth_good() {
    EndangeredAnimal newEndangeredAnimal = new EndangeredAnimal("Bison", "good", 3);
    assertEquals("good", newEndangeredAnimal.getHealth());
  }

  @Test
  public void getAge_endangeredAnimalAge_3() {
    EndangeredAnimal newEndangeredAnimal = new EndangeredAnimal("Bison", "good", 3);
    assertEquals(3, newEndangeredAnimal.getAge());
  }
}
