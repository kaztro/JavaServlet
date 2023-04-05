/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.datasoft.javaservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Estudiante;

/**
 *
 * @author germa
 */
@WebServlet(name = "BasicServlet", urlPatterns = {"/BasicServlet"})
public class BasicServlet extends HttpServlet {

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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Mensaje desde método doGet</h1>");
        
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(new Estudiante("German", "Castro"));
        listaEstudiantes.add(new Estudiante("Iván", "Hernández"));
        
        HttpSession session = request.getSession();
        session.setAttribute("listaEstudiantes", listaEstudiantes);
        
        response.sendRedirect("mostrarEstudiantes.jsp");
        
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
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        
        out.println("Nombre: " + nombre);
        out.println("Apellido: " + apellido);
    }
}
