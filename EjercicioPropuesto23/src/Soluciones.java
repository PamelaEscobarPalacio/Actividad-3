public class Soluciones {
    public static double calcular_solucion1(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("El coeficiente 'a' no puede ser cero.");
        }
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        if (discriminante < 0) {
            throw new IllegalArgumentException("El discriminante es negativo, no hay soluciones reales.");
        }
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public static double calcular_solucion2(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("El coeficiente 'a' no puede ser cero.");
        }
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        if (discriminante < 0) {
            throw new IllegalArgumentException("El discriminante es negativo, no hay soluciones reales.");
        }
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static String limpiar_Campos() {
        return "";
    }
}