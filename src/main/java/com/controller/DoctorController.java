/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.DoctorDao;
import com.model.Doctor;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Saiteja
 */
public class DoctorController extends HttpServlet {

    
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
        System.out.println("com.controller.DoctorController.doGet()");
        Doctor d= new Doctor();
        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
        d.setName(request.getParameter("name"));
        d.setAddress(request.getParameter("address"));
        d.setGender(request.getParameter("gender"));
        d.setPhoneNumber(request.getParameter("phoneNumber"));
        d.setQualification(request.getParameter("qualification"));
        System.out.println("com.controller.DoctorController.doGet()");
        DoctorDao dao= new DoctorDao();
        dao.persistDoctor(d);
        System.out.println("com.controller.DoctorController.doGet()");
        rd.forward(request, response);
        
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
        
    }

}
