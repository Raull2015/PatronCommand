/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncommand;

import java.util.HashMap;
import java.util.Map;
import operaciones.Multiplicacion;
import operaciones.Resta;
import operaciones.Suma;
import operaciones.Division;

/**
 *
 * @author Raul
 */
public class OperacionFactory {
    
    private static final Map<String,Operacion> operacionesExis = new HashMap<>();
    
    private OperacionFactory() {
    }
    
    public static Operacion getOperacion(String key, Cliente c){
        
        Operacion op = operacionesExis.get(key);
        if( op != null){
            return op; 
        }
        
        switch (key) {
            case "suma":{
                op = new Suma(c);
                operacionesExis.put(key, op);
                return op;
            }
            case "resta":{
                op = new Resta(c);
                operacionesExis.put(key, op);
                return op;
            }
            case "multiplicacion":{
                op = new Multiplicacion(c);
                operacionesExis.put(key, op);
                return op;
            }
            case "division":{
                op = new Division(c);
                operacionesExis.put(key, op);
                return op;
            }
            default:
                break;
        }
        
        
        
        return null;
    }
    
   
}
