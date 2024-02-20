package ean;
import java.util.Scanner;

public class ejercicio10 {
	    
    public static double realizarOperacion(double num1, double num2, String operador) {
        switch (operador) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: División por cero");
                    return Double.NaN;
                }
            case "%":
                return num1 % num2;
            case "**":
                return Math.pow(num1, num2);
            default:
                System.out.println("Error: Operador no válido");
                return Double.NaN;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Ingrese el operador aritmético (+, -, *, /, %, **): ");
        String operador = scanner.next();
        
        double resultado = realizarOperacion(numero1, numero2, operador);
        
        if (!Double.isNaN(resultado)) {
            System.out.println("El resultado de la operación es: " + resultado);
        }
        
        scanner.close();
    }

}
