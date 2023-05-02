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
public class Miembrodeequipo {
   private int id;
   private String nombre;
   private String apellido;
   private int edad;
   
   
   //Getter and Setter

    public Miembrodeequipo() {
    }

    public Miembrodeequipo(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//To String
    @Override
    public String toString() {
        return "Miembrodeequipo{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    //Metodos
    public void mostrar(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apellido: "+this.apellido);
        System.out.println("ID: "+this.id);
        System.out.println("Edad: "+this.edad);
    }
}
