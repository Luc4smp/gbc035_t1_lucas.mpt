
public class Main {
    public static void main(String[] args) {
    double k =20;
        Forma F[] = new Forma[10];
        F[0] = new Circulo();
        F[1] = new Quadrado();
        F[2] = new Triangulo();
        F[3] = new Esfera();
        F[4] = new Cubo();
        F[5] = new Tetraedro();
        for(int i =0; i <6; i++){
            if(F[i] instanceof FormaTri){
                System.out.println("Volume :"+ F[i].obterVolume(k,k));
            } else if (F[i] instanceof FormaBi) {
                System.out.println("Area :"+F[i].obterArea(k,k));
            }
        }
    }
}