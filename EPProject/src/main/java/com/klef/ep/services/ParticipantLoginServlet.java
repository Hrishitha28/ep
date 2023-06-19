package com.klef.ep.services;

import java.io.*;
import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Participant;

@WebServlet("/checkuser")
public class ParticipantLoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPProject/ParticipantServiceImpl!com.klef.ep.services.ParticipantService")
	ParticipantService UserService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
     
      String email=request.getParameter("email");
      String pwd=request.getParameter("pass");
      System.out.println(email +"," +pwd);
      Participant p = UserService.participantlogin(email,pwd);
      if(p!=null)
      {
    	  
    	  request.setAttribute("participant", p);
    	  RequestDispatcher rd=request.getRequestDispatcher("displaycontests");
    	  
    	  rd.forward(request, response);
      }
      else
      {
    	  out.println("Login Failed");
      }
  }
}