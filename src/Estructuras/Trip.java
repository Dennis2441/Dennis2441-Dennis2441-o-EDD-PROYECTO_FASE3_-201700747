/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author denni
 */
public class Trip {
    private String hash;
    private String origin;
    private String destination;
    private String time;
    private Cliente client;
    private Mensajero driver;
    private listasimplelugar ruta;

    public Trip(String hash, String origin, String destination, String time, Cliente client, Mensajero driver, listasimplelugar ruta) {
        this.hash = hash;
        this.origin = origin;
        this.destination = destination;
        this.time = time;
        this.client = client;
        this.driver = driver;
        this.ruta = ruta;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public Mensajero getDriver() {
        return driver;
    }

    public void setDriver(Mensajero driver) {
        this.driver = driver;
    }

    public listasimplelugar getRuta() {
        return ruta;
    }

    public void setRuta(listasimplelugar ruta) {
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Trip{" + "hash=" + hash + ", origin=" + origin + ", destination=" + destination + ", time=" + time + ", client=" + client + ", driver=" + driver + ", ruta=" + ruta + '}';
    }
    
    
    
}
