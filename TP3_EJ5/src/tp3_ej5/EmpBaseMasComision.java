/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej5;

/**
 *
 * @author David
 */
public class EmpBaseMasComision extends EmpPorComision {

    public EmpBaseMasComision() {
    }
    
    @Override
    public double salario(){
        double rv = super.salario();
        return this.getBasico() + rv;
    }
}
