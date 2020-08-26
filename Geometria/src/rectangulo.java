public class rectangulo {

    punto verticeA;
    punto verticeB;
    punto verticeC;
    punto verticeD;

    public rectangulo(punto verticeA, punto verticeB, punto verticeC, punto verticeD) {
        this.verticeA = verticeA;
        this.verticeB = verticeB;
        this.verticeC = verticeC;
        this.verticeD = verticeD;
    }

    public double hallarPerimetro(){

        double perimetro = (2*verticeA.hallarDistancia(verticeB))+(2*verticeB.hallarDistancia(verticeC));

        return perimetro;
    }

    public double hallarArea(){

        double area = (verticeA.hallarDistancia(verticeB))*(verticeB.hallarDistancia(verticeC));

        return area;
    }
}
