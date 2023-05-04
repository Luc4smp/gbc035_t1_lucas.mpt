public class Circulo extends FormaBi{
    public double obterArea(double r, double i){
        double A = r*r*(3.14);
        setArea(A);
        return getArea();
    }
}
