package Core_Java.Introducao_Metodos.Test;
import Core_Java.Introducao_Metodos.Dominio.Calculadora;
// test de parâmetros
public class Calculadora_test4 {
    public static void main(String[] args){

        Calculadora calculadora = new Calculadora();

        int a = 3;
        int b = 1;

        calculadora.alteraDoisNumeros(a,b);
        System.out.println("num1="+a);
        System.out.println("num1="+b);

    }
}
