package modelo;

/**
 *
 * @author Leonel Briones
 */
public class Accidente {

    private int identificador;
    private long rutCliente;
    private String fecha;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    /**
     * Constructores de la clase.
     */
    public Accidente() {}


    /**
     *Constructor Parametrizado
     * @param identificador: int
     * @param cliente: String
     * @param fecha: String
     * @param hora: String
     * @param lugar: String
     * @param origen: String
     * @param consecuencias: String
     */
    public Accidente(int identificador, Long rutCliente, String fecha, String hora, String lugar, String origen,
            String consecuencias) {


        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;

    }

    /**
     * Método Getter
     * @return int
     * identificador de tipo string.
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * Método Setter recibe int
     * @param identificador 
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * Método Getter
     * @return long
     */
    public long getRutCliente() {
        return rutCliente;
    }

    /**
     * Método Setter recibe long
     * @param rutCliente 
     */
    public void setRutCliente(long rutCliente) {
        this.rutCliente = rutCliente;
    }

    /**
     * Método Getter
     * @return String
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Método Setter String
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Método Getter
     * @return String
     */
    public String getHora() {
        return hora;
    }

    /**
     * Método Setter
     * @param hora 
     */
    public void setHora(String hora) {
        this.hora = hora;  
    }

    /**
     * Método Getter
     * @return String
     */
    public String getLugar() {
        return lugar;
    }

    /**
     *Método Setter recibe un String
     * @param lugar
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Método Getter
     * @return String
     */
    public String getOrigen() {
        return origen;
    }

    /**
     *Método Setter recibe String
     * @param origen
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Método Getter
     * @return String
     */
    public String getConsecuencias() {
        return consecuencias;
    }

    /**
     * Método Setter recibe String
     * @param consecuencias 
     */
    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    @Override
    public String toString() {
        return "Accidente ID: " + identificador + ", RUT: " + rutCliente + ", Fecha: " + fecha + ", Hora: " + hora + ", Lugar: " + lugar + ", Origen: " + origen + ", Consecuencias: " + consecuencias;
    }
}
