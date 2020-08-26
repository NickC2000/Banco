import org.junit.Test;
import static org.junit.Assert.*;

public class rectanguloTest {

    @Test

    public void hallarPerimetro(){

        rectangulo r = new rectangulo(new punto(0,2),new punto(0,0),new punto(3,0),new punto(3,2));

        double perimetro = (2*r.verticeA.hallarDistancia(r.verticeB))+(2*r.verticeB.hallarDistancia(r.verticeC));

        assertEquals(10,perimetro,0.1);
    }

    @Test

    public void hallarArea(){

        rectangulo r = new rectangulo(new punto(0,2),new punto(0,0),new punto(3,0),new punto(3,2));

        double area = (r.verticeA.hallarDistancia(r.verticeB))*(r.verticeB.hallarDistancia(r.verticeC));

        assertEquals(6,area,0.1);
    }
}
