public class Universidade {
    private String nomeUni;
    private String dataFundacao;
    private Estudante[] Alunos = new Estudante[100];
    public Universidade(String n, String d, Estudante[] Es){
        nomeUni = n;
        dataFundacao = d;
        Alunos = Es;
    }
    public void MostrarAlunos(){
        int grad = 0;
        int mes = 0;
        int dout = 0;
        for(int i =0; i <100; i ++)
        {
            if(Alunos[i] != NULL){
                if(Alunos[i] instanceof EstudanteGraduacao)
                    grad++;
                if(Alunos[i] instanceof EstudanteMestrado)
                    mes++;
                if(Alunos[i] instanceof EstudanteDoutorado)
                    dout++;
            }
        }
    }

    public void Mostrar(){
        for(int i =0; i <100; i ++)
        {
            if(Alunos[i] != NULL){
                Alunos[i].print();
                if(Alunos[i] instanceof EstudanteDoutorado)
                    System.out.println("titulo da tese: " + ((EstudanteDoutorado) Alunos[i]).getTituloTese());
            }
        }
    }
    public void Copia(int tam, Estudante[] es){
        if (tam <= 100){
            es = Alunos;
        }
        for(int i =0; i <100; i ++)
        {
            es[i].print();
        }

    }
}
