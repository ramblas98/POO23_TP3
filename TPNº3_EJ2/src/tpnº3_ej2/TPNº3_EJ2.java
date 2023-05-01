/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpnº3_ej2;


public class TPNº3_EJ2 {

    public static void main(String[] args) {
       
       Camion c1 = new Camion(31.32, 10, "GSGSA", "VOLVO");
       
       c1.PesoPorCompartimiento();
       ///7
       Autobus a1 = new Autobus(25, 2.50, "AVBNG", "Scania");
       
       double recaudado = a1.totalRecaudado();
       System.out.println("Total recaudado por el autobus: "+ recaudado);
    }
    
}
