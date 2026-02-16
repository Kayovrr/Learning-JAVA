package Core_Java.InterfaceEabistracao;

public class pessoa implements exemplo {

    String nome;
    int idade;

    @Override
    public void falar() {

        System.out.println("a pessoa esta falando");

    }

    @Override
    public void andadar() {

        System.out.println("A pessoa esta andando");

    }

    @Override
    public void comer() {

        System.out.println("A pessoa esta comendo");

    }

    SerVivo novoser = new SerVivo() {
        @Override
        public void respirar() {
            System.out.println("ele respira");
        }
    };


}
