/**
 * @author: Leonel Briones Palacios
 */
package interfaces;

import java.util.ArrayList;
import modelo.Capacitacion;

/**
 *
 * @author Leonel Briones Palacios
 */
public interface ICapacitacion {
    public ArrayList<Capacitacion> listaCapacitacion(); //RETORNA UNA LISTA DE OBJETOS CAPACITACION NO RECIBE NINGUN PARÁMETRO
    public String guardarCapacitacion(Capacitacion capacitacion);//otro que reciba un objeto de tipo Capacitacion y lo “registre” en sistema
}
