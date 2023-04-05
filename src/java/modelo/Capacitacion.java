package modelo;

import implementacion.CapacitacionImpl;
import interfaces.ICapacitacion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Capacitación
 *
 * @author Leonel Briones
 */
public class Capacitacion implements ICapacitacion {

    private int id;
    private Date fecha;
    private String hora;
    private String lugar;
    private int duracion;
    private int rutCliente;

    /**
     * Constructor Predeterminado
     */
    public Capacitacion() {
    }

    /**
     * Constructor Parametrizado con todos los atributos de clase
     *
     * @param fecha
     * @param hora
     * @param lugar
     * @param duracion
     * @param rutCliente
     */
    public Capacitacion(int id, Date fecha, String hora, String lugar, int duracion, int rutCliente) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.rutCliente = rutCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método Getter
     *
     * @return
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método Setter
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Método Getter
     *
     * @return
     */
    public String getHora() {
        return hora;
    }

    /**
     * Método Setter
     *
     * @param hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Método Getter
     *
     * @return
     */
    public String getLugar() {
        return lugar;
    }

    /**
     * Método Setter
     *
     * @param lugar
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Método Getter
     *
     * @return
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Método Setter
     *
     * @param duracion
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Método Getter
     *
     * @return
     */
    public int getRutCliente() {
        return rutCliente;
    }

    /**
     * Método Setter
     *
     * @param rutCliente
     */
    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    @Override
    public String toString() {
        return "Capacitacion{" + "id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", rutCliente=" + rutCliente + '}';
    }

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
                        i + 1,
                        new SimpleDateFormat("yyyy-MM-dd").parse("2023-03-22"),
                        "10:00",
                        "Sala de Conferencias " + (i + 1),
                        120 - (i * 10),
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
