package ean;

public class ejercicio06 {
	    
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
    
    public static double calcularHipotenusa(double ladoD, double ladoB) {
        return Math.sqrt(ladoD * ladoD + ladoB * ladoB);
    }
    
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC, double ladoD) {
        double hipotenusa = calcularHipotenusa(ladoD, ladoB);
        return ladoA + ladoB + ladoC + hipotenusa;
    }
    
    public static void main(String[] args) {
        double ladoA = 5.0;
        double ladoB = 4.0;
        double ladoC = 3.0;
        double ladoD = ladoA - ladoC;
        
        double areaTriangulo = calcularAreaTriangulo(ladoB, ladoD);
        double areaRectangulo= calcularAreaRectangulo(ladoC, ladoB);
        double areaTerreno = areaTriangulo + areaRectangulo;
        
        double perimetroTerreno = calcularPerimetroTerreno(ladoA, ladoB, ladoC, ladoD);
        
        System.out.println("Área del terreno: " + areaTerreno);
        System.out.println("Perímetro del terreno: " + perimetroTerreno);
    }

}
