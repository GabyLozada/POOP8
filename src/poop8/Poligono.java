/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 *
 * @author Gabriela Aquino Lozada
 */
public abstract class Poligono {//Abstracto: Esta definido, una guia para saber heredar
    /**
     * Clase asbtracta donde sus metodos no estan definidos 
     * y estos nos sirven para dar una guia de los metodos
     */
    public abstract void area();//Aquel que no tiene funcionalidad
    public abstract void perimetro();
    
    @Override//Metodo concreto, aquel que tiene funcionalidad
    public String toString() { //SE esta sobreescribiendo, ya que queremos que muestre el poligono
        return "Poligono{" + '}';
    }
    /**
     * 
     */
}
