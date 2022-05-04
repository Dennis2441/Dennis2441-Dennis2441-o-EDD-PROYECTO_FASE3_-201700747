/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures.graphs;

/**
 *
 * @author zofia
 */
public class Edge {
    private String place;
    private Edge father;
    private long time;

    public Edge(String place, Edge father, long time) {
        this.place = place;
        this.father = father;
        this.time = time;
    }

    public Edge getFather() {
        return father;
    }

    public void setFather(Edge father) {
        this.father = father;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Edge{" + "place=" + place + ", father=" + father + ", time=" + time + '}';
    }
    
}