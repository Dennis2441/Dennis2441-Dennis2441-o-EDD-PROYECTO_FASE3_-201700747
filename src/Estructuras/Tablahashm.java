/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author denni
 */
import Estructuras.Mensajero;
import Estructuras.listacircular;
import java.math.BigInteger;
public class Tablahashm {
  listacircular [] hashTable;
  
  private static final int size=37;
  private static final double MAX_PERCENT=0.75;
  private int actualSize = size, posicion;
    private long amount;
  
     public Tablahashm() {
       this.hashTable = new listacircular[actualSize];
       this.amount = 0;
    }
    
    public void insert(String dpi, String name, String lastName, char licenseType, String gender, String cellphone, String address){
        Mensajero mensajero= new Mensajero(dpi, name, lastName, licenseType, address);
        if (chargeFactor() < MAX_PERCENT) {
            posicion = funcionDispersion(mensajero.getDpi());
            inicializarHash(posicion);
            hashTable[posicion].insertatfront(dpi, name, lastName, licenseType, gender, cellphone, address);
        } else {
            
            reHash();
            posicion = funcionDispersion(mensajero.getDpi());
            inicializarHash(posicion);
            hashTable[posicion].insertatfront(dpi, name, lastName, licenseType, gender, cellphone, address);
            
        }
        amount++;
        
    }
    
  
    private void reHash() {
        listacircular [] temp= hashTable;
        actualSize = actualSize + size;
        Mensajero auxiliar;
        hashTable= new listacircular[actualSize];
        
        for (int i = 0; i < temp.length; i++) {
             if (temp[i]!=null) {
            
                 
                 auxiliar=temp[i].getHead();
                 
                 while (auxiliar!=null) { 
                     
                     if (auxiliar instanceof Mensajero) {
                          posicion = funcionDispersion(auxiliar.getDpi());
                        inicializarHash(posicion);
                        
                       hashTable[posicion].insertatfront(auxiliar.getDpi(),auxiliar.getName(),auxiliar.getLastName(),auxiliar.getLicenseType(),auxiliar.getGender(),auxiliar.getCellphone(),auxiliar.getAddress());
                 //       hashTable[posicion].insertatfront(auxiliar.getDpi(), auxiliar.getName(),);
                         
                     }
                     auxiliar=auxiliar.getNext();
                 }
        }
            
        }
        
       
    }
    
    
    
    public Mensajero buscar(String dpi){
    Mensajero dato;
    posicion = funcionDispersion(dpi);
    dato=hashTable[posicion].buscar(hashTable[posicion].getHead(), dpi);
    
        if (dato!=null) {
            return dato;
        }
      return null;
    
    
    }
    
    public void update(String dpi2,String dpi, String name, String lastName, char licenseType, String gender, String cellphone, String address){
    Mensajero DatoEditar;
    posicion = funcionDispersion(dpi2);
    DatoEditar=hashTable[posicion].buscar(hashTable[posicion].getHead(), dpi2);
    DatoEditar.setDpi(dpi2);
    DatoEditar.setAddress(address);
    DatoEditar.setGender(gender);
    DatoEditar.setName(name);
    DatoEditar.setLastName(lastName);
      DatoEditar.setLicenseType(licenseType);
      DatoEditar.setCellphone(cellphone);
    
    }
    
    
    public Mensajero eliminar(String dpi) {
        Mensajero eliminado = null;
        posicion = funcionDispersion(dpi);
        if(hashTable[posicion] != null) {
            eliminado = hashTable[posicion].eliminar(hashTable[posicion],dpi);
            if(eliminado != null) {
                if(hashTable[posicion].getHead()== null) {
                    hashTable[posicion] = null;
                }
            }
        }
        amount--;
        return eliminado;
    }
  public int funcionDispersion(String dpi)
    {
    
       BigInteger DPI = new BigInteger(dpi);
        return DPI.mod(BigInteger.valueOf(actualSize)).intValue();
    
    }
  
  public void inicializarHash(int pos)
    {
        if (hashTable[pos] == null)
        {
            System.out.println("");
            hashTable[pos] = new listacircular();
        }
    }
     private double chargeFactor() {
        double fc = (double) amount / actualSize;
        return fc;
    }
     
    
     
     public long getAmount() {
        return amount;
    }

    public listacircular[] gethashTable() {
        return hashTable;
    }

    public void sethashTable(listacircular[] hashTable) {
        this.hashTable = hashTable;
    }

    

    public int getActualSize() {
        return actualSize;
    }

    public void setActualSize(int actualSize) {
        this.actualSize = actualSize;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
  }
    
    
    
    
    
    


