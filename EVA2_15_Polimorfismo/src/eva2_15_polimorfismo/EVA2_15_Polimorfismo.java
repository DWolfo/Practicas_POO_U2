/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_polimorfismo;

/**
 *
 * @author Daniel
 */
public class EVA2_15_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona = new Persona("Juan" , 19);
        Estudiate estudiante = new Estudiante("110012" , "Daniel", 18);
        
        class Persona{
            private String nombre;
            private int edad;

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }

            public String getNombre() {
                return nombre;
            }

            public int getEdad() {
                return edad;
            }

            public Persona(int edad) {
                this.edad = edad;
            }

            public Persona(String nombre) {
                this.nombre = nombre;
            }
            
        }
        
    }

    private static class Estudiate {

        public Estudiate() {
        }
    }
    
}
