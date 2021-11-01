package bike.reto3.modelo;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @autor Juan
 *
 */
@Entity
@Table(name = "message")
public class Mensaje implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "bikeid")
    @JsonIgnoreProperties({ "messages", "reservations" })
    private Bike bike;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({ "messages", "reservations" })
    private Cliente client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    

    // public Integer getIdMessage() {
    //     return idMessage;
    // }

    // public void setIdMessage(Integer idMessage) {
    //     this.idMessage = idMessage;
    // }

    // public String getMessageText() {
    //     return messageText;
    // }

    // public void setMessageText(String messageText) {
    //     this.messageText = messageText;
    // }

    // public Disfraz getDisfraces() {
    //     return costume;
    // }

    // public void setDisfraces(Disfraz costume) {
    //     this.costume = costume;
    // }

    // public Cliente getClientes() {
    //     return client;
    // }

    // public void setClientes(Cliente client) {
    //     this.client = client;
    // }

}
