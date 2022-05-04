/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author denni
 */
public class listacircular {
    
   private Mensajero head;
   private Mensajero tail;
    
    public listacircular(){
    head=null;
    tail=null;
    
    }

    public Mensajero getHead() {
        return head;
    }

    public void setHead(Mensajero head) {
        this.head = head;
    }

    public Mensajero getTail() {
        return tail;
    }

    public void setTail(Mensajero tail) {
        this.tail = tail;
    }
    
    public void insertatfront(String dpi, String name, String lastName, char licenseType, String gender, String cellphone, String address)
    {
    Mensajero auxiliar = new Mensajero(dpi, name, lastName, licenseType, address);
        if (head==null) {
            head=auxiliar;
            head.setNext(head);
            auxiliar.setPrevious(tail);
            tail=auxiliar;
            
            
           
         
       
        } else {
            
            tail.setNext(auxiliar);
            auxiliar.setNext(head);
            auxiliar.setPrevious(tail);
            tail=auxiliar;
            head.setPrevious(tail);
            
            
        }
    
    }
    
    public void insertAtBack(String dpi, String name, String lastName, char licenseType, String gender, String cellphone,  String address) {
        //Creacion e inicializacion de nuevo nodo con dato de entrada.
        Mensajero auxiliar = new Mensajero(dpi, name, lastName, licenseType, address);
        if (head==null) {
            auxiliar.setNext(auxiliar);
            auxiliar.setPrevious(auxiliar);
            head=(auxiliar);
        } else {
            auxiliar.setNext(head);
            auxiliar.setPrevious(tail);
            tail.setNext(auxiliar);
            head.setPrevious(auxiliar);
        }
    
    
            }

          
           
           
           public Mensajero buscar(Mensajero h, String dpi){
           
               
               
               Mensajero auxiliar=head;
               
               do {     
                   if (auxiliar.getDpi().equals(dpi)) {
                       
                       return auxiliar;
                       
                   } auxiliar=auxiliar.getNext();
                   
               } while (auxiliar!=head);
           return null;
           
           }
           
           
           
           public Mensajero eliminar(listacircular hh,String dpi){
               if (head==null) {
                   
               } else {
                 
                   
                   if (buscar(hh.getHead(),dpi)==null) {
                       
                   } else {
                       Mensajero auxiliar=buscar(head, dpi);
                   Mensajero previous= auxiliar.getPrevious();
                   Mensajero next= auxiliar.getNext();
                   previous.setNext(next);
                   next.setPrevious(previous);
                   if(auxiliar == head) head = next;
                   if(auxiliar == tail) tail = previous;
                 Mensajero aux=auxiliar;
                   auxiliar.setPrevious(null);
                   auxiliar.setNext(null);
                   auxiliar=null;
                   return aux;
                   }
                   
                  
               }
       return null;
           
           
           
           
           }
           
           
           
}

