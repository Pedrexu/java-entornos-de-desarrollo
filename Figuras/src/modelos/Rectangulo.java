package modelos;
import java.util.*;


public class Rectangulo {

    private int base;
    private int altura;
    
    public Rectangulo() {
    	this.base = 1;
    	this.altura = 1;
    }

    /**
     * @param base: int 
     * @param altura: int
     */
    public void rectangulo(int base, int altura) {
    	this.base = base;
    	this.altura = altura;
    }

    /**
     * 
     */

    /**
     * @param base: int
     */
    public int getBase() {
    	return this.base;
    }

    /**
     * @param base: int
     */
    public void setBase(int base) {
    	this.base = base;
    }

    /**
     * @param altura: int
     */
    public int getAltura() {
    	return this.altura;
    }

    /**
     * @param altura: int
     */
    public void setAltura(int altura) {
    	this.altura = altura;
    }

    /**
     * @param base: int 
     * @param altura: int
     */
    public int area() {
        return base * altura;
    }

    /**
     * @param base: int 
     * @param altura: int
     */
    public int perimetro() {
        return 2*this.base + 2*this.altura;
    }

}