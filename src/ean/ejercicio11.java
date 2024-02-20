package ean;
import java.util.Scanner;

public class ejercicio11 {
	    
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }
    
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }
    
    public static String convertirDigitoARomano(int digito) {
        switch (digito) {
            case 0:
                return "";
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            default:
                return "numero invalido";
        }
    }
    
    public static String convertirDigitoADecenas(int digito) {
        switch (digito) {
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
            default:
                return "decena invalida";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = 0;
        boolean valido = false;
        
        while (!valido) {
            System.out.print("Ingrese un número entero (entre 1 y 99): ");
            numero = scanner.nextInt();
            
            if (numero > 0 && numero < 100) {
                valido = true;
            } else {
                System.out.println("Error: El número debe ser un entero positivo entre 1 y 99. Inténtelo nuevamente.");
            }
        }
        
        int decenas = obtenerDecenas(numero);
        int unidades = obtenerUnidades(numero);
        
        String romanoDecenas = convertirDigitoADecenas(decenas);
        String romanoUnidades = convertirDigitoARomano(unidades);

        System.out.println("El número en romano es: " + romanoDecenas + romanoUnidades);

        scanner.close();
    }

}
