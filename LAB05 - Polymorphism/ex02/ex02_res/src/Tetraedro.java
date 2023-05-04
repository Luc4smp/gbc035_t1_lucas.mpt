public class Tetraedro extends FormaTri{
    public double obterArea(double l, double i){
        double A = (1.73)*l*l;
        setArea(A);
        return getArea();
    }
    public double obterVolume(double A, double H){
        double V = (A*A*H)/3;
        setVolume(V);
        return getVolume();
    }
}
