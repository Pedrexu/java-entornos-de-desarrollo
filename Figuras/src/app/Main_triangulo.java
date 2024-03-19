package app;

import modelos.Triangulo;

public class Main_triangulo {

	public static void main(String[] args) {
		
		Triangulo t = new Triangulo(4, 3, 2);
		
        double area = t.getArea();
        double perimetro = t.getPerimetro();
        
        System.out.println("Area del triangulo: " + area);
        System.out.println("Perimetro del triangulo: " + perimetro);

	}

}
