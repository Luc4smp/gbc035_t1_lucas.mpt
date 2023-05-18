public class Main {
    public static void main(String[] args) {

        ContaCorrente f = new ContaCorrente(1000,5,12345);
        f.debitaValor(50,1000);
        System.out.println("saldo:"+f.getSaldo(100));
        System.out.println("saldo:"+f.getSaldo(12345));
        f.debitaValor(50,12345);
        System.out.println("saldo:"+f.getSaldo(100));
        System.out.println("saldo:"+f.getSaldo(12345));
    }
}