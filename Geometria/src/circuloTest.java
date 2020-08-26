import org.junit.Test;
import static org.junit.Assert.*;

public class circuloTest {

    @Test

    public void hallarArea(){

        circulo c = new circulo(1,new punto(0,0));
        double area = Math.PI * Math.pow(c.radio,2);
        assertEquals(Math.PI,area,0.01);
    }

    @Test

    public void hallarPerimetro(){

        circulo c = new circulo(1,new punto(0,0));
        double perimetro = 2 * Math.PI * c.radio;
        assertEquals((2*Math.PI),perimetro,0.01);
    }
}