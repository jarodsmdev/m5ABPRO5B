package modelo;

/**
 *
 * @author Leonel Briones Palacios
 */
public class Revision {

    private int idRevision;
    private int idVisita;
    private String nombreRevision;
    private String detalles;
    private int estado;

    /**
     * Constructor por defecto. idRevision es autogenerado
     */
    public Revision() {
    }

    /**
     * Constructor parametrizado solicita todos los campos de clase
     * @param idRevision
     * @param nombreRevision
     * @param idVisita
     * @param detalles
     * @param estado 
     */
    public Revision(int idRevision, String nombreRevision, int idVisita, String detalles, int estado) {

        this.idRevision = idRevision;
        this.idVisita = idVisita;
        this.nombreRevision = nombreRevision;
        this.detalles = detalles;
        this.estado = estado;
    }

    /**
     * Obtiene campo de clase idRevsiion tipo int
     *
     * @return método que Retorna el Id de la revisión
     */
    public int getIdRevision() {
        return idRevision;
    }

    /**
     * Establece campo de clase idRevision tipo int
     *
     * @param idRevision tipo int
     */
    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    /**
     * Obtiene campo de clase idVisita tipo int
     *
     * @return int idVisita
     */
    public int getIdVisita() {
        return idVisita;
    }

    /**
     * Establece campo de clase idVisita tipo int
     *
     * @param idVisita tipo int
     */
    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    /**
     * Obtiene campo de clase nombreRevision tipo String
     * @return nombreRevision tipo String
     */
    public String getNombreRevision() {
        return nombreRevision;
    }

    /**
     * Establece campo de clase nombreRevision tipo String
     * @param nombreRevision tipo String
     */
    public void setNombreRevision(String nombreRevision) {
        this.nombreRevision = nombreRevision;
    }

    /**
     * Obtiene campo de clase detalles tipo String
     * @return detalles tipo String
     */
    public String getDetalles() {
        return detalles;
    }

    /**
     * Establece campo de clase detalles tipo String
     * @param detalles tipo String
     */
    public void setDetalleRevisar(String detalles) {
        this.detalles = detalles;
    }

    /**
     * Obtiene campo de clase estado tipo int
     * @return estado tipo int
     */
    public int getEstado() {
        //1 (sin problemas), 2 (con observaciones), 3 (no aprueba),
        return estado;
    }

    /**
     * Establece campo de clase estado tipo int
     * @param estado tipo int
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * Método que retorna String el resultado de una revisión, dependiendo del
     * campo de clase estado que almacena enteros entre 1 a 3
     * @return String con el resultado de la revisión
     */
    public String mostrarResultadoRevision() {
        String resultado;

        switch (getEstado()) {
            case 1:
                resultado = "SIN PROBLEMAS";
                break;
            case 2:
                resultado = "CON OBSERVACIONES";
                break;
            case 3:
                resultado = "NO APRUEBA";
                break;
            default:
                resultado = "SE PRODUJO UN ERROR";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return " [REVISIÓN] ID Revisión: " + idRevision + ", ID Visita: " + idVisita + ", Nombre Revisión: " + nombreRevision + ", Detalles: " + detalles + ", Estado: " + mostrarResultadoRevision() + ".";
    }

}
