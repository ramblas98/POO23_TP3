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
public class Deposito {
    private Formacion listafor[];
    private int cantidadfor;
    private Locomotora listaloco[];
    private int cantidaloco;

    public Deposito() {
        listafor=new Formacion[100];
        this.cantidadfor=0;
        listaloco=new Locomotora[100];
        this.cantidaloco=0;
    }

    public Deposito(Formacion[] listafor, int cantidadfor, Locomotora[] listaloco, int cantidaloco) {
        this.listafor = listafor;
        this.listaloco = listaloco;
        listafor=new Formacion[100];
        this.cantidadfor=0;
        listaloco=new Locomotora[100];
        this.cantidaloco=0;
    }

    public Formacion[] getListafor() {
        return listafor;
    }

    public int getCantidadfor() {
        return cantidadfor;
    }

    public Locomotora[] getListaloco() {
        return listaloco;
    }

    public int getCantidaloco() {
        return cantidaloco;
    }

    public void setListafor(Formacion[] listafor) {
        this.listafor = listafor;
    }

    public void setCantidadfor(int cantidadfor) {
        this.cantidadfor = cantidadfor;
    }

    public void setListaloco(Locomotora[] listaloco) {
        this.listaloco = listaloco;
    }

    public void setCantidaloco(int cantidaloco) {
        this.cantidaloco = cantidaloco;
    }

    @Override
    public String toString() {
        return "Deposito{" + "listafor=" + listafor + ", cantidadfor=" + cantidadfor + ", listaloco=" + listaloco + ", cantidaloco=" + cantidaloco + '}';
    }
    
    //Metodo
    
    public Vagon[] vagonesmasPesados(){
        int i,n=0;
        Vagon lista[]=new Vagon[100];
        for(i=0;i<this.cantidadfor;i++){
            lista[n]=this.listafor[i].vagonMaspesado();
            n=n+1;
        }
        return lista;
    }
    public boolean necesitaconductorExperto(){
        boolean b=false;
        int i=0;
        while(i<this.cantidadfor&&b==false){
            if(this.listafor[i].esCompleja()==true) b=true;
            else i=i+1;
        }
        return b;
    }
    public void agregar(int i){
        if(!this.listafor[i].puedeMoverse()){
            int peso=this.listafor[i].kilosEmpuje();
            int j=0;
            boolean b=false;
            while(j!=this.cantidadfor && b!=true){
                if(this.listaloco[j].arrastreUtil()>=peso) b=true;
                else j=j+1;
            }
            
        }
        else System.out.println("Ya Puede Moverse");
    }
}
