public class Pago {
    double pat;
    double es;
    double pagmat= 50000;

    Pago(double pat, double es, double pagmat){
        this.pat=pat;
        this.es=es;
        this.pagmat=pagmat;
    }
    public double valor_a_pagar(){
        if((pat>2000000) && (es>3)) {
            pagmat= pagmat+0.03 * pat;
        }
        return pagmat;

    }

    public Double obtenerInscripcion(double inscripcion){
        return inscripcion;
    }

    public String obtenerNombres(String nombre){
        return nombre;
    }

    public static String Limpiar_Campo(){
        return"";
    }

}
