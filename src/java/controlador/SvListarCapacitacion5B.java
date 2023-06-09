/**
 * Este servlet es copia de SvListarCapacitacion.java con las modificaciones que solicitan para el proyecto 5.1
 */
package controlador;

import implementacion.CapacitacionImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Capacitacion;

/**
 *
 * @author jarod
 */
@WebServlet(name = "SvListarCapacitacion5B", urlPatterns = {"/SvListarCapacitacion5B"})
public class SvListarCapacitacion5B extends HttpServlet {

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
            out.println("<title>Servlet SvListarCapacitacion5B</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvListarCapacitacion5B at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        //processRequest(request, response);
        List<Capacitacion>listaCapacitacion = new ArrayList<>();
       
        HttpSession session = request.getSession();
        
        if(session.getAttribute("nombre") == null){
            response.sendRedirect(request.getContextPath() + "/SvLogin");
        }
        else {;
            //CREO UN OBJETO DE LA CLASE CAPACITACIONIMPL YA QUE SUS MÉTODOS NO SON ESTÁTICOS
            CapacitacionImpl capacitacionImpl = new CapacitacionImpl();
            
            //INVOCO AL MÉTODO LISTACAPACITACION QUE RETORNA UNA LISTA DE OBJETOS
            listaCapacitacion = capacitacionImpl.listaCapacitacion();
            
            // ENVIAR EL ARRAYLIST CAPACITACION A LA VISTA COMO PARÁMETRO
            request.setAttribute("listaCapacitacion", listaCapacitacion);
            
            // REDIRECCIONAR
            RequestDispatcher dispatcher = request.getRequestDispatcher("SECCIONES/listarCapacitacion.jsp");
            dispatcher.forward(request, response);
        }
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
        processRequest(request, response);
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
