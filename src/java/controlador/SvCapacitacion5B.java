/**
 * Este servlet corresponde a una copia del servlet SvCapacitacion.java
 * Solicitado por el proyecto 5.1
 */
package controlador;

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
import modelo.Cliente;

/**
 *
 * @author Leonel Briones Palacios
 */
@WebServlet(name = "SvCapacitacion5B", urlPatterns = {"/SvCapacitacion5B"})
public class SvCapacitacion5B extends HttpServlet {

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
            out.println("<title>Servlet SvCapacitacion5B</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvCapacitacion5B at " + request.getContextPath() + "</h1>");
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
        
        HttpSession session = request.getSession();
        
        //VERIFICO QUE EXISTA LA SESIÓN CREADA
        if(session.getAttribute("nombre") == null){
            response.sendRedirect(request.getContextPath() + "/SvLogin");
        }
        else{
            //CREAR ARRAY CON OBJETOS CLIENTES
            List<Cliente>listaClientes = new ArrayList<Cliente>();
            
            //CREAR OBJETOS CLIENTES Y AÑADIRLOS A LA LISTA
            for(int i = 0; i < 4; i++){
                Cliente cliente = new Cliente();
                
                cliente.setRut(159753);
                cliente.setNombre("Nombre " + (i+1));
                cliente.setApellido("Apellido " + (i+1));
                        
                listaClientes.add(cliente);
            }
            
            //ENVIAR ARRAYLIST CLIENTES A LA VISTA
            request.setAttribute("listaClientes", listaClientes);
            
            //MOSTRAR FORMULARIO CREAR CAPACITACION
            RequestDispatcher dispatcher = request.getRequestDispatcher("SECCIONES/capacitacion.jsp");
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
