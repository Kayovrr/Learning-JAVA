import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Caulculadora implements ActionListener {

    JButton sete,oito,nove,mul,quatro,cinco,seis,sub,um,dois,tres,soma,zero,igual,div;
    JTextField campo1,campo2,campo3;
    JTextField resultado;
    JButton desfazer,x;

    public Caulculadora() {

        JFrame Principal = new JFrame("Calculadora");

        // parte de cima
        JPanel parte_de_cima = new JPanel(new FlowLayout(FlowLayout.CENTER,50,20));
        desfazer = new JButton("Desfazer");
        parte_de_cima.add(desfazer);
        x = new JButton("x");
        parte_de_cima.add(x);

        // parte do meio
        JPanel parte_do_meio = new JPanel(new GridLayout(1,3));
        campo1 = new JTextField();
        campo2 = new JTextField();
        campo3 = new JTextField();
        parte_do_meio.add(campo3);
        parte_do_meio.add(campo1);
        parte_do_meio.add(campo2);


        // parte de bauxo
        JPanel parte_de_baixo = new JPanel();
        parte_de_baixo.setLayout(new GridLayout(4,0));

        // F1
        JPanel primeira_fileira = new JPanel ();
        parte_de_baixo.add(primeira_fileira);
        primeira_fileira.setLayout(new GridLayout(1,4));
        sete = new JButton("7");
        oito = new JButton("8");
        nove = new JButton("9");
        mul = new JButton("X");

        sete.addActionListener(this);
        oito.addActionListener(this);
        nove.addActionListener(this);
        mul.addActionListener(this);

        parte_de_baixo.add(sete);
        parte_de_baixo.add(oito);
        parte_de_baixo.add(nove);
        parte_de_baixo.add(mul);

        // F2
        JPanel segunda_fileira = new JPanel ();
        parte_de_baixo.add(segunda_fileira);
        segunda_fileira.setLayout(new GridLayout(1,4));
        quatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        sub = new JButton("-");

        quatro.addActionListener(this);
        cinco.addActionListener(this);
        seis.addActionListener(this);
        sub.addActionListener(this);

        parte_de_baixo.add(quatro);
        parte_de_baixo.add(cinco);
        parte_de_baixo.add(seis);
        parte_de_baixo.add(sub);

        // F3
        JPanel terceira_fileira = new JPanel ();
        parte_de_baixo.add(terceira_fileira);
        terceira_fileira.setLayout(new GridLayout(1,4));
        um = new JButton("1");
        dois = new JButton("2");
        tres = new JButton("3");
        soma = new JButton("+");

        um.addActionListener(this);
        dois.addActionListener(this);
        tres.addActionListener(this);
        soma.addActionListener(this);

        parte_de_baixo.add(um);
        parte_de_baixo.add(dois);
        parte_de_baixo.add(tres);
        parte_de_baixo.add(soma);

        // F4
        JPanel quarta_fileira = new JPanel ();
        parte_de_baixo.add(quarta_fileira);
        quarta_fileira.setLayout(new GridLayout(1,3));
        zero = new JButton("0");
        igual = new JButton("=");
        div = new JButton("/");

        zero.addActionListener(this);
        igual.addActionListener(this);
        div.addActionListener(this);

        parte_de_baixo.add(zero);
        parte_de_baixo.add(igual);
        parte_de_baixo.add(div);

        Principal.add(parte_de_cima, BorderLayout.NORTH);
        Principal.add(parte_do_meio, BorderLayout.CENTER);
        Principal.add(parte_de_baixo, BorderLayout.SOUTH);

        Principal.pack();
        Principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Principal.setVisible(true);

    }
        // Código quebrado,em desenvolvimento
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botao = (JButton) e.getSource();
        String texto = botao.getText();

        String n1 = "";
        String n2 = "";
        String operacao = "";
        boolean fase1 = true; // digitando o primeiro número

        switch (texto) {

            // NÚMEROS
            case "0": case "1": case "2": case "3":
            case "4": case "5": case "6": case "7":
            case "8": case "9":

                if (fase1) {
                    n1 += texto;
                    campo1.setText(n1);
                } else {
                    n2 += texto;
                    campo1.setText(n2);
                }
                break;

            // OPERAÇÕES

            case "+": case "-": case "X": case "/":
                operacao = texto;
                fase1 = false;
                campo2.setText(n1 + " " + operacao);
                campo1.setText("");
                break;
            case "=":

                if (n1.isEmpty() || n2.isEmpty()) {
                    break;
                }

                double a = Double.parseDouble(n1);
                double b = Double.parseDouble(n2);
                double r = 0;

                switch (operacao) {
                    case "+":
                        r = a + b;
                        break;
                    case "-":
                        r = a - b;
                        break;
                    case "X":
                        r = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            campo1.setText("Erro");
                            return;
                        }
                        r = a / b;
                        break;
                }

                campo1.setText(String.valueOf(r));
                campo2.setText("");
                n1 = String.valueOf(r);
                n2 = "";
                fase1 = true;
                operacao = "";
                break;

        }
    }

    public static void main(String[] args) {
        new Caulculadora();
    }
}
