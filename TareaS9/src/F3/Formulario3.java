package F3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Formulario3 {
    private JPanel contentPane;
    private JCheckBox progCB;
    private JCheckBox redCB;
    private JCheckBox bddCB;
    private JCheckBox diCB;
    private JCheckBox seiCB;
    private JButton procesarSeleccionButton;
    private JButton limpiarSeleccionButton;
    private ArrayList <String> acciones = new ArrayList<>();



    public Formulario3(){

        procesarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(progCB.isSelected()){
                    acciones.add("Programacion");
                }
                if(redCB.isSelected()){
                    acciones.add("Redes");
                }
                if(bddCB.isSelected()){
                    acciones.add("Bases de Datos");
                }
                if(diCB.isSelected()){
                    acciones.add("Diseño de Interfaces");
                }
                if(seiCB.isSelected()){
                    acciones.add("Seguridad Informatica");
                }
                StringBuilder sb = new StringBuilder();

                for (String i : acciones) {
                    sb.append("• ").append(i).append("\n");
                }

                if (acciones.isEmpty()) {
                    sb.append("No seleccionaste ningún interés.");
                }

                JOptionPane.showMessageDialog(
                        null,
                        sb.toString(),
                        "Intereses seleccionados",
                        JOptionPane.PLAIN_MESSAGE
                );
                acciones.clear();

            }
        });
        limpiarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acciones.clear();
                JCheckBox[] listaChecks = {progCB, redCB, bddCB, diCB, seiCB};
                for (JCheckBox check : listaChecks) {
                    check.setSelected(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario3");
        frame.setContentPane(new Formulario3().contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
