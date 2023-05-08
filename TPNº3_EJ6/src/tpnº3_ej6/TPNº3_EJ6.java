/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpnº3_ej6;

import java.util.Scanner;


public class TPNº3_EJ6 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        Piso piso = new Piso();
        
        Locales local = new Locales();
        
       System.out.println("Datos del piso:" + piso);
       System.out.println("Datos del local:" + local);
       
       double precioPiso = piso.Precio();
       System.out.println("Precio total del piso: " + precioPiso);
       
       double precioLocal = local.Precio();
       System.out.println("Precio total del piso: " + precioLocal);
       
    }
    
}
