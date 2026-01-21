import javax.swing.*;
import java.awt.*;


public class interfaceSwingJava1 {

    public static void main(String[] args){

        JFrame aplicacao = new JFrame("Aplicação simples");
        JPanel area1 = new JPanel();
        area1.setSize(300,60);
        JTextField textoNome = new JTextField(20);
        JLabel label1 = new JLabel("nome");

        area1.add(label1);
        area1.add(textoNome);

        JPanel area2 = new JPanel();
        JLabel label2 = new JLabel("Endereço");
        JTextField textoEneder = new JTextField(20);
        area2.setSize(300,60);

        area2.add(label2);
        area2.add(textoEneder);

        JPanel conteinerprincipal = new JPanel(new GridLayout(2,1));
        JPanel area3 = new JPanel();
        area3.setLayout(new FlowLayout(FlowLayout.LEFT,5,0));
        area3.add(new JLabel("  Resp:"));
        JTextField textoresp = new JTextField(20);

        conteinerprincipal.add(area3);
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        JButton ok = new JButton("Ok");
        JButton cancel = new JButton("Cancelar");
        painelBotoes.add(ok);
        painelBotoes.add(cancel);

        conteinerprincipal.add(painelBotoes);
        area2.setSize(300,60);
        area3.add(textoresp);

        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(area1,BorderLayout.NORTH);
        aplicacao.add(area2,BorderLayout.CENTER);
        aplicacao.add(conteinerprincipal,BorderLayout.SOUTH);
        aplicacao.pack();
        aplicacao.setVisible(true);
    }

}
