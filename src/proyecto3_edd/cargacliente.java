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

import Estructuras.listacliente;
public class cargacliente {
    
    
    public void carcaga(String archivo, listacliente cliente){
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(archivo));
            JSONArray array = (JSONArray) obj;
            
            for (Object o : array) {
                
                
                JSONObject jsonObject = (JSONObject) o;
                String DPI = (String) jsonObject.get("dpi");
                String Nombre = (String) jsonObject.get("nombre_completo");
                String user = (String) jsonObject.get("nombre_usuario");
                String email = (String) jsonObject.get("correo");
                String contra = (String) jsonObject.get("contrasenia");
                String Tel = (String) jsonObject.get("telefono");
                String address = (String) jsonObject.get("direccion");
                long id = (long) jsonObject.get("id_municipio");
                String id_muni=String.valueOf(id);
                cliente.agregarAlInicio(DPI, Nombre, email, user, id_muni, contra, Tel, address);
                
        }
            JOptionPane.showMessageDialog(null,"Carga Completa");
        } catch (Exception e) {
        }
        
    }
}
