/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercioprogramacion;

/**
 *
 * @author Ferna
 */
public class Procesamiento {
    public Procesamiento() {
    }

    private double elevar (double base, int exponente){
        if (exponente == 0) {
            return 1;
        } else if (exponente == 1) {
            return base;
        } else {
           return base * elevar(base, exponente-1); 
        }  
    }
    
    public double sumar (double base, int exponente){
        double x = base;
        double total = 0;
        for (int i = 0; i < 10; i++) {
            x = elevar(x, exponente);
            System.out.println(x);
            total += x;
            System.out.println(total);
        }
        return total;
    }
}
