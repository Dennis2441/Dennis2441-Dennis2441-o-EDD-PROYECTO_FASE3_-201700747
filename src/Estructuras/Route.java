/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author denni
 */
public class Route {
     private int origin;
    private int destination;
    private int routeTime;
Route next;
    /*Constructor*/
    public Route(int origin, int destination, int routeTime) {
        this.origin = origin;
        this.destination = destination;
        this.routeTime = routeTime;
        next=null;
    }

    public Route getNext() {
        return next;
    }

    public void setNext(Route next) {
        this.next = next;
    }

    
    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getRouteTime() {
        return routeTime;
    }

    public void setRouteTime(int routeTime) {
        this.routeTime = routeTime;
    }

    @Override
    public String toString() {
        return "\"ORIGIN = " + origin + "\nDESTINATION = " + destination + "\n TIME = " + routeTime + "\"";
    }
    
}
