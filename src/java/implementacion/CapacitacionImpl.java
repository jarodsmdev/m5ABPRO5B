/**
 * @author Leonel Briones Palacios
 */
package implementacion;

import interfaces.ICapacitacion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Capacitacion;

/**
 *
 * @author Leonel Briones Palacios
 */
public class CapacitacionImpl implements ICapacitacion {

    /**
     * Método que permite retornar una lista de objetos tipos Capacitacion
     */
    @Override
    public ArrayList<Capacitacion> listaCapacitacion() {
        // genere una rutina que retorne una lista de al menos tres objetos creados manualmente

        ArrayList<Capacitacion> listaCapacitacion = new ArrayList();

        //FOR PARA CREAR 3 OBJETOS DE TIPO CAPACITACION
        for (int i = 0; i < 3; i++) {
            try {
                Capacitacion capacitacion = new Capacitacion(
                        i+1,
                        new SimpleDateFormat("yyyy-MM-dd").parse("2023-03-22"),
                        "10:00",
                        "Sala de Conferencias " + (i+1),
                        120 - (i*10),
                        123456
                );
                
                //AÑADE EL OBJETO CAPACITACION AL ARRAYLIST
                listaCapacitacion.add(capacitacion);
                
            } catch (ParseException ex) {
                Logger.getLogger(CapacitacionImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return listaCapacitacion;
    }

    @Override
    public String guardarCapacitacion(Capacitacion capacitacion) {
        //En el caso del método que crea una capacitación, genere una rutina que reciba un objeto, y que despliegue sus datos por consola de Java.
        return capacitacion.toString();
    }

}
