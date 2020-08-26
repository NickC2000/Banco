import org.junit.Test;
import static org.junit.Assert.*;

public class puntoTest {

    @Test

    public void hallarDistancia(){

        punto p1 = new punto(-1, 0);
        punto p2 = new punto(1, 0);
        double d = p1.hallarDistancia(p2);

        assertEquals(d,2,0.1);
    }
}