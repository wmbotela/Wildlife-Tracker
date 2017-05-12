import org.sql2o.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.Date;
import java.text.DateFormat;
import java.sql.Timestamp;

public class SightingTest {


  @Test
  public void sighting_instantiatesSighting_true() {
    Sighting newSighting = new Sighting(1, "Park", "Smith");
    assertEquals(true, newSighting instanceof Sighting);
  }

  @Test
  public void sighting_sightingRanger_String() {
    Sighting newSighting = new Sighting(1, "Park", "Smith");
    assertEquals("Smith", newSighting.getRanger());
  }

  @Test
  public void sighting_sightingLocation_String() {
    Sighting newSighting = new Sighting(1, "Park", "Smith");
    assertEquals("Park", newSighting.getLocation());
  }
}
