/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author denni
 */
public class listasimplelugar {
    

    private Lugar inicio;
  
    private int tamanio;
  
    public void listasimplelugar(){
        inicio = null;
        tamanio = 0;
    }
    
    
    public boolean esVacia(){
        return inicio == null;
    }
    
     public int getTamanio(){
        return tamanio;
    }
     
     
      public void agregarAlInicio(int id, String department, String name, String sn_sucursal){
        // Define un nuevo nodo.
          Lugar nuevo = new Lugar(id, department, name, sn_sucursal);
        
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
     public void agregarAlFinal(int id, String department, String name, String sn_sucursal){
 
        Lugar nuevo = new Lugar(id, department, name, sn_sucursal);
       
        if (esVacia()) {
            
            inicio = nuevo;
        
        } else{
            // Crea ua copia de la lista.
            Lugar aux = inicio;
        
            while(aux.getNext()!= null){
                aux = aux.getNext();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setNext(nuevo);
        }
       
        tamanio++;
    }
     
     
     public Lugar buscar(Lugar Inicio,int origin){
     
     Lugar auxiliar=Inicio;
     
     Lugar ruta;
     
     
         while (auxiliar!=null) {             
             ruta=auxiliar;
             if (ruta.getId()==origin) {
                 
                 
             return auxiliar;
         }
     
             auxiliar=auxiliar.getNext();
         }
         
         
        return null;
     
     
     }
    
}
