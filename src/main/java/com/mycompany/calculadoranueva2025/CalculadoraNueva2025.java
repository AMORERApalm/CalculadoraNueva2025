/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoranueva2025;

/**
 *
 * @author winadmin Modifico el programa para subir cambios y nuevos
 */
public class CalculadoraNueva2025 {

    public static int sumar (int a, int b) 
            {
                return a+b;
            }
    
    public static int restar (int a, int b) 
            {
                return a-b;
            }
    
    public static void main(String[] args) {
        // TODO code application logic here
        CalculadoraNueva2025 calculadoranueva = new CalculadoraNueva2025();
        int suma = calculadoranueva.sumar (10,5);
        System.out.println("lA suma es: " + suma);
        
        int resta = calculadoranueva.restar(15,7);
        System.out.print("La resta es: " + resta);
        
        
                
    }
    
}
