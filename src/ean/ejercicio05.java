package ean;

public class ejercicio05 {
	    
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    
    public static double calcularAreaCoronaCircular(double radioExterno, double radioInterno) {
        double areaExterna = calcularAreaCirculo(radioExterno);
        double areaInterna = calcularAreaCirculo(radioInterno);
        return areaExterna - areaInterna;
    }
    
    public static void main(String[] args) {
        double radioExterno = 10.0;
        double radioInterno = 5.0;
        
        double areaCoronaCircular = calcularAreaCoronaCircular(radioExterno, radioInterno);
        
        System.out.println("El área de la corona circular es: " + areaCoronaCircular);
    }

}
