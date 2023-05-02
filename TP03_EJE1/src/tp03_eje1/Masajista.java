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
public class Masajista extends Miembrodeequipo{
    private String titulacion;
    private int aniosExperiencia;
    
    //Constructor

    public Masajista() {
    }

    public Masajista(String titulacion, int aniosExperiencia) {
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    //Getter and Setter

    public String getTitulacion() {
        return titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista{" + "titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
    //metodos
    
    public void mostrar(){
        System.out.println("Masajista");
        super.mostrar();
        System.out.println("Titulacion: "+this.titulacion);
        System.out.println("Anios De Experiencia: "+this.aniosExperiencia);
    }
    
}
