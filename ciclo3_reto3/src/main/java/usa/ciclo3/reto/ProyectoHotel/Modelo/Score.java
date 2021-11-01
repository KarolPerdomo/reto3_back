package usa.ciclo3.reto.ProyectoHotel.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Karol
 */
@Entity
@Table(name = "Score")
public class Score implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer score; // 0 A  5 
  private String message;

  @OneToOne
  @JsonIgnoreProperties("score")
  private Reservation reservations;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Reservation getReservations() {
    return reservations;
  }

  public void setReservations(Reservation reservations) {
    this.reservations = reservations;
  }

}
