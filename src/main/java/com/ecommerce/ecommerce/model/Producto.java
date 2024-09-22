
package com.ecommerce.ecommerce.model;

public class Producto {

    private Integer id;
    private String name;
    private String description;
    private String pic;
    private double price;
    private int stock;
    
    
    public Producto() {
    }

    public Producto(Integer id, String name, String description, String pic, double price, int stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.pic = pic;
        this.price = price;
        this.stock = stock;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPic() {
        return pic;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", name=" + name + ", description=" + description + ", pic=" + pic + ", price=" + price + ", stock=" + stock + '}';
    }
    
    

}
