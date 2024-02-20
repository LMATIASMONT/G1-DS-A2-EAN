package ean;
import java.lang.Math;

public class ejercicio07 {
	    
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }
    
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }
    
    public static void main(String[] args) {
        double x1 = 1.0;
        double y1 = 2.0;
        double x2 = 4.0;
        double y2 = 6.0;
        
        double distancia = calcularDistancia(x1, y1, x2, y2);
        
        double pendiente = calcularPendiente(x1, y1, x2, y2);
        
        System.out.println("Distancia entre los dos puntos: " + distancia);
        System.out.println("Pendiente de la recta que une los dos puntos: " + pendiente);
    }

}
