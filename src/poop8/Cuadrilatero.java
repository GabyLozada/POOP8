/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Gabriela Aquino Lozada
 */
public class Cuadrilatero extends Poligono{
    private int gama,beta;
    private float a, b;
    private int base, altura;
/**
 * La clase Cuadrilatero esta obligada a sobrescribir los metodos
 * abstractos que definio la clase abstracto de la que hereda.
 */    
    public Cuadrilatero(){
        
    }
    /**
     * 
     * @param gama Prametro de tipo entero privado
     * @param beta Prametro de tipo entero privado
     * @param a Prametro de tipo flotante privado
     * @param b Prametro de tipo flotante privado
     * @param base Prametro de tipo entero privado
     * @param altura Prametro de tipo entero privado
     */

    public Cuadrilatero(int gama, int beta, float a, float b, int base, int altura) {
        this.gama = gama;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }
    /**
     * El metodo getGama recupera el valor guardado en SetGama y lo retorna
     * @return un valor entero
     */

    public int getGama() {
        return gama;
    }
    /**
     * El metodo setGama le da un valor a gama
     * @param gama Parametro de tipo entero
     */
    public void setGama(int gama) {
        this.gama = gama;
    }
    /**
     * El getBeta reucpera el valor guadado en setBeta
     * y lo retorna
     * @return  un valor de tipo entero
     */
    public int getBeta() {
        return beta;
    }
    /**
     * El metodo setbeta le da un valor a beta
     * @param beta  Parametro de tipo entero
     */
    public void setBeta(int beta) {
        this.beta = beta;
    }
    /**
     * El getA reucpera el valor guadado en setA
     * y lo retorna
     * @return un valor de tipo flotante
     */
    public float getA() {
        return a;
    }
    /**
     * El metodo setA le da un valor a "a"
     * @param a  Parametro de tipo flotante
     */
    public void setA(float a) {
        this.a = a;
    }
    /**
     * El getB recupera el valor guardado en setB
     * @return un valor de tipo flotante
     */
    public float getB() {
        return b;
    }
    /**
     * El metodo setB le da un valor a b
     * @param b Parametro de tipo flotante
     */
    public void setB(float b) {
        this.b = b;
    }
    /**
     * El getBase recupera el valor guardado en setBase
     * @return un valor de tipo entero
     */
    public int getBase() {
        return base;
    }
    /**
     * El metodo setBase le da un valor a base
     * @param base Praametro de tipo entero
     */
    public void setBase(int base) {
        this.base = base;
    }
    /**
     * El getAltura recupera el valor guardado en setAltura
     * @return un valor de tipo entero
     */
    public int getAltura() {
        return altura;
    }
    /**
     * El metodo setAltura le da un valor a altura
     * @param altura Parametro de tipo entero
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
   
    @Override
    public void area(){//Es una sobreescritura
        System.out.println("Area ="+(base*altura));
    }
    /**
     * El Override es un metodo de sobreescritura en una misma clase
     * Metodo abstracto que calcula el area de un poligono
     */
    @Override
    public void perimetro(){
        System.out.println("Perimetro ="+2*(base+altura));
    }
    /**
     * 
     * El Override es un metodo de sobreescritura en una misma clase
     * En este caso va a retornar una cadena de caracteres del mismo tipo y numero e parametros
     * Sobrescritura para implementación de esta clase abstracta
     * @return Cadena de caracteres tipo String
     */
    @Override
    public String toString() {
        return "Cuadrilatero{" + "gama=" + gama + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
