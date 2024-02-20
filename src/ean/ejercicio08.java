package ean;
import java.util.Scanner;

public class ejercicio08 {
	    
    public static int calcularNumeroTotalSalones(int numEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }
    
    public static int calcularNumeroTotalPisos(int numSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numSalones / salonesPorPiso);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número total de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidadSalon = scanner.nextInt();
        
        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();
        
        int numSalones = calcularNumeroTotalSalones(numEstudiantes, capacidadSalon);
        
        int numPisos = calcularNumeroTotalPisos(numSalones, salonesPorPiso);
        
        System.out.println("Número total de salones en el nuevo edificio: " + numSalones);
        System.out.println("Número total de pisos en el nuevo edificio: " + numPisos);
        
        scanner.close();
    }

}
