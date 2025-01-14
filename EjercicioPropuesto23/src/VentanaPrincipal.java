import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JPanel VentanaPrincipal;
    private JButton btnCalcular;
    private JButton btnLimpiar;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtC;
    private JTextField txtSolucion1;
    private JTextField txtSolucion2;
    private JLabel valorDeALabel;

    public VentanaPrincipal() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a,b,c, solucion1, solucion2;
                a= Double.parseDouble(txtA.getText());
                b= Double.parseDouble(txtB.getText());
                c= Double.parseDouble(txtC.getText());
                solucion1= Soluciones.calcular_solucion1(a,b,c);
                solucion2= Soluciones.calcular_solucion2(a,b,c);
                txtSolucion1.setText(String.valueOf(solucion1));
                txtSolucion2.setText(String.valueOf(solucion2));
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText(Soluciones.limpiar_Campos());
                txtB.setText(Soluciones.limpiar_Campos());
                txtC.setText(Soluciones.limpiar_Campos());
                txtSolucion1.setText(Soluciones.limpiar_Campos());
                txtSolucion2.setText(Soluciones.limpiar_Campos());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().VentanaPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
