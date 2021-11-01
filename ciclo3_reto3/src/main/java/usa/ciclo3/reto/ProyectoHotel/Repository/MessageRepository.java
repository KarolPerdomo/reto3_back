package usa.ciclo3.reto.ProyectoHotel.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.ciclo3.reto.ProyectoHotel.Modelo.Message;
import usa.ciclo3.reto.ProyectoHotel.Repository.Crud.MessageCrud;

/**
 *
 * @author Karol
 */
@Repository
public class MessageRepository {

  @Autowired
  private MessageCrud objMessageCrud;

  //
  public List<Message> getMessages() {
    return (List<Message>) objMessageCrud.findAll();
  }

  // 
  public Optional<Message> getId(int id) {
    return objMessageCrud.findById(id);
  }

  //
  public Message saveMessage(Message objM) {
    return objMessageCrud.save(objM);
  }

  //Agregue este metodo 4 
  public void delMessage(Message objM) {
    objMessageCrud.delete(objM);
  }
}
