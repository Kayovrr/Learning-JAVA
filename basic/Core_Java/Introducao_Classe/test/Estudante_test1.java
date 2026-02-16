package Core_Java.Introducao_Classe.test;

import Core_Java.Introducao_Classe.Dominio.Estudante;

public class Estudante_test1 {
    public static void main(String[] args){

        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.nome = "Milton";
        estudante.idade = 51;
        estudante.sexo = 'M';

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);

        System.out.println("====================");

        estudante1.nome = "Jasmin";
        estudante1.idade = 21;
        estudante1.sexo = 'F';

        System.out.println(estudante1.idade);
        System.out.println(estudante1.nome);
        System.out.println(estudante1.sexo);

    }
}
