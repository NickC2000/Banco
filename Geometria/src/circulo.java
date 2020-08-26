public class circulo {

    punto centro;
    double radio;

    public circulo(double radio, punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public double hallarArea(){
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }

    public double hallarPerimetro(){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
