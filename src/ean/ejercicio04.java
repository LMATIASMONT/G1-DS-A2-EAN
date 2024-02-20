package ean;

public class ejercicio04 {
	    
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.4;
    }
    
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }
    
    public static void main(String[] args) {
        double sueldo = 1000.0;
        
        double gastoArriendo = calcularGastoArriendo(sueldo);
        
        double gastoComida = calcularGastoComida(sueldo);
        
        double dineroRestante = sueldo - gastoArriendo - gastoComida;
        
        System.out.println("Gasto en arriendo: " + gastoArriendo);
        System.out.println("Gasto en comida: " + gastoComida);
        System.out.println("Dinero restante: " + dineroRestante);
    }

}
