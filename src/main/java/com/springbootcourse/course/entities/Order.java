/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springbootcourse.course.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author evand
 */

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private User client;

    public Order() {
    }

    public Long getId() {
        return Id;
    }

    public Instant getMoment() {
        return moment;
    }

    public User getClient() {
        return client;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.Id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Order{" + "Id=" + Id + ", moment=" + moment + ", client=" + client + '}';
    }

}
