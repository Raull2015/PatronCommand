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
public class Invocador {
    
    private Cliente c;
    private List<String> comandos;

    public Invocador(Cliente c) {
        comandos = new ArrayList<>();
        this.c = c;
    }

    public void setComandos(List<String> comandos) {
        this.comandos = comandos;
    }
    
    public void ejecutarComandos(){
        
        for(String key : comandos){
            
            OperacionFactory.getOperacion(key,c).ejecutar();
        }
        
    }
    
    
    
    
    
    
}
