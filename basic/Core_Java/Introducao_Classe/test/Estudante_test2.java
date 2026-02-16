package Core_Java.Introducao_Classe.test;

import Core_Java.Introducao_Classe.Dominio.Estudante;

public class Estudante_test2 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Ze";
        estudante1.idade = 2;
        estudante1.sexo = 'M';

        estudante2.nome = "Mario";
        estudante2.idade = 51;
        estudante2.sexo = 'M';

        estudante1.imprime();
        estudante2.imprime();

    }
}