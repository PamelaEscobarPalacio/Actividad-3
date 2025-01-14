public class TEquilatero {int lado;
    TEquilatero(int lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return (Math.pow(lado,2)* Math.sqrt(3))/4;
    }

    double calcularHipotenusa() {
        return (lado* Math.sqrt(3))/2;
    }

    double calcularPerimetro() {
        return 3*lado;
    }

}
