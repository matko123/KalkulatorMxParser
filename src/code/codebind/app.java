package code.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  org.mariuszgromada.math.mxparser.*;

public class app {



    private JPanel panel1;
    private JTextField textField1;
    private JButton a1Button;
    private JButton a9Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton clearButton;
    private JButton button4;
    private JButton button5;
    private JTextField rezultat;
    private JButton a0Button;
    private JButton button6;

    String cifra;


    public app() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "9");
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "+");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "-");
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "*");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "0");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + "/");
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cifra = textField1.getText();
                textField1.setText(cifra + ".");

            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String a = textField1.getText();

                if(a.equals(""))
                {
                    System.out.println("NAPAKA");
                }
                else
                {
                    System.out.println(a);

/*
                    String operators[]=a.split("[0-9]+");
                    String operands[]=a.split("[+-/*]");


                    double agregate = Double.parseDouble(operands[0]);


                    for(int i=1;i<operands.length;i++){

                        if(operators[i].equals("*"))
                            agregate = agregate * Double.parseDouble(operands[i]);
                        else if(operators[i].equals("/"))
                            agregate = agregate / Double.parseDouble(operands[i]);
                        else if(operators[i].equals("+"))
                            agregate += Double.parseDouble(operands[i]);
                        else if(operators[i].equals("-"))
                            agregate -= Double.parseDouble(operands[i]);

                    }
                    System.out.println(agregate);
                    rezultat.setText(String.valueOf(agregate));

*/
                    Expression l = new Expression(a);
                    double v = l.calculate();
                    System.out.println(v);
                    rezultat.setText(String.valueOf(v));

                }
                }

        });


    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new app().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
