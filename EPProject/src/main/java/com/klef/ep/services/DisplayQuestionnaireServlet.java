package com.klef.ep.services;

import java.io.*;
import java.util.List;

import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Questionnaire;


@WebServlet("/displaycontests")
public class DisplayQuestionnaireServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPProject/QuestionnaireServiceImpl!com.klef.ep.services.QuestionnaireService")
	QuestionnaireService questionnaireService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      List<Questionnaire> q=questionnaireService.viewallQuestions();
      request.setAttribute("questionlist", q);
      RequestDispatcher rd=request.getRequestDispatcher("participantDashboard.jsp");
      rd.forward(request, response);
      
  }
}