/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 * base node for doubly circular linked list and linked list
 * contains data to be stored, connections between nodes
 * and basic getters/setters.
 * @author zofia
 * @param <E>
 */
public class Node<E> {
    private E data;
    private Node<E> next;
    private Node<E> previous;

    /* Constructor */
    public Node(E data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
    
    /* Getters and Setters */
    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }
    
    public void delete() {
        setPrevious(null);
        setNext(null);
        setData(null);
    }
}
