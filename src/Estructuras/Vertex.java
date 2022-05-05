/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 * Graph vertex
 * @author zofia
 */
public class Vertex { //Vertice
    private String name;
    private int id;

    /*Constructor*/
    public Vertex(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /*Metodos modificadores y accesores (getters & setters)*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  name.replaceAll(" ", "");
    }

}
