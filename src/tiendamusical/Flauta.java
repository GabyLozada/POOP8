/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamusical;

/**
 *
 * @author Gabriela Aquino Lozada
 */
public class Flauta extends InstrumentoViento{
    /**
     * La clase Flauta puede sobrescribir algun metodo ya que 
     * hereda de la clase InstrumentoMusical
     */
    public Flauta() {
    }
    /**
     * 
     * @return 
     */
    public String tipoInsrumento(){
        return "flauta";
    }
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    /**
     * 
     */
}
