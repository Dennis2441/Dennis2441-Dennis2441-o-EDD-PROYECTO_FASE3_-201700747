/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author denni
 */
public class Lugar {
    
    
    private int id;
    private String department ;
    private String name;
    private String sn_sucursal;
Lugar next;
    public Lugar(int id, String department, String name, String sn_sucursal) {
        this.id = id;
        this.department = department;
        this.name = name;
        this.sn_sucursal = sn_sucursal;
        next=null;
    }

    public Lugar getNext() {
        return next;
    }

    public void setNext(Lugar next) {
        this.next = next;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSn_sucursal() {
        return sn_sucursal;
    }

    public void setSn_sucursal(String sn_sucursal) {
        this.sn_sucursal = sn_sucursal;
    }
    
}
