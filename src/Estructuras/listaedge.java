/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author denni
 */
public class listaedge {
    
    
    private Edge inicio;
  
    private int tamanio;
  
    public void listaedge(){
        inicio = null;
        tamanio = 0;
    }
    
    
    public boolean esVacia(){
        return inicio == null;
    }
    
     public int getTamanio(){
        return tamanio;
    }
     
     
      public void agregarAlInicio(String place, Edge father, long time){
        // Define un nuevo nodo.
          Edge nuevo = new Edge(place, father, time);
        
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
     public void agregarAlFinal(String place, Edge father, long time){
        // Define un nuevo nodo.
          Edge nuevo = new Edge(place, father, time);
       
        if (esVacia()) {
            
            inicio = nuevo;
        
        } else{
            // Crea ua copia de la lista.
            Edge aux = inicio;
        
            while(aux.getNext()!= null){
                aux = aux.getNext();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setNext(nuevo);
        }
       
        tamanio++;
    }
     
     
//     public Edge buscar(Edge Inicio,int origin){
//     
//     Edge auxiliar=Inicio;
//     
//     Edge ruta;
//     
//     
//         while (auxiliar!=null) {             
//             ruta=auxiliar;
//             if (ruta.getId()==origin) {
//                 
//                 
//             return auxiliar;
//         }
//     
//             auxiliar=auxiliar.getNext();
//         }
//         
//         
//        return null;
//     
//     
//     }
}
