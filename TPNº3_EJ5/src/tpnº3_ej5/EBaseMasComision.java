/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº3_ej5;


public class EBaseMasComision extends EPorComision{
    
    
    public EBaseMasComision(){
    }
    
    @Override 
    public double Salario(){
        double basico = super.Salario();
        return this.getSalarioBasico() + basico;
    }
}
