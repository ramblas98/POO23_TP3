/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_eje1;

/**
 *
 * @author Sans
 */
public class Entrenador extends Miembrodeequipo{
    private int idFederacion;
    
    //constructor

    public Entrenador() {
    }

    public Entrenador(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    //Getter and Setter

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
    //Metodos
    
    public void mostrar(){
        System.out.println("Entrenador");
        super.mostrar();
        System.out.println("ID de Federacion: "+this.idFederacion);
    }
    
}
