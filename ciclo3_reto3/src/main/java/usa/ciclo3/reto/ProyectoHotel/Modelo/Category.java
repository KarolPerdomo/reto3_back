package usa.ciclo3.reto.ProyectoHotel.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Karol
 */
//{"name":"cat1","description":"test category"} ({"room", "category"}) 
@Entity
@Table(name = "Category")
public class Category implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String description;

  //  Relacion con la tabla Room o habitaciones 
  @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "category")
  @JsonIgnoreProperties({"rooms"})// "category",
  public List<Room> rooms; //Guardo las habitaciones de la relacion 

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<Room> getRooms() {
    return rooms;
  }

  public void setRooms(List<Room> rooms) {
    this.rooms = rooms;
  }

}
