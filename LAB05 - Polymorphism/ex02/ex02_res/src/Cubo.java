public class Cubo extends FormaTri{
    public double obterArea(double l, double i){
        double A = 6*l*l;
        setArea(A);
        return getArea();
    }
    public double obterVolume(double l, double i){
        double V = l*l*l;
        setVolume(V);
        return getVolume();
    }
}
