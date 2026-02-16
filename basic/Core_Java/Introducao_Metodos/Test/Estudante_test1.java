package Core_Java.Introducao_Metodos.Test;
import Core_Java.Introducao_Metodos.Dominio.Estudante;
import Core_Java.Introducao_Metodos.Dominio.Imprime_Estudante;

// test parâmetros de referência

public class Estudante_test1 {
    public static void main(String[] args){

        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        Imprime_Estudante impressora = new Imprime_Estudante();

        estudante1.nome = "Jose";
        estudante1.idade = 33;
        estudante1.sexo = 'M';


        estudante.nome = "maria";
        estudante.idade = 56;
        estudante.sexo = 'F';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

        System.out.println("======================");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


        // Ultilizando o método imprime_Esetudante

        impressora.imprime(estudante);

        impressora.imprime(estudante1);


    }
}
