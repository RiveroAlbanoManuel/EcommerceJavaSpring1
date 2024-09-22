
package com.ecommerce.ecommerce.model;

import java.util.Date;


public class Orden {
    private Integer id;
    private String number;
    private Date fechaCreacion;
    private Date fechaRecibida;

    public Orden() {
    }

    public Orden(Integer id, String number, Date fechaCreacion, Date fechaRecibida) {
        this.id = id;
        this.number = number;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
    }

    @Override
    public String toString() {
        return "Orden{" + "id=" + id + ", number=" + number + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida=" + fechaRecibida + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaRecibida() {
        return fechaRecibida;
    }

    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }
      
    
    

    
    
    
}
