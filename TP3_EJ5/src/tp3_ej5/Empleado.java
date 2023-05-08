/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej5;

/**
 *
 * @author David
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private int cuil;
    private double basico;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int cuil, double basico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
        this.basico = basico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCuil() {
        return cuil;
    }

    public double getBasico() {
        return basico;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }
    
    public double salario(){
        return this.basico;
    }
}
