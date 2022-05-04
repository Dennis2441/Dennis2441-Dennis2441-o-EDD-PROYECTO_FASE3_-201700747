/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author denni
 */
import org.mindrot.bcrypt.BCrypt;
public  class listacliente {
    
     private Cliente inicio;
  
    private int tamanio;
  
    public void listacliente(){
        inicio = null;
        tamanio = 0;
    }
    
    
    public boolean esVacia(){
        return inicio == null;
    }
    
     public int getTamanio(){
        return tamanio;
    }
     
     
      public void agregarAlInicio(String dpi, String name, String email, String user, String id_municipio, String contra, String phone, String address){
        // Define un nuevo nodo.
        String hashed = BCrypt.hashpw(contra, BCrypt.gensalt());
          Cliente nuevo = new Cliente(dpi, name, email, user, id_municipio, hashed, phone, address);
        
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
     public void agregarAlFinal(String dpi, String name, String email, String user, String id_municipio, String contra, String phone, String address){
 String hashed = BCrypt.hashpw(contra, BCrypt.gensalt());
        Cliente nuevo = new Cliente(dpi, name, email, user, id_municipio, hashed, phone, address);
       
        if (esVacia()) {
            
            inicio = nuevo;
        
        } else{
            // Crea ua copia de la lista.
            Cliente aux = inicio;
        
            while(aux.getNext()!= null){
                aux = aux.getNext();
            }
            // Agrega el nuevo nodo al final de la lista.
            aux.setNext(nuevo);
        }
       
        tamanio++;
    }
     
     
     public boolean buscar(String DPI){
     
     Cliente auxiliar=inicio;
     
     Cliente ruta;
     
     
         while (auxiliar!=null) {             
             ruta=auxiliar;
             if (ruta.getDpi().equals(DPI)) {
                 
                 System.out.println(ruta.getContra());
             return true;
         }
     
             auxiliar=auxiliar.getNext();
         }
         
         
        return false;
     
     
     }
    public boolean login(String user, String contra){
     
     Cliente auxiliar=inicio;
     
     Cliente ruta;
     
     
         while (auxiliar!=null) {             
             ruta=auxiliar;
             if (ruta.getUser().equalsIgnoreCase(user) ) {
                 
                 if (BCrypt.checkpw(contra, ruta.getContra())) {
                     System.out.println(ruta.getContra());
                     
                     return true;
                 } else {
                 }
                 
                 
             
         }
     
             auxiliar=auxiliar.getNext();
         }
         
         
        return false;
     
     
     }
    
}

