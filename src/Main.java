import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Cliente wellington = new Cliente("Wellington","10234567890", LocalDate.of(1991,6,8));
        Cliente carol = new Cliente("Carol", "10234567891",LocalDate.of(1993,12,30));

        Conta cc1 = new ContaCorrente(wellington);
        Conta cp1 = new ContaPoupanca(wellington);
        Conta cc2 = new ContaCorrente(carol);
        Conta cp2 = new ContaPoupanca(carol);

        cc1.depositar(100);
        cc1.transferir(20, cp2);
        cc1.sacar(100);


        cc1.imprimirExtrato();
        cp2.imprimirExtrato();


    }

}