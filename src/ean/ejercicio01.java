package ean;

public class ejercicio01 {
	    
    public static double calcularFuncion(double x, double y) {
        return x * x + 2 * x * y + y * y;
    }
    
    public static void main(String[] args) {
        double x = 657.14;
        double y = 498.58;
        
        double resultado = calcularFuncion(x, y);
        
        System.out.println("El valor de la función f(x, y) para x = " + x + " y y = " + y + " es: " + resultado);
	}

}
