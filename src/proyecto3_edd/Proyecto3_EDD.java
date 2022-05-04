/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto3_edd;

import Estructuras.Mensajero;
import Estructuras.Tablahashm;
import Estructuras.listasimplelugar;
import Estructuras.listasimpleruta;
import javax.swing.JFileChooser;

/**
 *
 * @author denni
 */
public class Proyecto3_EDD {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        JFileChooser seleccionar = new JFileChooser();
          Principal princiapal= new Principal();
          listasimplelugar lugar= new listasimplelugar();
          cargalugar carlugar= new cargalugar();
          cargaruta carlruta= new cargaruta();
          listasimpleruta ruta= new listasimpleruta();
          
          princiapal.setVisible(true);
          
          
        seleccionar.showOpenDialog(seleccionar);
        String path = seleccionar.getSelectedFile().getAbsolutePath();
        
        //carlugar
        
        carlugar.cargar(path, lugar);
      //  
        path="";
        
        seleccionar.showOpenDialog(seleccionar);
         path = seleccionar.getSelectedFile().getAbsolutePath();
         
         carlruta.cargar(path, ruta);
         
        
        
        
        
          
          

    }
}
