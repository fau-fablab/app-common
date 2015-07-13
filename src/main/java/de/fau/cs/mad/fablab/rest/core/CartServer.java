package de.fau.cs.mad.fablab.rest.core;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="cartServer")
public class CartServer implements Serializable {

    @Id
    @Column(name = "cartCode")
    private String cartCode;

    @OneToMany(fetch=FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy="cart")
    private List<CartEntryServer> items;

    @Column(name = "status")
    private CartStatus status;

    @Column(name = "push_id")
    private String pushId;

    //Only used to remove old carts (on server)
    @Column(name = "sentToServer")
    private long sentToServer;

    public CartServer() {}

    public CartServer(String cartCode, List<CartEntryServer> items, CartStatus status, String pushId) {
        this.cartCode = cartCode;
        this.items = items;
        this.status = status;
        this.pushId = pushId;
    }

    public String getCartCode() {
        return cartCode;
    }

    public void setCartCode(String cartCode) {
        this.cartCode = cartCode;
    }

    public List<CartEntryServer> getItems() {
        return items;
    }

    public void setItems(List<CartEntryServer> items) {
        this.items = items;
    }

    public CartStatus getStatus() {
        return status;
    }

    public void setStatus(CartStatus status) {
        this.status = status;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public long getSentToServer() {
        return sentToServer;
    }

    public void setSentToServer() {
        this.sentToServer = System.currentTimeMillis();
    }
}
