/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Gabriela Aquino Lozada
 */
public class Triangulo extends Poligono{
    private int alfa, gama, beta;
    private float a, b, c;
    private float base, altura;
/**
 * La clase Triangulo esta obligada a sobrescribir los metodos
 * abstractos que deine la clase abstracta de la que hereda.
 */
    public Triangulo(){
        
    }
/**
 * 
 * @param alfa parametro de tipo entero privado
 * @param gama parametro de tipo entero privado
 * @param beta parametro de tipo entero privado
 * @param a parametro de tipo flotante privado
 * @param b parametro de tipo flotante privado
 * @param c parametro de tipo flotante privado
 * @param base parametro de tipo flotante privado
 * @param altura  parametro de tipo flotante privado
 */
 /**
  * 
  */
    public Triangulo(int alfa, int gama, int beta, float a, float b, float c, float base, float altura) { //Es una sobrecarga ya que tiene varios parametros
        this.alfa = alfa;
        this.gama = gama;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.altura = altura;
    }
    /**
     * 
     * @return 
     */
    public int getAlfa() {
        return alfa;
    }
    /**
     * 
     * @param alfa 
     */
    public void setAlfa(int alfa) {
        this.alfa = alfa;
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
     * El getC recupera el valor guardado en setC
     * @return un valor de tipo flotante 
     */
    public float getC() {
        return c;
    }
    /**
     * El metodo setC le da un valor a C
     * @param c Parametro de tipo flotante
     */
    public void setC(float c) {
        this.c = c;
    }
    /**
     * El getBase recupera el valor guardado en setBase
     * @return un valor de tipo entero
     */
    public float getBase() {
        return base;
    }
    /**
     * El metodo setBase le da un valor a base
     * @param base Praametro de tipo entero
     */
    public void setBase(float base) {
        this.base = base;
    }
    /**
     * El getAltura recupera el valor guardado en setAltura
     * @return un valor de tipo entero
     */
    public float getAltura() {
        return altura;
    }
    /**
     * El metodo setAltura le da un valor a altura
     * @param altura Parametro de tipo entero
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Método abstracto que calcula el area de un polígono
     */
    @Override
    public void area(){
        System.out.println("Area ="+(base*altura/2));
    }
    /**
     * Método bstracto que calcula el perimetro de un poligono
     */
    @Override
    public void perimetro(){
        System.out.println("Perimetro="+(a+b+c));
    }
    
    @Override//Es una sobreescritura
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", gama=" + gama + ", beta=" + beta + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", altura=" + altura + '}';
    }
   
  
}
