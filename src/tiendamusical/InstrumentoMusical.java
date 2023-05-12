/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tiendamusical;

/**
 *
 * @author Gabriela Aquino Lozada
 */
public interface InstrumentoMusical {
/**
 * Al ser una interfaz no ocupamos constructores
 */    
    void tocar();
    void afinar();
    String tipoInstrumento();
    
}
/**
 * Por defecto, todos los métodos definidos dentro de
 * de una interfaz son publicos (public) y abstractos (abstract)
 */