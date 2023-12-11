/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Profile;

/**
 *
 * @author ASUS
 */
@WebServlet(name = "Update", urlPatterns = {"/edit"})
public class Update extends HttpServlet {
private static final String ACTION_1 = "studentid";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Update</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Update at " + request.getParameter(ACTION_1) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        DAO dao = new DAO();
        Profile p = new Profile();
        p = dao.getUser(request.getParameter(ACTION_1));
        request.setAttribute("u", p);
        request.getRequestDispatcher("Update.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String studentid = request.getParameter(ACTION_1);
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String dateofbirth = request.getParameter("dateofbirth");
        Integer gender = Integer.parseInt(request.getParameter("gender"));
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String guardianname = request.getParameter("guardianname");
        String guardianphone = request.getParameter("guardianphone");
        String admissiondate = request.getParameter("admissiondate");
        String field_of_study = request.getParameter("field_of_study");
        String classsection = request.getParameter("classsection");
        Integer photoid = Integer.parseInt(request.getParameter("photoid"));
        DAO dao = new DAO();
        dao.updateUser(studentid,firstname, lastname, dateofbirth, gender, address, email, phone, guardianname, guardianphone, admissiondate, field_of_study, classsection, photoid);
        dao.updateUser2(studentid, firstname + lastname, gender, admissiondate);
        response.sendRedirect("detail?StudentID="+studentid);
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
