package com.klef.ep.services;

import java.io.*;

import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Participant;

@WebServlet("/insertuser")
public class ParticipantRegistrationServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPProject/ParticipantServiceImpl!com.klef.ep.services.ParticipantService")
	ParticipantService userService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      String name=request.getParameter("name");
      String email=request.getParameter("email");
      String role=request.getParameter("role");
      String stream=request.getParameter("stream");
      String pass=request.getParameter("pass");
      String repass=request.getParameter("re_pass");
      String result = null;
      Participant p=new Participant();
      p.setP_name(name);
      p.setP_email(email);
      p.setP_role(role);
      p.setP_stream(stream);
      if(pass.equals(repass))
      {
    	  p.setP_password(repass);
    	result=userService.participantreg(p);
      }
      else
      {
    	  out.println("password and confirm password are not same");
      }
      
      
      if(result!=null)
      {
    	  RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
    	  rd.forward(request, response);
      }
      else
      {
    	  out.println("insertion failed");
      }
  }
}