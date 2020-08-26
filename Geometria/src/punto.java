//TDD(Test driven development)

public class punto {
    double x;
    double y;

    public punto(double x,double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double hallarDistancia(punto otro){
        double distancia;
        distancia = Math.sqrt(Math.pow(this.x-otro.x,2) +Math.pow(this.y-otro.y,2));
        return distancia;
    }
}
