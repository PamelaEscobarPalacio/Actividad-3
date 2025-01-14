public class Empleado {
    public static double calcular_salario_mensual(double salario_basico_hora, double numero_horas_trabajadas){
    double salario_mensual;

    salario_mensual= salario_basico_hora * numero_horas_trabajadas;

    if (salario_mensual>450000){
        return salario_mensual;

    }
    else{
        return salario_mensual;}
    }

    public static String set_Nombre(String nombre){
        return nombre;
    }
    public static String Limpiar_Campos(){
       return"";
    }
}
