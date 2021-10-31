/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domingo_Reto3.Reto3.Modelo;

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
 * @author KarolPerdomo
 */
@Entity
@Table(name="Room")
/**
 * Clase Room
 */
public class Room implements Serializable {
    /**
     *id
     */
    @Id
    /**
     * Generated
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    /**
     * Variable id de tipo privado
     */
    private Integer id;
     /**
     * Variable name de tipo privado
     */
    private String name;
     /**
     * Variable hote de tipo privado
     */
    private String hotel;
     /**
     * Variable stars de tipo privado
     */
    private Integer stars;
     /**
     * Variable description de tipo privado
     */
    private String description;
    
    /**
     * Relaciones de uno a uno
     */
    @ManyToOne
     /**
     * Categoria id
     */
    @JoinColumn(name = "categoriaId")
     /**
     * rooms
     */
    @JsonIgnoreProperties("rooms")
     /**
     * Variable category de tipo privado
     */
    private Category category;
    
    
     /**
     * relacion room
     */
     @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "room")
      /**
     * relacion room and client
     */
    @JsonIgnoreProperties({"room", "client"})
      /**
     * mensaje
     */
    private List<Message> messages;
     
     /**
     * Relacion room
     */ 
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "room")
    @JsonIgnoreProperties({"room", "client"})
     /**
     * private reservations
     */
    private List<Reservation> reservations;
    
     /**
     * get id
     */
     public Integer getId() {
        return id;
    }

     /**
     * set id
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * get name
     */
    public String getName() {
        return name;
    }
    
    /**
     * set name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    /**
     * get starts 
     */
    public Integer getStars() {
        return stars;
    }
    
    /**
     * set starts
     */
    public void setStars(Integer stars) {
        this.stars = stars;
    }

    /**
     * get description
     */

    public String getDescription() {
        return description;
    }

    /**
     * set descriotion
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * get category
     */    
    public Category getCategory() {
        return category;
    }
    
    /**
     * set category
     */
    public String getHotel() {
        return hotel;
    }
    
    /**
     * set hotel
     */
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
    
    /**
     * set category
     */

    public void setCategory(Category category) {
        this.category = category;
    }
    
    /**
     * list <message>
     */
    public List<Message> getMessages() {
        return messages;
    }
    
    /**
     * set Messages
     */
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
    
    /**
     * List <reservations>
     */
    public List<Reservation> getReservations() {
        return reservations;
    }
    
    /**
     * set reservations
     */
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
