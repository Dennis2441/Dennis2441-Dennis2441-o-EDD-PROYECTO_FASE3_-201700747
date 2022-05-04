/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_edd;

/**
 *
 * @author denni
 */
import Estructuras.Tablahashm;
import Estructuras.listasimpleruta;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class cargaruta {
    
public void cargar(String archivo, listasimpleruta ruta){
JSONParser parser = new JSONParser();


    try {
        
        
         System.out.println(archivo);
            FileReader fileReader = new FileReader(archivo);
            System.out.println(fileReader);
            Object obj = parser.parse(fileReader);
            JSONArray array = (JSONArray) obj;
            
            for (Object o : array) {
            
            JSONObject jsonObject = (JSONObject) o;
               
            JSONArray Grafo=(JSONArray) jsonObject.get("Grafo");
            
                for (Object object : Grafo) {
                    jsonObject = (JSONObject) object;
                    
                    int origin=(int) jsonObject.get("inicio");
                    int destination=(int) jsonObject.get("final");
                    int routeTime=(int) jsonObject.get("peso");
                    ruta.agregarAlInicio(origin, destination, routeTime);
                    
                }
                
              // 
            }
            
            JOptionPane.showMessageDialog(null,"Carga Completa");
        
    } catch (Exception e) {
    }


}

    
}
