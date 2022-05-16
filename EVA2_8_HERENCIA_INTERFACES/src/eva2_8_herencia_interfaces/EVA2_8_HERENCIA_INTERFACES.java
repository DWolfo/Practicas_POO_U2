
package eva2_8_herencia_interfaces;

/**
 *
 * @author Daniel
 */
public class EVA2_8_HERENCIA_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herePrueba prueba = new Prueba();
        prueba.metodoA();
        prueba.meodoB();
        //System.out.println(A);
    }
    
}

class Prueba implements B{

    @Override
    public void meodoB() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void metodoA() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

interface A{
    public void metodoA();
}

interface B extends A{
    public void meodoB();
}
