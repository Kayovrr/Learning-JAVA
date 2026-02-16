package Introducao_Java;

public class ContaBancaria {
    String nome_do_proprietario;
    double saldo;
    int numero_da_conta;
    int agencia;

    public ContaBancaria(String nome_do_proprietario, double saldo, int numero_da_conta, int agencia) {
        this.nome_do_proprietario = nome_do_proprietario;
        this.saldo = saldo;
        this.numero_da_conta = numero_da_conta;
        this.agencia = agencia;
    }

    public double verSaldo() {
        System.out.println("O saldo é de " + this.saldo + "$");
        return this.saldo;
    }

    public double depositar(double valor) {
        if (valor >= (double)0.0F) {
            System.out.println("Seu saldo era de " + this.saldo);
            this.saldo += valor;
            System.out.println("Agora é de " + this.saldo);
        } else {
            System.out.println("Operação invalida");
        }

        return this.saldo;
    }

    public double sacar(double valor) {
        if (valor <= this.saldo) {
            System.out.println("Seu saldo era de " + this.saldo);
            this.saldo -= valor;
            System.out.println("Seu saldo é de " + this.saldo);
        } else {
            System.out.println("Operação invalida");
        }

        return this.saldo;
    }

    public void exibir_proprietario() {
        System.out.println("\nNome do proprietario: " + this.nome_do_proprietario + "\nNúmero da conta:" + this.numero_da_conta + "\nNúmero da agência:" + this.agencia + "\nSaldo na conta " + this.saldo);
    }

    public static void main() {
        ContaBancaria cliente1 = new ContaBancaria("Jozefo Fulano da Silva", (double)30.0F, 123456789, 7887);
        ContaBancaria cliente2 = new ContaBancaria("Zephyra Algusta Wisniewski", (double)18532.5F, 987654321, 8778);
        cliente1.depositar((double)1000.0F);
        cliente2.sacar((double)0.5F);
        cliente2.exibir_proprietario();
    }
}
