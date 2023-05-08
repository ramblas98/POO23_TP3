/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author David
 */
public class EmpPorComision extends Empleado{
    private double totalV;
    private double comisionPv;

    public EmpPorComision() {
    }

    public EmpPorComision(double totalV, double comisionPv) {
        this.totalV = totalV;
        this.comisionPv = comisionPv;
    }

    public double getTotalV() {
        return totalV;
    }

    public double getComisionPv() {
        return comisionPv;
    }

    public void setTotalV(double totalV) {
        this.totalV = totalV;
    }

    public void setComisionPv(double comisionPv) {
        this.comisionPv = comisionPv;
    }
    
   @Override
    public double salario(){
        return this.totalV * this.comisionPv;
    }
}
