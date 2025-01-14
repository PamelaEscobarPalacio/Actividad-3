/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author USUARIO UNO
 */
public class TrianguloRectangulo {
    int base;
    int altura;
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

double calcularArea() {
return (base * altura / 2);
}

double calcularPerimetro() {
return (base + altura + calcularHipotenusa()); /* Invoca al
método calcular hipotenusa */
}
double calcularHipotenusa() {
return Math.pow(base*base + altura*altura, 0.5);
}

String determinarTipoTriangulo() {
    String tipo = null;
    if ((base == altura) && (base == calcularHipotenusa()) && (altura== calcularHipotenusa())){
        tipo= "equilatero";
    }
    else if 
            ((base != altura) && (base != calcularHipotenusa()) &&(altura != calcularHipotenusa())){
            tipo= "escaleno";
    }
    else{
        tipo= "isosceles";
}
    return tipo;
}
static String LimpiarCampo(){
        return "";
    }
}
