/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

import java.util.Objects;

/**
 *
 * @author denni
 */
public class Mensajero {
   private String dpi;
    private String name;
    private String lastName;
    private char licenseType;
    private String gender;
    private String cellphone;
  
   private Mensajero next;
   private Mensajero previous;
    private String address;

    /*Constructor*/
    public Mensajero(String dpi, String name, String lastName, char licenseType, String address) {
        this.dpi = dpi;
        this.name = name;
        this.lastName = lastName;
        this.licenseType = licenseType;
        this.gender = gender;
        this.cellphone = cellphone;

        this.address = address;
        this.next=null;
        this.previous=null;
    }

    /*Metodos accesores y modificadores (getters & setters)*/
    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(char licenseType) {
        this.licenseType = licenseType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

   

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    } 

    public Mensajero getNext() {
        return next;
    }

    public void setNext(Mensajero next) {
        this.next = next;
    }

    public Mensajero getPrevious() {
        return previous;
    }

    public void setPrevious(Mensajero previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "\"DPI = " + dpi + "\nNAME = " + name + " " + lastName + "\nLICENSE = " + licenseType + 
                "\nGENDER = " + gender + "\nPHONE = " + cellphone + 
                "\nADDRESS = " + address + "\"";
    }
    
}
    
    
    
    
    

