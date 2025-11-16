package Test2_Package.Exercicios;

public class Exercicio_EstruturaCondicionais {
    public static void main(String[] args){
        // dados valores de 1 a 7. imprima se é dia útil ou final de semana
        // considerando 1 como domingo

        byte dia = 2;

        if (dia > 0 && dia <= 7){

            if(dia == 1  || dia == 7){
                System.out.println("É um final de semana");
            }else{
                System.out.println("É um dia útil");
            }
        }else{
            System.out.println("Opção inválída");
        }

        // utilizando switch

        switch (dia){

            case 1:
                System.out.println("É fianal de semana");
                break;
            case 2:
                System.out.println("É dia útil");
                break;
            case 3:
                System.out.println("É dia útil");
                break;
            case 4:
                System.out.println("É dia útil");
                break;
            case 5:
                System.out.println("É dia útil");
                break;
            case 6:
                System.out.println("É dia útil");
                break;
            case 7:
                System.out.println("É fianal de semana");
                break;
            default:
                System.out.println("Opção inválída");
        }
        // outra maneira mais criativa de usar switch

        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
        }

    }
}
