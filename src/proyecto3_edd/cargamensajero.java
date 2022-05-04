/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_edd;

/**
 *
 * @author denni
 */


import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Estructuras.Tablahashm;
public class cargamensajero {
    public void cargar(String archivo, Tablahashm tabla){
    
            JSONParser parser = new JSONParser();
        try {
            System.out.println(archivo);
            FileReader fileReader = new FileReader(archivo);
            System.out.println(fileReader);
            Object obj = parser.parse(fileReader);
            JSONArray array = (JSONArray) obj;
            
            for (Object o : array) {
                
                
                JSONObject jsonObject = (JSONObject) o;
                String dpi = (String) jsonObject.get("dpi");
                String name = (String) jsonObject.get("nombres");
                String lastname = (String) jsonObject.get("apellidos");
                String licenseTyp = (String) jsonObject.get("tipo_licencia");
                String gender = (String) jsonObject.get("genero");
                String cellphone=(String) jsonObject.get("telefono");
                String address = (String) jsonObject.get("direccion");
               char licenseType= licenseTyp.charAt(0);
                
                tabla.insert(dpi, name, lastname, licenseType, gender, cellphone, address);
                
        }
            JOptionPane.showMessageDialog(null,"Carga Completa");
        } catch (Exception e) {
        }
    }
    
    
}
