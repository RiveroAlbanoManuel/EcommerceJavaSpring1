
package com.ecommerce.ecommerce.model;


public class User {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String address;
    private String phonenumber;
    private String type;
    private String login;
    private String password;
    
    
    public User() {
    }

    public User(Integer id, String name, String username, String email, String address, String phonenumber, String type, String login, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
        this.type = type;
        this.login = login;
        this.password = password;
    }

    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", address=" + address + ", phonenumber=" + phonenumber + ", type=" + type + ", login=" + login + ", password=" + password + '}';
    }
    
    
    

}
