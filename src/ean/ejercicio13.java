package ean;
import java.util.Scanner;

public class ejercicio13 {
	    
    public static double calcularAumento(double sueldo) {
        double aumento;
        
        if (sueldo <= 800000) {
            aumento = sueldo * 0.10;
        } else if (sueldo <= 1200000) {
            aumento = sueldo * 0.08;
        } else {
            aumento = sueldo * 0.05;
        }
        
        return aumento;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el sueldo actual del empleado: $");
        double sueldoActual = scanner.nextDouble();
        
        double aumento = calcularAumento(sueldoActual);
        
        double nuevoSalario = sueldoActual + aumento;
        
        System.out.println("El aumento salarial es: $" + aumento);
        System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);
        
        scanner.close();
    }

}
