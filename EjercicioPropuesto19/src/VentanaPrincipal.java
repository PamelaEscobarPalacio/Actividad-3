import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JPanel VentanaPrincipal;
    private JTextField txtLado;
    private JTextField txtArea;
    private JTextField txtHipotenusa;
    private JTextField txtPerimetro;
    private JButton btnCalcular;
    private JButton btnLimpiar;

    public VentanaPrincipal() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int lado;
                double area, hipotenusa, perimetro;

                lado= Integer.parseInt(txtLado.getText());
                TEquilatero triangulo= new TEquilatero(lado);
                area=triangulo.calcularArea();
                hipotenusa= triangulo.calcularHipotenusa();
                perimetro= triangulo.calcularPerimetro();

                txtArea.setText(String.valueOf(area));
                txtHipotenusa.setText(String.valueOf(hipotenusa));
                txtPerimetro.setText(String.valueOf(perimetro));
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLado.setText("");
                txtArea.setText("");
                txtHipotenusa.setText(String.valueOf(""));
                txtPerimetro.setText(String.valueOf(""));
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
