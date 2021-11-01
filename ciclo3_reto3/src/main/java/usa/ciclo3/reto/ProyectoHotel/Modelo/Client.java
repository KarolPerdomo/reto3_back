package usa.ciclo3.reto.ProyectoHotel.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Karol
 */
//{"name":"Agustin Parra","email":"agustin@gmail.com","password":"agustin123","age":18}
@Entity
@Table(name = "Client")
public class Client implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idClient;
  private String email;
  private String password;
  private String name;
  private Integer age;

  //relacion tabla mensajes
  @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
  @JsonIgnoreProperties({"messages", "client", "reservations"})//client
  public List<Message> messages;

  //relacion tabla reservacion
  @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "client")
  @JsonIgnoreProperties({"client", "reservations", "reservations"})
  public List<Reservation> reservations;

  public Integer getIdClient() {
    return idClient;
  }

  public void setIdClient(Integer idClient) {
    this.idClient = idClient;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }

  public List<Reservation> getReservations() {
    return reservations;
  }

  public void setReservations(List<Reservation> reservations) {
    this.reservations = reservations;
  }

}
