/**
 * ESTE SERVLET CORRESPONDE A LA INTEGRACION DEL PROYECTO 5.1
 */
package controlador;

import implementacion.CapacitacionImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Capacitacion;

/**
 *
 * @author Leonel Briones Palacios
 */
@WebServlet(name = "registrarCapacitacion5B", urlPatterns = {"/registrarCapacitacion5B"})
public class registrarCapacitacion5B extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registrarCapacitacion5B</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registrarCapacitacion5B at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //processRequest(request, response);
            
            //RECUPERAR DATOS QUE VIENEN DEL REQUEST
            int rutCliente = Integer.parseInt(request.getParameter("rutCliente"));
            String fechaCapacitacion = request.getParameter("fecha");
            String horaCapacitacion = request.getParameter("hora");
            String lugarCapacitacion = request.getParameter("lugar");
            int duracionCapacitacion = Integer.parseInt(request.getParameter("duracion"));
            int cantidadAsistentes = Integer.parseInt(request.getParameter("cantAsistentes"));
            
            //CREAR OBJETO TIPO CAPACITACION
            Capacitacion capacitacion = new Capacitacion();
            
            //SETEAR EL OBJETO CON LOS DATOS OBTENIDOS DESDE LA VISTA
            capacitacion.setRutCliente(rutCliente);
            capacitacion.setFecha(new SimpleDateFormat("yyyy-MM-dd").parse(fechaCapacitacion));
            capacitacion.setHora(horaCapacitacion);
            capacitacion.setLugar(lugarCapacitacion);
            capacitacion.setDuracion(duracionCapacitacion);
            
            //INVOCAR AL MÉTODO guardarCapacitacion();
            String descripcion = capacitacion.guardarCapacitacion(capacitacion);
            
            //ENVIAR A LA VISTA LO QUE RETORNA EL MÉTODO guardarCapacitacion
            request.setAttribute("descripcion", descripcion);
            
            //REDIRECCIONAR LA PÁGINA A UN JSP MOSTRANDO UN MENSAJE
            RequestDispatcher dispatcher = request.getRequestDispatcher("SECCIONES/capacitacionMensaje.jsp");
            dispatcher.forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(registrarCapacitacion5B.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
