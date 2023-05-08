/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpnº3_ej7;

public class Deposito {
    private Formacion[] misF;
    private Locomotora[] misLS;
    private int cantF;

    public Deposito() {
    }

    public Deposito(Formacion[] misF, Locomotora[] misLS, int cantF) {
        this.misF = misF;
        this.misLS = misLS;
        this.cantF = cantF;
    }

    public Formacion[] getMisF() {
        return misF;
    }

    public Locomotora[] getMisLS() {
        return misLS;
    }

    public int getCantF() {
        return cantF;
    }

    public void setMisF(Formacion[] misF) {
        this.misF = misF;
    }

    public void setMisLS(Locomotora[] misLS) {
        this.misLS = misLS;
    }

    public void setCantF(int cantF) {
        this.cantF = cantF;
    }
    ////
    public Vagon[] vagonesMasPesados(){
        Vagon[] vagones = new Vagon[this.cantF];
        for (int i = 0 ; i<this.cantF ; i++){
             vagones[i] = this.misF[i].vagonMasPesado();
             
        }
        return vagones;
    }
    ////
    public boolean necesitaConductorExp(){
        int i = 0;
        boolean necesita = false;
        while (necesita == false || i<this.cantF ){
            if (this.misF[i].esCompeja()){
                necesita = true;
            }
            else i++;
        }
        return necesita;
       }
    }

