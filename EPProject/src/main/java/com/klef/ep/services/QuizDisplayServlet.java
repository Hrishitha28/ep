package com.klef.ep.services;

import java.io.*;
import java.util.List;

import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Participant;
import com.klef.ep.models.Questionnaire;


@WebServlet("/quizquestions")
public class QuizDisplayServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPProject/QuestionnaireServiceImpl!com.klef.ep.services.QuestionnaireService")
	QuestionnaireService questionnaireService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
	  
      List<Questionnaire> q=questionnaireService.viewallQuestions();
      request.setAttribute("questionlist", q);
      int c_id=Integer.parseInt(request.getParameter("contest_id"));
      request.setAttribute("contest_id", c_id);
      int p_id=Integer.parseInt(request.getParameter("participant_id"));
      String p_name=request.getParameter("participant_name");
      String p_email=request.getParameter("participant_email");
      Participant p=new Participant();
      p.setP_id(p_id);
      p.setP_email(p_email);
      p.setP_name(p_name);
      request.setAttribute("p", p);
      RequestDispatcher rd=request.getRequestDispatcher("QuizMaker.jsp");
      rd.forward(request, response);
      
  }
}