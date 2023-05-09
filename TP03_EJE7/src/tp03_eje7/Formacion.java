/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp03_eje7;

/**
 *
 * @author Sans
 */
public class Formacion {
    private Locomotora listaLocomotora[];
    private int cantidadloco;
    private Vagon listaVagon[];
    private int cantidadvago;

    public Formacion() {
        listaLocomotora=new Locomotora[100];
        listaVagon=new Vagon[100];
        this.cantidadloco=0;
        this.cantidadvago=0;
    }

    public Formacion(Locomotora[] listaLocomotora, int cantidadloco, Vagon[] listaVagon, int cantidadvago) {
        this.listaLocomotora = listaLocomotora;
        this.cantidadloco = cantidadloco;
        this.listaVagon = listaVagon;
        this.cantidadvago = cantidadvago;
    }
    
    
    
    public Locomotora[] getListaLocomotora() {
        return listaLocomotora;
    }

    public Vagon[] getListaVagon() {
        return listaVagon;
    }

    public void setListaLocomotora(Locomotora[] listaLocomotora) {
        this.listaLocomotora = listaLocomotora;
    }

    public void setListaVagon(Vagon[] listaVagon) {
        this.listaVagon = listaVagon;
    }

    @Override
    public String toString() {
        return "Formacion{" + "listaLocomotora=" + listaLocomotora + ", listaVagon=" + listaVagon + '}';
    }
    
    //Metodos
    public int cantidadPasajeroMax(){
     int i,count=0;
     for(i=0;i<this.cantidadvago;i++){
         if(this.listaVagon[i] instanceof Vagonpasajero==true){
             count=count+this.listaVagon[i].cantidadPasajeroMaximo();
         }
     }
     return count;
    }
    
    public int cantidadVagonliviano(){
        int i,count=0;
        for(i=0;i<this.cantidadvago;i++){
            if(this.listaVagon[i].esLiviana()==true)count+=1;
        }
        return count;
    }
    public int velocidadMaxima(){
        int i,men;
        men=this.listaLocomotora[0].getVelocidadMaxima();
        for(i=1;i<this.cantidadloco;i++){
            if(this.listaLocomotora[i].getVelocidadMaxima()<men)men=this.listaLocomotora[i].getVelocidadMaxima();
        }
        return men;
    }
    public boolean esEficiente(){
        int i=0;
        boolean b=true;
        while(i<this.cantidadloco&&b==true){
            if(this.listaLocomotora[i].esEficiente()==true) i=i+1;
            else b=false;
        }
        return b;
    }
    public boolean puedeMoverse(){
        int pesomaxv=0,arrastre=0;
        for(int i=0;i<this.cantidadloco;i++){
            arrastre=arrastre+this.listaLocomotora[i].arrastreUtil();
        }
        for(int i=0;i<this.cantidadvago;i++){
            pesomaxv=pesomaxv+this.listaVagon[i].pesoMaximo();
        }
        if(arrastre>=pesomaxv) return true;
        else return false;
    }
    public int kilosEmpuje(){
        int pesomaxv=0,arrastre=0;
        if(this.puedeMoverse()==true) return 0;
        else {
            for(int i=0;i<this.cantidadloco;i++){
            arrastre=arrastre+this.listaLocomotora[i].arrastreUtil();
             }
            for(int i=0;i<this.cantidadvago;i++){
            pesomaxv=pesomaxv+this.listaVagon[i].pesoMaximo();
               }
            return pesomaxv-arrastre;
        }
    }
    public Vagon vagonMaspesado(){
        int i;
        Vagon pesado=null;
        pesado=this.listaVagon[0];
        for(i=1;i<this.cantidadvago;i++){
            if(pesado.pesoMaximo()<this.listaVagon[i].pesoMaximo()) pesado=this.listaVagon[i];
        }
        return pesado;
    }
    public boolean esCompleja(){
        int i,count=0,peso=0;
        for(i=0;i<this.cantidadloco;i++){
            count=count+1;
            peso=peso+this.listaLocomotora[i].getPeso();
        }
        for(i=0;i<this.cantidadvago;i++){
            count=count+1;
            peso=peso+this.listaVagon[i].pesoMaximo();
        }
        if(count>=20||peso>10000)return true;
        else return false;
    }
    public void agregarLocomotora(Locomotora e){
        this.listaLocomotora[this.cantidadloco]=e;
        this.cantidadloco=this.cantidadloco+1;
    }
    public void agregarVagon(Vagon e){
        this.listaVagon[this.cantidadvago]=e;
        this.cantidadvago=this.cantidadvago+1;
    }
}
