/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_clases_anonimas;

/**
 *
 * @author Daniel
 */
public class EVA2_19_CLASES_ANONIMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mensaje mensajes = new Mensaje() {
            @Override
            public void mostrarMensaje() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        mensajes = () -> {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        };
    }
    
     interface Mensaje{
        public void mostrarMensaje();
    }
    
}
