package F1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario1{
    private JPanel contentPane;
    private JTextField numero1TF;
    private JTextField numero2TF;
    private JButton sumarBTN;
    private JButton restarBTN;
    private JButton multiplicarBTN;
    private JButton dividirBTN;
    private JTextField resultadoTF;
    private JButton limpiarBTN;
    private JLabel resultadoLB;
    private JLabel numero1LB;
    private JLabel numero2LB;
    private JLabel tituloLB;
    private JLabel ordenLB;


    public Formulario1() {
        sumarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String text1 = numero1TF.getText();
                    String text2 = numero2TF.getText();
                    double numero1 = Double.parseDouble(text1);
                    double numero2 = Double.parseDouble(text2);
                    double resultadonum = numero1 + numero2;
                    String resultado = String.valueOf(resultadonum);
                    resultadoTF.setText( text1 + " + " + text2 + " = "+ resultado);
                }catch (NumberFormatException nfe){
                    resultadoTF.setText("ERROR! Ingrese numeros");
                }
            }
        });
        restarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String text1 = numero1TF.getText();
                    String text2 = numero2TF.getText();
                    double numero1 = Double.parseDouble(text1);
                    double numero2 = Double.parseDouble(text2);
                    double resultadonum = numero1 - numero2;
                    String resultado = String.valueOf(resultadonum);
                    resultadoTF.setText( text1 + " - " + text2 + " = "+ resultado);
                }catch (NumberFormatException nfe){
                    resultadoTF.setText("ERROR! Ingrese numeros");
                }
            }
        });
        multiplicarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String text1 = numero1TF.getText();
                    String text2 = numero2TF.getText();
                    double numero1 = Double.parseDouble(text1);
                    double numero2 = Double.parseDouble(text2);
                    double resultadonum = numero1 * numero2;
                    String resultado = String.valueOf(resultadonum);
                    resultadoTF.setText( text1 + " x " + text2 + " = "+ resultado);
                }catch (NumberFormatException nfe){
                    resultadoTF.setText("ERROR! Ingrese numeros");
                }

            }
        });
        dividirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String text1 = numero1TF.getText();
                    String text2 = numero2TF.getText();
                    double numero1 = Double.parseDouble(text1);
                    double numero2 = Double.parseDouble(text2);
                    if(numero2 == 0){
                        throw new IllegalArgumentException("Numero2 es 0");
                    }
                    double resultadonum = numero1 / numero2;
                    String resultado = String.valueOf(resultadonum);
                    resultadoTF.setText( text1 + " / " + text2 + " = "+ resultado);
                }catch (NumberFormatException nfe){
                    resultadoTF.setText("ERROR! Ingrese numeros");
                }catch (IllegalArgumentException iae){
                    resultadoTF.setText("Error! " + iae.getMessage());
                }
            }
        });
        limpiarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero1TF.setText("");
                numero2TF.setText("");
                resultadoTF.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario1");
        frame.setContentPane(new Formulario1().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
