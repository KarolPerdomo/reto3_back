package usa.ciclo3.reto.ProyectoHotel.Modelo;

/**
 *
 * @author Karol
 */
public class TopClient {

  //variables
  private Long total;
  private Client client;

  public TopClient(Long total, Client client) {
    this.total = total;
    this.client = client;
  }

  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

}
