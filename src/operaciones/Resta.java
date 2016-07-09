/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import patroncommand.Cliente;
import patroncommand.Operacion;

/**
 *
 * @author Raul
 */
public class Resta implements Operacion {
     private Cliente c;

    public Resta(Cliente c) {
        this.c = c;
    }
    
    

    @Override
    public void ejecutar() {
        int result = c.getNum1() - c.getNum2();
        System.out.println("Resultado de la resta = " + result );
    }
}
