package Introducao_Java.basico;

public class OperadoresLogicos {
    public static void main(String[] args){
        // && (AND), || (OR), ! (NOT)

        int idade = 20;
        boolean TemAmigoPoderoso = true;
        String sexo = "Masculino";
        int idade_de_contibuicao = 2;
        boolean IsPodeSeAposentar = sexo == "Masculino" && idade == 65 && idade_de_contibuicao == 15 || sexo == "Feminino" && idade == 62 && idade_de_contibuicao == 15 || TemAmigoPoderoso != false;

        // = += -= *= /= %=
        double bonus = 1200;
        bonus += 200;
        bonus -= 2;
        bonus *= 3;
        bonus /= 3;
        bonus %= 2;

        // ++ --

        int contador = 0;
        contador ++;
        contador --;
        ++ contador;
        -- contador;
        System.out.println(contador);





    }
}
