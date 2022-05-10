/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_polimorfidmo_int;

/**
 *
 * @author Daniel
 */
public class EVA2_17_POLIMORFIDMO_INT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Prueba prueba =new Prueba();
        prueba.mostrarMensaje("HOLA MUNCOD");
        prueba.otroMetodo();
        mostrar(prueba);
    }
    
    public static void mostrar(Mensaje m){
         m.mostrarMensaje("HOLA MUNDO");
    }
    
}
