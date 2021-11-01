package usa.ciclo3.reto.ProyectoHotel.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.ciclo3.reto.ProyectoHotel.Modelo.Admin;
import usa.ciclo3.reto.ProyectoHotel.Repository.Crud.AdminCrud;

/**
 *
 * @author Karol
 */
@Repository
public class AdminRepository {

  @Autowired
  private AdminCrud objAdminCrud;

  //obtiene todo los Admins 
  public List<Admin> getAdmins() {
    return (List<Admin>) objAdminCrud.findAll();
  }

  //
  public Optional<Admin> getId(int id) {
    return objAdminCrud.findById(id);
  }

  //
  public Admin SaveAdmin(Admin objA) {
    return objAdminCrud.save(objA);
  }

  //Agregue este metodo 4 
  public void delAdmin(Admin objA) {
    objAdminCrud.delete(objA);
  }
}
