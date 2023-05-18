import java.util.Scanner;

public class FaceFriends {
    public void Main(){
        int m = 0;
        Contato []contatos = new Contato[100];
        Scanner scanner = new Scanner(System.in);
        while (m != 1){
            System.out.println("Escolha uma opção: \n1-Criar familiar\n2-Criar amigo\n3-Criar trabalhador\n4-Imprimir todos os contatos\n5-imprimir familia\n" +
            "6-imprimir amigos\n7-imprimir colegas\n8-Imprimir melhores amigos\n9-imprimir contato especifico\n10-encerrar");
            int index = scanner.nextInt();
            switch (index){
                case 1:
                    Familia f = new Familia();
                case 2:
                    Amigos a = new Amigos();
                case 3:
                    Trabalho t = new Trabalho();
                case 4:
                    for (int i =0; i<100;i++){
                        if(contatos[i] != null)
                            contatos[i].imprimirContato();
                    }
                case 5:
                    for (int i =0; i<100;i++){
                        if(contatos[i] != null && contatos[i] instanceof Familia)
                            contatos[i].imprimirContato();
                    }
                case 6:
                    for (int i =0; i<100;i++){
                        if(contatos[i] != null && contatos[i] instanceof Amigos)
                            contatos[i].imprimirContato();
                    }
                case 7:
                    for (int i =0; i<100;i++){
                        if(contatos[i] != null && contatos[i] instanceof Trabalho)
                            contatos[i].imprimirContato();
                    }
                case 8:
                    for (int i =0; i<100;i++){
                        if(contatos[i] != null) {
                            if(contatos[i] instanceof Amigos && ((Amigos) contatos[i]).getTipo() == 1)
                                contatos[i].imprimirContato();
                            if(contatos[i] instanceof Familia && ((Familia) contatos[i]).getParentesco() == "irmão")
                                contatos[i].imprimirContato();
                            if(contatos[i] instanceof Familia && ((Trabalho) contatos[i]).getTipo() == "colega")
                                contatos[i].imprimirContato();
                        }
                    }
                case 9:
                    System.out.println("Digite o index");
                    int c = scanner.nextInt();
                    contatos[c].imprimirContato();
                    if(contatos[c] instanceof Amigos)
                        System.out.println("é um amigo");
                    if(contatos[c] instanceof Trabalho)
                        System.out.println("é um colega de trabalho");
                    if(contatos[c] instanceof Familia)
                        System.out.println("é um familiar");
                case 10:
                    m = 1;
                    break;
            }
        }
    }
}
