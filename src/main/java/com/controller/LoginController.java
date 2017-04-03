/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Saiteja
 */
public class LoginController extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        LoginDao ab= new LoginDao();
        HttpSession session= request.getSession();
        PrintWriter pw=response.getWriter();
        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
        
        int i = Integer.parseInt(request.getParameter("uname"));
        String s=(String)request.getParameter("pass");

        String str=ab.checkUser(Integer.parseInt(request.getParameter("uname")),request.getParameter("pass"));
        if(str.equals("correctPassword"))
        {
            session.setAttribute("user",i);
            
        //response.sendRedirect("home.jsp");
            //rd.forward(request, response);
        }
            pw.print(ab.checkUser(Integer.parseInt(request.getParameter("uname")),request.getParameter("pass")));
    }

 

}
