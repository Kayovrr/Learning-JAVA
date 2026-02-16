package Test2_Package.basico;

public class OperadoresTernarios {
    public static void  main(String[] args){
        double salario = 9000;

        String mensagemDoar = "Eu vou dar dinheiro para a caridade";
        String mensagemNaoDoar = "Eu não posso doar dinheiro para a caridade";
        String resltado = (salario > 5000) ? mensagemDoar:mensagemNaoDoar;

        System.out.println(resltado);
    }
}
