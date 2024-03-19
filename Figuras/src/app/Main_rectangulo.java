package app;

import modelos.Rectangulo;

public class Main_rectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo(3, 4);
		
		int area1 = r1.area();
		int perimetro2 = r2.perimetro();
		
		System.out.println("El Area del rectangulo 1 es: " + area1);
		System.out.println("El perimetro del rectangulo 2 es: " + perimetro2);

	}

}
