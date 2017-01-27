//Nombre: Roberto Alain Rivera Bravo
//Matrícula: A01411516
//Carrera: IMT11

package spp.rriverab.a03p2;

import java.util.Scanner;
import java.lang.Math;


public class SPPRRiveraBA03P2 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        double a, b, alfa, beta;
        
        System.out.println("Calculadora de ley de senos funcion Math.cos \n");
        
        System.out.println("Introduzca el valor del lado a: ");
        a = teclado.nextDouble();
        System.out.println("Introduzca el valor del ángulo A");
        alfa = teclado.nextDouble();
        System.out.println("Introduzca el valor del ángulo B ");
        beta = teclado.nextDouble();
        
        b= a*Math.sin(beta*Math.PI/180)/Math.sin(alfa*Math.PI/180);
        
        System.out.println("El valor del lado b es: " +b);
        
    }
    
}
