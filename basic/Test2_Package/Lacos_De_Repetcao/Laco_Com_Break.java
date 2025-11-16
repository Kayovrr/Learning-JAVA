package Test2_Package.Lacos_De_Repetcao;

public class Laco_Com_Break {
    public static void main(String[] args){
        // Imprime todos os números multiplos de 2 ate 1000
        for (int i=1; i<=100; i++){
            // porém se o número for maior que 20, o programa para
            if (i > 20) {
                break;
            }
            else if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
