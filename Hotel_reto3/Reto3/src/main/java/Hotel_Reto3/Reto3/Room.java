/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel_Reto3.Reto3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author Karol Perdomo
 */
@Entity
@Table(name = "Room")

/**Clase que implementa
 * 
 */
public class Room implements Serializable{
    
    /**
     * Creación de atributos
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * Atributo id
     */
    private Integer id;
    /**
     * Atributo name
     */
    private String name;
    /**
     * Atributo brand
     */
    private String brand;
    /**
     * Atributo year
     */
    private Integer year;
    /**
     * Atributo description
     */
    private String description;
    
    /**
     * Relacion de entidades
     */
    @ManyToOne
    @JoinColumn(name = "categoryId")
    @JsonIgnoreProperties("room")
    private Categoria category;
    
    /**
     * Relacion de entidades
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "room")
    @JsonIgnoreProperties({"room", "client"})
    private List<Mensaje> messages;
    
    /**
     * Relacion de entidades
     */
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "room")
    @JsonIgnoreProperties({"room", "client"})
    private List<Reservaciones> reservations;
    
    /**
     * Metodo get
     * @return id
     */
    public Integer getId() {
        return id;
    }
    
    /**
     * Metodo set
     * @return id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Metodo get
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Metodo set
     * @return name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo get
     * @return brand
     */
    public String getBrand() {
        return brand;
    }
    
    /**
     * Metodo set
     * @return brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    /**
     * Metodo get
     * @return year
     */
    public Integer getYear() {
        return year;
    }
    
    /**
     * Metodo set
     * @return year
     */
    public void setYear(Integer year) {
        this.year = year;
    }
    
    /**
     * Metodo get
     * @return description
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Metodo set
     * @return descriotion
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Metodo get
     * @return category
     */
    public Categoria getCategory() {
        return category;
    }
    
    /**
     * Metodo set
     * @return category
     */
    public void setCategory(Categoria category) {
        this.category = category;
    }
    
    /**
     * Metodo get
     * @return Messages
     */
    public List<Mensaje> getMessages() {
        return messages;
    }
    
    /**
     * Metodo
     * @param messages 
     */
    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }
    
    /**
     * Metodo 
     * @return reservation
     */
    public List<Reservaciones> getReservations() {
        return reservations;
    }
    
   /**
    * Metodo
    * @param reservations 
    */
    public void setReservations(List<Reservaciones> reservations) {
        this.reservations = reservations;
    }
    
    
    
    
    
    
}
