public class Nomina {
    int nhtm;
    double vht;
    int retencion;

    Nomina(int nhtm,double vht, int retencion){
        this.nhtm=nhtm;
        this.vht=vht;
        this.retencion=retencion;

    }
    double calcularSalarioBruto() {
        return nhtm*vht;
    }

    double calcularSalarioNeto() {
        return (nhtm*vht)-((nhtm*vht)*(retencion/100));
}}