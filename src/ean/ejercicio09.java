package ean;

public class ejercicio09 {
	    
    public static int encontrarMayor(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    public static void main(String[] args) {
    	
        int numero1 = 10;
        int numero2 = 20;
        
        int mayorNumero = encontrarMayor(numero1, numero2);
        
        System.out.println("El mayor número entre " + numero1 + " y " + numero2 + " es: " + mayorNumero);
    }

}
