/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_18_interfaces_obj;

/**
 *
 * @author Daniel
 */
public class EVA2_18_INTERFACES_OBJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mensaje mensajes = () -> {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        };
        
    }
    
    interface Mensaje{
        public void mostrarMensaje();
    }
    
    class Persona implements Mensaje{
        private String nombre;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Persona() {
        }

        @Override
        public void mostrarMensaje() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
