/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_figuras;

/**
 *
 * @author Daniel
 */
public class Circulo extends Figura {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
     public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
    }
    @Override
    public double Calculararea(){
        return(Math.PI *Math.pow(radio , 2));
    }
    
}
