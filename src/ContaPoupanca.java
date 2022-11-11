public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void sacar(double valor){
        if(saldo >= valor)
            saldo -= valor;
        else
            System.out.println("Saldo Insuficiente");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (saldo >= valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}