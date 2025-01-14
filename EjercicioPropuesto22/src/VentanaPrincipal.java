import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal {
    private JPanel VentanaPrincipal;
    private JTextField txtNombreEntrada;
    private JTextField txtBasicoHora;
    private JTextField txtHorasTrabajadas;
    private JTextField txtSalarioMensual;
    private JTextField txtNombreSalida;
    private JButton btnLimpiar;
    private JButton btnCalcular;

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaPrincipal");
        frame.setContentPane(new VentanaPrincipal().VentanaPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public VentanaPrincipal() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double BasicoHora, numero_horas_trabajadas, salario_mensual;
                String nombre;

                nombre = String.valueOf(txtNombreEntrada.getText());
                BasicoHora= Double. parseDouble(txtBasicoHora.getText());
                numero_horas_trabajadas= Double. parseDouble(txtHorasTrabajadas.getText());
                salario_mensual=Empleado.calcular_salario_mensual(BasicoHora,numero_horas_trabajadas);
                txtSalarioMensual.setText(String.valueOf(salario_mensual));
                txtNombreSalida.setText(String.valueOf(Empleado.set_Nombre(nombre)));

            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            txtNombreEntrada.setText(Empleado.Limpiar_Campos());
            txtBasicoHora.setText(Empleado.Limpiar_Campos());
            txtHorasTrabajadas.setText(Empleado.Limpiar_Campos());
            txtSalarioMensual.setText(Empleado.Limpiar_Campos());
            txtNombreSalida.setText(Empleado.Limpiar_Campos());
            }
        });



    }
}
