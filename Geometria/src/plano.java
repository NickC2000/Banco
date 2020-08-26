public class plano {
    public static void main(String [] args) {

        System.out.println("Programa plano cartesiano");

        ///////////////////////////////////////////////////////////

        punto p1 = new punto(-1, 0);
        punto p2 = new punto(1, 0);
        System.out.println(p1);

        double d = p1.hallarDistancia(p2);
        System.out.println("Distancia entre p1 y p2: "+d);

        ///////////////////////////////////////////////////////////

        circulo c = new circulo(1,new punto(0,0));

        double areaC = c.hallarArea();
        System.out.println("El area del circulo es:" + areaC);

        double perimetroC = c.hallarPerimetro();
        System.out.println("El perimetro del circulo es:" + perimetroC);

        //////////////////////////////////////////////////////////

        triangulo t = new triangulo(new punto(0,4),new punto(0,0),new punto(3,0));

        double perimetroT = t.hallarPerimetro();
        System.out.println("El perimetro del triangulo es: " + perimetroT);

        double areaT = t.hallarArea();
        System.out.println("El perimetro del triangulo es: " + areaT);

        String clasificacion = t.clasificacionTriangulo();
        System.out.println("El triangulo es: "+clasificacion);


        ///////////////////////////////////////////////////////////

        rectangulo r = new rectangulo(new punto(0,2),new punto(0,0),new punto(3,0),new punto(3,2));

        double perimetroR = t.hallarPerimetro();
        System.out.println("El perimetro del rectangulo es: " + perimetroR);

        double areaR = t.hallarArea();
        System.out.println("El perimetro del rectangulo es: " + areaR);

    }
}
