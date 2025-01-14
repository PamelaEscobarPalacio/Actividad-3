public class Identificar {
    double a;
    double b;

    public static String Identificar(double a, double b) {
        if (a > b) {
            return "A es mayor que B";
        } else if (a == b) {
            return ("A es igual que B");
        } else {
            return ("A es menor que B");
        }
    }
public static String limpiar_Campo(){
        return "";
    }
}