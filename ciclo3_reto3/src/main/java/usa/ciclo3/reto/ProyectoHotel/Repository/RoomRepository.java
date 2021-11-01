package usa.ciclo3.reto.ProyectoHotel.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.ciclo3.reto.ProyectoHotel.Modelo.Room;
import usa.ciclo3.reto.ProyectoHotel.Repository.Crud.RoomCrud;

/**
 *
 * @author Karol
 */
@Repository
public class RoomRepository {

  @Autowired
  private RoomCrud objRoomCrud;

  //Obtiene los registro de la tabla 
  public List<Room> getRooms() {
    return (List<Room>) objRoomCrud.findAll();
  }

  //obtiene el id seleccionado 
  public Optional<Room> getId(int id) {
    return objRoomCrud.findById(id);
  }

  //guardas la habitacion 
  public Room saveRoom(Room objR) {
    return objRoomCrud.save(objR);
  }

  //Agregue este metodo 4 
  public void delRoom(Room objR) {
    objRoomCrud.delete(objR);
  }
}
