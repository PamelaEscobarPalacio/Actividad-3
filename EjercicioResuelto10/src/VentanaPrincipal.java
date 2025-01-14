import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JPanel VentanaPrincipal;
    private JTextField txtNumeroInscripcion;
    private JTextField txtNombres;
    private JTextField txtPatrimonio;
    private JTextField txtEstratoSocial;
    private JTextField txtPagoMatricula;
    private JButton btnCalcular;
    private JButton btnLimpiar;
    private JLabel lblNumeroInscripcion;
    private JLabel lblNombres;
    private JLabel lblPatrimonio;
    private JLabel lblEstratoSocial;
    private JLabel lblPagoMatricula;

    public VentanaPrincipal() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double pagmat= 50000;
                double pat=Double.parseDouble(txtPatrimonio.getText());
                double es=Double.parseDouble(txtEstratoSocial.getText());
                double inscripcion= Double.parseDouble(txtNumeroInscripcion.getText());
                String nombres= String.valueOf(txtNombres.getText());

                Pago p= new Pago(pat, es, pagmat);
                pagmat = p.valor_a_pagar();
                inscripcion=p.obtenerInscripcion(inscripcion);
                nombres=p.obtenerNombres(nombres);


                txtPagoMatricula.setText(String.valueOf(pagmat));
                txtNumeroInscripcion.setText(String.valueOf(inscripcion));
                txtNombres.setText(String.valueOf(nombres));

            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumeroInscripcion.setText(Pago.Limpiar_Campo());
                txtNombres.setText(Pago.Limpiar_Campo());
                txtPatrimonio.setText(Pago.Limpiar_Campo());
                txtEstratoSocial.setText(Pago.Limpiar_Campo());
                txtPagoMatricula.setText(Pago.Limpiar_Campo());

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
