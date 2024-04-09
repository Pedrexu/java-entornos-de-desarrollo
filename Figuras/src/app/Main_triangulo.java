package app;

import modelos.Triangulo;
import modelos.Circulo;

public class Main_triangulo {

	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo(2, 2);

        // Calcular y mostrar el área del triángulo
        System.out.println("Área del triángulo (base 1, altura 2): " + triangulo.getArea());

        // Cambiar la base del triángulo de 1 a 2
        triangulo.setBase(2);

        // Calcular y mostrar el área del triángulo después de cambiar la base
        System.out.println("Área del triángulo (base 2, altura 2): " + triangulo.getArea());

        // Crear un círculo de radio 2
        Circulo circulo = new Circulo(2);

        // Calcular y mostrar el área del círculo
        System.out.println("Área del círculo (radio 2): " + circulo.getArea());

        // Cambiar el radio del círculo a 3
        circulo.setRadio(3);

        // Calcular y mostrar el perímetro del círculo después de cambiar el radio
        System.out.println("Perímetro del círculo (radio 3): " + circulo.getPerimetro());
    }
        

	}


