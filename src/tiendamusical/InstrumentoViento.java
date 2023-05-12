/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamusical;

/**
 *
 * @author Gabriela Aquino Lozada
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{
    /**
     * Por defecto, todos los metodos de la interfaz son publicos,
     * por lo tanto, asi se deben implementar
     * Hereda de Object y se implementa la interfaz InstrumentoMusical
     */
    public InstrumentoViento() {
    }
    
    @Override
    public void tocar() {
        System.out.println("Estoy tocando un instrumento de viento");}
    
    @Override
    public void afinar() {
        System.out.println("Estoy afinando un instrumento de viento");
    }
    
    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }
    
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
    
}
