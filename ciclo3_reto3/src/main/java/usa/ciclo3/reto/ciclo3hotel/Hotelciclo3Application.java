package usa.ciclo3.reto.ciclo3hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"usa.ciclo3.reto.ProyectoH.Modelo"})
@SpringBootApplication
public class Hotelciclo3Application {

  public static void main(String[] args) {
    SpringApplication.run(Hotelciclo3Application.class, args);
  }

}
