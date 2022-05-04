/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author denni
 */
public class Cliente {
     private String dpi;
    private String name;
    private String email;
    private String user;
    private String id_municipio;
    private String contra;
    private String phone;
    Cliente next;
    private String address;
    
    private int id_muni;
    
    /*Constructor*/

    public Cliente(String dpi, String name, String email, String user, String id_municipio, String contra, String phone, String address) {
        this.dpi = dpi;
        this.name = name;
        this.email = email;
        this.user = user;
        this.id_municipio = id_municipio;
        this.contra = contra;
        this.phone = phone;
        this.address = address;
        next=null;
    }
    
    

    public Cliente getNext() {
        return next;
    }

    public void setNext(Cliente next) {
        this.next = next;
    }
   
    
    /*Getters y Setters*/

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public void setName(String name) {
        this.name = name;
    }

  

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

 
    

    public String getDpi() {
        return dpi;
    }

    public String getName() {
        return name;
    }

  

   

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

 
    
    /* Funcion toString */

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getId_municipio() {
        return id_municipio;
    }

    public void setId_municipio(String id_municipio) {
        this.id_municipio = id_municipio;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

   
    
}

