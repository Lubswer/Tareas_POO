package F2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario2 {
    private JPanel contentPane;
    private JButton reiBTN;
    private JRadioButton tv1RBN;
    private JRadioButton si1RBN;
    private JRadioButton no1RBN;
    private JRadioButton tv2RBN;
    private JRadioButton no2RBN;
    private JRadioButton si2RBN;
    private JRadioButton tv3RBN;
    private JRadioButton no3RBN;
    private JButton resBTN;
    private JLabel tituloLB;
    private JLabel p1LB;
    private JLabel p2LB;
    private JLabel p3LB;
    private JLabel r1LB;
    private JLabel r2LB;
    private JLabel r3LB;
    private JLabel re1LB;
    private JLabel re2LB;
    private JLabel re3LB;
    private JLabel resumenLB;
    private JRadioButton si3RBN;
    private JPanel F2pane;
    // === GRUPO 1 ===
    private ButtonGroup grupo1 = new ButtonGroup();
    // === GRUPO 2 ===
    private ButtonGroup grupo2 = new ButtonGroup();
    // === GRUPO 3 ===
    private ButtonGroup grupo3 = new ButtonGroup();
    public Formulario2(){

        grupo1.add(si1RBN);
        grupo1.add(no1RBN);
        grupo1.add(tv1RBN);

        grupo2.add(si2RBN);
        grupo2.add(no2RBN);
        grupo2.add(tv2RBN);

        grupo3.add(si3RBN);
        grupo3.add(no3RBN);
        grupo3.add(tv3RBN);
        resBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String r1 = "";
                String r2 = "";
                String r3 = "";

                if (si1RBN.isSelected()) {
                    r1 = "SI";
                } else if (no1RBN.isSelected()) {
                    r1 = "NO";
                } else if (tv1RBN.isSelected()) {
                    r1 = "TAL VEZ";
                } else {
                    r1 = "Sin opcion seleccionada";
                }

                if (si2RBN.isSelected()) {
                    r2 = "SI";
                } else if (no2RBN.isSelected()) {
                    r2 = "NO";
                } else if (tv2RBN.isSelected()) {
                    r2 = "TAL VEZ";
                } else {
                    r2 = "Sin opcion seleccionada";
                }

                if (si3RBN.isSelected()) {
                    r3 = "SI";
                } else if (no3RBN.isSelected()) {
                    r3 = "NO";
                } else if (tv3RBN.isSelected()) {
                    r3 = "TAL VEZ";
                } else {
                    r3 = "Sin opcion seleccionada";
                }
                re1LB.setText(r1);
                re2LB.setText(r2);
                re3LB.setText(r3);
            }
        });
        reiBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpia grupos
                grupo1.clearSelection();
                grupo2.clearSelection();
                grupo3.clearSelection();

                // Limpia labels
                re1LB.setText("-");
                re2LB.setText("-");
                re3LB.setText("-");
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Formulario2");
        frame.setContentPane(new Formulario2().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }

}