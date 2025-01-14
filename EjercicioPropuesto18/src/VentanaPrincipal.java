import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JPanel VentanaPrincipal;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtNHTM;
    private JTextField txtVHT;
    private JTextField txtRetencion;
    private JTextField txtSalarioBruto;
    private JTextField txtSalarioNeto;
    private JButton btnCalcular;
    private JButton btnLimpiar;

    public VentanaPrincipal() {
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCodigo.setText("");
                txtNombre.setText("");
                txtNHTM.setText("");
                txtVHT.setText("");
                txtRetencion.setText("");
                txtNHTM.setText("");
                txtSalarioBruto.setText("");
                txtSalarioNeto.setText("");

            }
        });
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int nhtm;
                double vht;
                int retencion;

                double salariobruto;
                double salarioneto;

                nhtm=Integer.parseInt(txtNHTM.getText());
                vht=Double.parseDouble(txtVHT.getText());
                retencion=Integer.parseInt(txtRetencion.getText());

                Nomina n= new Nomina(nhtm,vht,retencion);

                salariobruto=n.calcularSalarioBruto();
                salarioneto=n.calcularSalarioNeto();


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
