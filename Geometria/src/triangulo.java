public class triangulo {

    punto verticeA;
    punto verticeB;
    punto verticeC;

    public triangulo(punto verticeA, punto verticeB, punto verticeC) {
        this.verticeA = verticeA;
        this.verticeB = verticeB;
        this.verticeC = verticeC;
    }

    public double hallarPerimetro(){

        double ladoA = verticeA.hallarDistancia(verticeB);
        double ladoB = verticeB.hallarDistancia(verticeC);
        double ladoC = verticeC.hallarDistancia(verticeA);

        double perimetro = ladoA + ladoB + ladoC;

        return perimetro;

    }

    public double hallarArea(){

        double ladoA = verticeA.hallarDistancia(verticeB);
        double ladoB = verticeB.hallarDistancia(verticeC);
        double ladoC = verticeC.hallarDistancia(verticeA);

        double perimetro = ladoA + ladoB + ladoC;

        double s = perimetro/2;

        double area = Math.sqrt(s*(s-ladoA)*(s-ladoB)*(s-ladoC));

        return area;
    }

    public String clasificacionTriangulo() {

        double ladoA = verticeA.hallarDistancia(verticeB);
        double ladoB = verticeB.hallarDistancia(verticeC);
        double ladoC = verticeC.hallarDistancia(verticeA);

        if ((ladoA == ladoB) && (ladoB == ladoC) && (ladoC == ladoA)) {

            return("Equilatero");

        } else if (((ladoA == ladoB) && (ladoB != ladoC)) || ((ladoB == ladoC) && (ladoC == ladoA)) || ((ladoA == ladoC) && (ladoC == ladoB))) {

            return("Isoceles");

        } else if ((ladoA != ladoB) && (ladoB != ladoC) && (ladoC != ladoA)) {

            return("Escaleno");
        }

        return "Error";
    }
}
