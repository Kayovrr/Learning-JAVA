package Introducao_Java.basico;

public class OperadoresAritimeticos {
    public static void main(String[] args){

        // + - / *
        int num1 = 123;
        int num2 = 321;
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        double divisao = num1 /(double) num2; // < nesse caso se o tipo da variavel fosse int ele vai retornar apenas 0.
        int multiplicacao = num1 * num2;

        // %
        int resto = 21 % 7;

        // < > <= >= == != // < esses operadores sempre vão retornar valores aritiméticos
        boolean isQuarentaMaiorQueDois = 40 > 2;
        boolean isQarentaMenorQueDois = 40 < 2;
        boolean isQuarentaIgualDois = 40 == 2;
        boolean isQuarentaDiferenteDois = 40 != 2;
        boolean isQuarentaMenorIgualDois = 40 <= 2;
        boolean isQuarentaMaiorIgualDois = 40 >= 2;

        System.out.println(isQuarentaMaiorQueDois);
    }
}
