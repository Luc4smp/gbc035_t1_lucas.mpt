public class Esfera extends FormaTri{
    public double obterArea(double r, double i){
        double A = 4*r*r*(3.14);
        setArea(A);
        return getArea();
    }

    public double obterVolume(double r, double i){
        double V = (4/3)*r*r*r*(3.14);
        setVolume(V);
        return getVolume();
    }
}
