package usa.ciclo3.reto.ProyectoHotel.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.ciclo3.reto.ProyectoHotel.Modelo.Category;
import usa.ciclo3.reto.ProyectoHotel.Repository.Crud.CategoryCrud;

/**
 *
 * @author Karol
 */
@Repository
public class CategoryRepository {

  @Autowired
  private CategoryCrud objCategoryCrud;

  //
  public List<Category> getCategory() {
    return (List<Category>) objCategoryCrud.findAll();
  }

  public Optional<Category> getIdCat(int id) {
    return objCategoryCrud.findById(id);
  }

  public Category saveCategory(Category objC) {
    return objCategoryCrud.save(objC);
  }

  //Agregue este metodo 4 
  public void delCategory(Category objC) {
    objCategoryCrud.delete(objC);
  }
}
