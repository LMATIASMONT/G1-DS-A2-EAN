package ean;

public class ejercicio03 {
	    
    public static double calcularLongitudEscalera(double alturaPared, double angulo) {
        double anguloRadianes = Math.toRadians(angulo);
        
        double longitudEscalera = alturaPared / Math.sin(anguloRadianes);
        
        return longitudEscalera;
    }
    
    public static void main(String[] args) {
        double alturaPared = 5.0;
        
        double angulo = 30.0;
        
        double longitud = calcularLongitudEscalera(alturaPared, angulo);
        
        System.out.println("La longitud de la escalera es: " + longitud);
    }

}
