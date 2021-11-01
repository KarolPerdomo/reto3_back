package usa.ciclo3.reto.ProyectoHotel.Repository.Crud;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import usa.ciclo3.reto.ProyectoHotel.Modelo.Reservation;

/**
 *
 * @author Karol
 */
public interface ReservationCrud extends CrudRepository<Reservation, Integer> {

  //buscar todo por fecha de inicio después y fecha de inicio antes
  public List<Reservation> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);

  //Cantidad de reservas completas vs canceladas.
  public List<Reservation> findAllByStatus(String status);

  //Top de los clientes que más dinero le han dejado a la compañía
  //SELECT clientid, COUNT(*) AS total FROM reservacion group by clientid order by desc;
  @Query("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client)DESC")
  public List<Object[]> countTotalReservationsByClient();

}
