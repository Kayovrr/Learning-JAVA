package Introducao_Java;

public class exercicio {

    public static void main(String[] args) {

        Conta conta = new Conta()

        try {
            conta.sacar(150);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
