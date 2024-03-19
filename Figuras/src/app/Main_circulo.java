package app;

import modelos.Circulo;

public class Main_circulo {

	public static void main(String[] args) {
		
		Circulo c = new Circulo(8.5);
		
        double area = c.getArea();
        double perimetro = c.getPerimetro();
        
        System.out.println("Area del circulo: " + area);
        System.out.println("Perimetro del circulo: " + perimetro);

	}

}
