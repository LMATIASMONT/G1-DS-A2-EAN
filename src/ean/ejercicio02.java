package ean;
import java.lang.Math;

public class ejercicio02 {
	
    public static int calcularNumeroBuses(int numSillasBus, int numEstudiantesGordos, int numEstudiantesFlacos) {
        int sillasOcupadas = 2 * numEstudiantesGordos + numEstudiantesFlacos;
        
        int numBuses = (int) Math.ceil((double) sillasOcupadas / numSillasBus);
        
        return numBuses;
    }
    
    public static void main(String[] args) {
        int numSillasPorBus = 3;
        
        int numEstudiantesGordos = 5;
        int numEstudiantesFlacos = 10;
        
        int numBuses = calcularNumeroBuses(numSillasPorBus, numEstudiantesGordos, numEstudiantesFlacos);
        
        System.out.println("Se necesitan " + numBuses + " buses para llevar a " + numEstudiantesGordos + " estudiantes gordos y " + numEstudiantesFlacos + " estudiantes flacos al paseo, sabiendo que en cada bus tiene " + numSillasPorBus + "sillas.");
    }

}
