package usa.ciclo3.reto.ProyectoHotel.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.ciclo3.reto.ProyectoHotel.Modelo.Message;
import usa.ciclo3.reto.ProyectoHotel.Repository.MessageRepository;

/**
 *
 * @author Karol
 */
@Service
public class MessageService {

  @Autowired
  private MessageRepository objMessageRepository;

  //
  public List<Message> getMessages() {
    return objMessageRepository.getMessages();
  }

  public Optional<Message> getId(int id) {
    return objMessageRepository.getId(id);
  }

  //
  public Message saveMesage(Message objM) {
    if (objM.getIdMessage() == null) {
      return objMessageRepository.saveMessage(objM);
    } else {
      Optional<Message> auxMes = objMessageRepository.getId(objM.getIdMessage());

      if (auxMes.isEmpty()) {
        return objMessageRepository.saveMessage(objM);
      } else {
        return objM;
      }
    }
  }

  //Reto 4 
  public Message updateMessage(Message objM) {
    if (objM.getIdMessage() != null) { //Verifica si el id no está vacío

      //Crea un auxiliar en el que se guarda el id del elemento
      Optional<Message> auxMessage = objMessageRepository.getId(objM.getIdMessage());

      //Verifica que el id no sea vacío
      if (!auxMessage.isEmpty()) {

        if (objM.getMessageText() != null) {
          auxMessage.get().setMessageText(objM.getMessageText());
        }

        //Tablas relacionadas 
        if (objM.getRoom() != null) {
          auxMessage.get().setRoom(objM.getRoom());
        }

        if (objM.getClient() != null) {
          auxMessage.get().setClient(objM.getClient());
        }

        //Guarda el valor actual
        objMessageRepository.saveMessage(auxMessage.get());

        //Retorna el valor 
        return auxMessage.get();
      } else {
        return objM;
      }
    } else {
      return objM;
    }
  }

  public Boolean delMessage(Integer id) {
    Boolean objEliminar = getId(id).map(Message -> {
      objMessageRepository.delMessage(Message);
      return true;
    }).orElse(false);
    return objEliminar;
  }

}
