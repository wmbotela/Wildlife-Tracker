import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class NormalAnimalTest {


  @Test
  public void normalAnimal_instantiatesNewNormalAnimal_true() {
    NormalAnimal newNormalAnimal = new NormalAnimal("Cat");
    assertEquals(true, newNormalAnimal instanceof NormalAnimal);
  }

  @Test
  public void getName_normalAnimalInstantiatesWithName_Cat() {
    NormalAnimal newNormalAnimal = new NormalAnimal("Cat");
    assertEquals("Cat", newNormalAnimal.getName());
  }
}
