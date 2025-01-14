public class Soluciones {
    double a, b, c;
    public static double calcular_solucion1(double a, double b, double c){

        return ((-1)*b + Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
    }
    public static double calcular_solucion2(double a, double b, double c){

        return ((-1)*b - Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
    }

    public static String limpiar_Campos(){
        return "";
    }
}
