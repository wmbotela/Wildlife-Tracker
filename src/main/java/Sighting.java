import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;
import java.sql.Timestamp;

public class Sighting {

  private int id;
  private int animal_id;
  private String location;
  private String ranger;
  private Timestamp date_sighted;

  // Object Constructor

  public Sighting(int animal_id, String location, String ranger) {
    this.animal_id = animal_id;
    this.location = location;
    this.ranger = ranger;
  }

  // Getters/Setters

  public int getId() {
    return id;
  }

  public int getAnimalId() {
    return animal_id;
  }

  public String getLocation() {
    return location;
  }

  public String getRanger() {
    return ranger;
  }

  public Timestamp getDateSighted() {
    return date_sighted;
  }
}
