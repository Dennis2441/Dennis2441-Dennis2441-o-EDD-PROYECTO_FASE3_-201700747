/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_edd;

/**
 *
 * @author denni
 * 
 * 
 * 
 */

import Estructuras.Tablahashm;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Estructuras.listasimplelugar;
public class cargalugar {
public void cargar(String archivo, listasimplelugar lugar){
JSONParser parser = new JSONParser();
try {
    
 System.out.println(archivo);
            FileReader fileReader = new FileReader(archivo);
            System.out.println(fileReader);
            Object obj = parser.parse(fileReader);
            JSONArray arrays = (JSONArray) obj;
            
            
            
            for (Object o : arrays) {
            
                
            JSONObject jsonObject = (JSONObject) o;
            JSONArray Grafo=(JSONArray) jsonObject.get("Lugares");
            
            
                for (Object object : Grafo) {
                    
                    jsonObject = (JSONObject) object;
                    
                    int id = (int) jsonObject.get("id");
                String departamento = (String) jsonObject.get("departamento");
                String nombre = (String) jsonObject.get("nombre");
                String sn_sucursal = (String) jsonObject.get("sn_sucursal");
            
                
                lugar.agregarAlFinal(id, departamento, nombre, sn_sucursal);
                }
            }
            
            JOptionPane.showMessageDialog(null,"Carga Completa");
    
            
        } catch (Exception e) {
        }

}
}
