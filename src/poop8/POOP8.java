/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

import mesario.Meses;
import tiendamusical.Flauta;
import tiendamusical.InstrumentoMusical;
/**
 *
 * @author Gabriela Aquino Lozada
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        //No sepuede crear objetos de clases abstractas
        //Poligono pol = new Poligono();
        Poligono pol;
        pol = new Cuadrilatero();//Los padres no pueden adquirir toda esa informacion
        // Poligono puede comportarse como Objeto
        System.out.println(pol.toString());
        //pol.setBase(0);
        //Una referencia puede ser reasignada a otros objetos
        pol = new Triangulo();
        System.out.println(pol);
        
        System.out.println("########## INSTRUMENTO MUSICAL ############");
        pol.area();
        /**
         * Se puede crear una referencia de una interfaz
         */
        InstrumentoMusical ints;
        //ints = new InstrumentoMusial();
        ints = new Flauta();
        ints.tocar();
        
        System.out.println("############# MESEARIO##########");
        System.out.println(Math.PI);
        /**
         * Se puede acceder a las variables de la interfaz sin crear instancias
         */
        System.out.println("El mes "+Meses.DOS+" es "+Meses.NOMBRES_MESES[Meses.DOS]);
    }
    
}

