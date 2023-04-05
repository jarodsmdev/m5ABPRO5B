package modelo;

import java.util.ArrayList;
/**
 *
 * @author Leonel Briones
 */
public class VisitaEnTerreno {

    private int identificador;
    private long rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;
    private ArrayList<Revision> revisiones = new ArrayList<Revision>();

    /**
     * Constructores de la clase.
     */
    public VisitaEnTerreno() {};

    /**
     * Constructor parametrizado
     * @param identificador: int
     * @param cliente:       String
     * @param dia:           String
     * @param hora:          String
     * @param lugar:         String
     * @param comentarios:   String
     */
    public VisitaEnTerreno(int identificador, long rutCliente, String dia, String hora, String lugar,
        String comentarios) {

        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    /**
     * Método Getter
     * @return int
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
    public String getDia() {
        return dia;
    }

    /**
     * Método Setter recibe String
     * @param dia 
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * Método Getter
     * @return String
     */
    public String getHora() {
        return hora;
    }

    /**
     * Método Setter recibe String
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
     * Método Setter recibe String
     * @param lugar
     */
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
     * Método Getter
     * @return String
     */
    public String getComentarios() {
        return comentarios;
    }

    /**
     * Método Setter recibe String
     * @param comentarios 
     */
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * Método que permite agregar un objeto de tipo Revisión a un arrayList. Recibe Revision
     * @param nuevaRevision 
     */
    public void agregarRevision(Revision nuevaRevision) {
        revisiones.add(nuevaRevision);
    }

    /**
     * Método que retorna ArrayList con las revisiones
     * @return ArrayList
     */
    public ArrayList<Revision> getRevisiones() {
        return revisiones;
    }

    /**
     * Metodo toString de la clase VisitaEnTerreno.
     */
    @Override
    public String toString() {
        return " [VISITA] ID Visita: " + identificador + ", RUT Cliente: " + rutCliente + ", Dia: " + dia + ", Hora: " + hora + ", Lugar: " + lugar + ", Comentarios: " + comentarios;
    }
}
