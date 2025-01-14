import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JPanel VentanaPrincipal;
    private JTextField txtA;
    private JTextField txtB;
    private JTextField txtResultado;
    private JButton btbCalcular;
    private JButton btnLimpiar;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblResultado;

    public VentanaPrincipal() {
        btbCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                String resultado = Identificar.Identificar(a,b);
                txtResultado.setText(String.valueOf(resultado));
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtA.setText(Identificar.limpiar_Campo());
                txtB.setText(Identificar.limpiar_Campo());
                txtResultado.setText(Identificar.limpiar_Campo());
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
}
