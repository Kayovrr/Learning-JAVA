import javax.swing.*;
import java.awt.*;

public class InterfaceSwingJava2 {

    public static void main(String[] args) {

        JFrame aplicacao = new JFrame("Aplicação simples");

        JPanel botoes1 = new JPanel();
        botoes1.setLayout(new GridLayout(0,5));
        botoes1.add(new JButton("()"));
        botoes1.add(new JButton("BUT:1"));
        botoes1.add(new JButton("BUT:2"));
        botoes1.add(new JButton("BUT:3"));
        botoes1.add(new JButton("BUT:4"));


        JPanel botoes2 = new JPanel();
        botoes2.setLayout(new GridLayout(5,0));
        botoes2.add(new JButton("BUT;1"));
        botoes2.add(new JButton("BUT;2"));
        botoes2.add(new JButton("BUT;3"));
        botoes2.add(new JButton("BUT;4"));
        botoes2.add(new JButton("BUT;5"));

        JPanel campo = new JPanel();
        campo.setLayout( new FlowLayout(FlowLayout.CENTER,5,5));
        JTextField campotex = new JTextField(30);
        campo.add(campotex);

        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(botoes1,BorderLayout.NORTH);
        aplicacao.add(botoes2,BorderLayout.WEST);
        aplicacao.add(campo,BorderLayout.SOUTH);

        aplicacao.pack();
        aplicacao.setVisible(true);




    }
}
