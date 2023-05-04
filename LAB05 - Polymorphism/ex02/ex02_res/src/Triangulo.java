public class Triangulo extends FormaBi{
    public double obterArea(double b, double h){
        double A = b*h;
        setArea(A);
        return getArea();
    }
}
