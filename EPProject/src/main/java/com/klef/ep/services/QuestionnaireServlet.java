package com.klef.ep.services;

import java.io.*;

import java.util.List;

import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.klef.ep.models.Contest;

@WebServlet("/questions")
public class QuestionnaireServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPProject/ContestServiceImpl!com.klef.ep.services.ContestService")
	ContestService contestService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      List<Contest> c=contestService.viewallContests();
      request.setAttribute("contestlist", c);
      RequestDispatcher rd=request.getRequestDispatcher("AddQuestionnaire.jsp");
      rd.forward(request, response);
      
  }
}