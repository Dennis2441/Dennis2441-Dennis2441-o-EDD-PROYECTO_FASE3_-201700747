/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author denni
 */
public class listasimpleruta {
    
       private Route inicio;
  
    private int tamanio;
  
    public void listasimpleruta(){
        inicio = null;
        tamanio = 0;
    }
    
    
    
    
    public boolean esVacia(){
        return inicio == null;
    }
    
     public int getTamanio(){
        return tamanio;
    }
     
     
     public void agregarAlInicio(int origin, int destination, int routeTime){
        // Define un nuevo nodo.
          Route nuevo = new Route(origin, destination, routeTime);
        
        if (esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            inicio = nuevo;
    
        } else{
            
            nuevo.setNext(inicio);
            
            inicio = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
    }
     public void agregarAlFinal(int origin, int destination, int routeTime){
 
        Route nuevo = new Route(origin, destination, routeTime);
       
        if (esVacia()) {
            
            inicio = nuevo;
        
        } else{
            // Crea ua copia de la lista.
            Route aux = inicio;
        
            while(aux.getNext()!= null){
                aux = aux.getNext();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setNext(nuevo);
        }
       
        tamanio++;
    }
    
}
