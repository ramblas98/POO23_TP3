/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class VCarga extends Vagon {
    private double cargaMax;
    private final int guardia=2;

    public VCarga() {
    }

    public VCarga(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public double getCargaMax() {
        return cargaMax;
    }

    public int getGuardia() {
        return guardia;
    }

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public double pesoMaximo(){
    return this.cargaMax+160;
}    
    public int cantPasajeroMax(){
       return 0;
    }
    @Override
    public boolean esLiviano(){
       return false;
    }
}
