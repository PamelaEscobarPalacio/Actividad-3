/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author USUARIO UNO
 */
public class Rombo {
    int D,d;
    int lado;
    public Rombo(int D, int d, int lado) {
        this.lado = lado;
        this.D = D;
        this.d = d;
        
    }
    double calcularArea() {
        return (D*d)/2;
    }
    double calcularPerimetro() {
        return (lado+lado+lado+lado);
    }
       static String LimpiarCampo(){
        return "";
    }
    
}
