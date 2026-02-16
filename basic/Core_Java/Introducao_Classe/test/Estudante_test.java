package Core_Java.Introducao_Classe.test;
import Core_Java.Introducao_Classe.Dominio.Estudante;

public class Estudante_test {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        estudante.idade = 45;
        estudante.nome = "Marcelinho";
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
