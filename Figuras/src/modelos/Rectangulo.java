package modelos;
import java.util.*;


/**
 * @author Pedro
 * 
 * Clase rectangulo permite crear rectangulos y calcular su area y perimetro
 */
public class Rectangulo extends Figura{

    private int base;
    private int altura;
    
    /**
     * Constructor por defecto, crea un rectanfulo con base y altura 1, en metros
     */
    public Rectangulo() {
    	this.base = 1;
    	this.altura = 1;
    }
   
    /**
     * Constructor que crea un rectangulo con la base y la altura especificada en metros
     * 
     * @param base		la base del rectangulo en metros
     * @param altura	la altura del rectangulo en metros
     */
    public Rectangulo(int base, int altura) {
    	this.base = base;
    	this.altura = altura;
    }
    
    public int getBase() {
    	return this.base;
    }
    
    public void setBase(int base) {
    	this.base = base;
    }
    
    public int getAltura() {
    	return this.altura;
    }
    
    public void setAltura(int altura) {
    	this.altura = altura;
    }

    /**
     *  @see modelos.Figura#area()
     */
    @Override
    public double area() {
        return base * altura;
    }

    /**
     * @see modelos.Figura#perimetro()
     */
    @Override
    public double perimetro() {
        return 2*this.base + 2*this.altura;
    }

}