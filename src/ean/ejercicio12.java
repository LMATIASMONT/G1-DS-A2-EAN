package ean;
import java.util.Scanner;

public class ejercicio12 {

    public static String diaSiguiente(String diaActual) {
    	
    	if(diaActual.equals("sabado")) {
    		diaActual = "sábado";
    	}
    	
    	if(diaActual.equals("miercoles")) {
    		diaActual = "miércoles";
    	}
    	
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        
        diaActual = diaActual.toLowerCase();
        
        for (int i = 0; i < diasSemana.length - 1; i++) {
            if (diasSemana[i].equals(diaActual)) {
                return diasSemana[i + 1];
            }
        }
        
        if (diaActual.equals("domingo")) {
            return "lunes";
        }
        
        return "Día no válido";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre de un día (por ejemplo, lunes, martes, etc.): ");
        String diaActual = scanner.nextLine();
        
        String diaSiguiente = diaSiguiente(diaActual);
        
        System.out.println("El día siguiente a " + diaActual + " es " + diaSiguiente + ".");
        
        scanner.close();
    }

}
