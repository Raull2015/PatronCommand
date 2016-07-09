/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroncommand;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raul
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        
        cliente.setNum1(20);
        cliente.setNum2(10);
        
        //creando el invocador
        Invocador i = new Invocador(cliente);
        
        //definiendo que comandos se van a ejecutar
        List<String> aEjecutar = new ArrayList();
        aEjecutar.add("suma");
        aEjecutar.add("multiplicacion");
        aEjecutar.add("resta");
        aEjecutar.add("division");
        
        i.setComandos(aEjecutar);
        
        //ejecutando los comandos
        i.ejecutarComandos();

    }

    
    
    
    
}
