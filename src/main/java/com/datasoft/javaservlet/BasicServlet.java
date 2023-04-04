/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.datasoft.javaservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        //Conección a la base de datos
       /* Connection conmysql = null;
        String urlMySql = "jdbc:mysql://localhost:3306/german";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conmysql = DriverManager.getConnection(urlMySql, "root", "root");
            Statement statamenSql = conmysql.createStatement();
            ResultSet rsSql = statamenSql.executeQuery("SELECT * FROM ESTUDIANTE");
            while(rsSql.next()) {
                System.out.println(rsSql.getString(2));
            }
            conmysql.close();
        } catch (SQLException ex) {
            Logger.getLogger(PruebaServlet.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Mensaje desde método doGet</h1>");
        //out.println("<h2>El resultado de la query es: " + "" + "</h2>");
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
        out.println("<h1>Mensaje desde método doPost</h1>");
    }
}
