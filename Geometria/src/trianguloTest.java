import org.junit.Test;
import static org.junit.Assert.*;

public class trianguloTest {

    @Test

    public void hallarPerimetro() {

        triangulo t = new triangulo(new punto(0, 4), new punto(0, 0), new punto(3, 0));

        double ladoA = t.verticeA.hallarDistancia(t.verticeB);
        double ladoB = t.verticeB.hallarDistancia(t.verticeC);
        double ladoC = t.verticeC.hallarDistancia(t.verticeA);

        double perimetro = ladoA + ladoB + ladoC;

        assertEquals(12, perimetro, 0.1);
    }

    @Test

    public void hallarArea() {

        triangulo t = new triangulo(new punto(0, 4), new punto(0, 0), new punto(3, 0));

        double ladoA = t.verticeA.hallarDistancia(t.verticeB);
        double ladoB = t.verticeB.hallarDistancia(t.verticeC);
        double ladoC = t.verticeC.hallarDistancia(t.verticeA);

        double perimetro = ladoA + ladoB + ladoC;

        double s = perimetro / 2;

        double area = Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));

        assertEquals(6, area, 0.1);
    }

    @Test

    public void clasificacionTriangulo() {

        triangulo t = new triangulo(new punto(0, 4), new punto(0, 0), new punto(3, 0));

        double ladoA = t.verticeA.hallarDistancia(t.verticeB);
        double ladoB = t.verticeB.hallarDistancia(t.verticeC);
        double ladoC = t.verticeC.hallarDistancia(t.verticeA);

        if ((ladoA == ladoB) && (ladoB == ladoC) && (ladoC == ladoA)) {

            System.out.println("Equilatero");

        } else if (((ladoA == ladoB) && (ladoB != ladoC)) || ((ladoB == ladoC) && (ladoC == ladoA)) || ((ladoA == ladoC) && (ladoC == ladoB))) {

            System.out.println("Isoceles");

        } else if ((ladoA != ladoB) && (ladoB != ladoC) && (ladoC != ladoA)) {

            System.out.println("Escaleno");
        }
    }
}