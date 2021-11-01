package usa.ciclo3.reto.ProyectoHotel.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.ciclo3.reto.ProyectoHotel.Modelo.Client;
import usa.ciclo3.reto.ProyectoHotel.Repository.Crud.ClientCrud;

/**
 *
 * @author Karol
 */
@Repository
public class ClientRepository {

  @Autowired
  private ClientCrud objClientCrud;

  //Obtiene los clientes 
  public List<Client> getClients() {
    return (List<Client>) objClientCrud.findAll();
  }

  //obtiene el registro seleccionado
  public Optional<Client> getId(int id) {
    return objClientCrud.findById(id);
  }

  //guarda el cliente 
  public Client saveClient(Client objC) {
    return (Client) objClientCrud.save(objC);
  }

  //Agregue este metodo 4 
  public void delClient(Client objC) {
    objClientCrud.delete(objC);
  }

}
