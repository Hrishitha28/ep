package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Admin;

@WebServlet("/checkadmin")
public class CheckAdminLoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPProject/AdminServiceImpl!com.klef.ep.services.AdminService")
	AdminService AdminService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      int id=Integer.parseInt(request.getParameter("id"));
      String pwd=request.getParameter("pwd");
      
      String result = AdminService.checklogin(id, pwd);
      
      if(result!=null)
      {
    	  out.println("Login Success");
    	  RequestDispatcher rd=request.getRequestDispatcher("adminhome.jsp");
    	  rd.include(request, response);
      }
      else
      {
    	  out.println("Login Failed");
      }
  }
}