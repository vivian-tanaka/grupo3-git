package aula4.exercicio2;

public class ContaCorrente {

    private double saldo;
    private String titular;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public ContaCorrente(ContaCorrente contaCorrente) {
        this.saldo = contaCorrente.getSaldo();
        this.titular = contaCorrente.getTitular();
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(isSaldoSuficiente(valor)) {
            this.saldo -= valor;
        }else {
            System.out.printf("Não há saldo suficiente.\nSaldo atual: %.2f\nValor do saque: %.2f", this.saldo, valor);
        }
    }

    public void transferir(ContaCorrente contaCorrente, double valor) {
        if(isSaldoSuficiente(valor)) {
            this.saldo -= valor;
            contaCorrente.depositar(valor);
        }else{
            System.out.printf("Não há saldo suficiente.\nSaldo atual: %.2f\nValor da transferencia: %.2f", this.saldo, valor);
        }
    }

    private boolean isSaldoSuficiente(double valor) {
        return this.saldo >= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
