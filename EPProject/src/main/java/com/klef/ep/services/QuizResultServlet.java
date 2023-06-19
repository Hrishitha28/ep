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


@WebServlet("/quizresult")
public class QuizResultServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPProject/QuestionnaireServiceImpl!com.klef.ep.services.QuestionnaireService")
	QuestionnaireService questionnaireService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
	  response.setContentType("text/html");
	 int id=Integer.parseInt(request.getParameter("contest_id"));
	 int p_id=Integer.parseInt(request.getParameter("participant_id"));
	 String p_name=request.getParameter("participant_name");
	 String p_email=request.getParameter("participant_email");
	 PrintWriter out=response.getWriter();
	 int score=0,n=0;
      List<Questionnaire> q=questionnaireService.viewallQuestions(); 
      for(Questionnaire questionnaire:q)
      {
    	 if(questionnaire.getC_id()==id)
    	 {
    		 String a="" +questionnaire.getQ_id();
    		 String ans=request.getParameter(a);
    		 if(ans.equals(questionnaire.getAnswer()))
    		 {
    			score++;
    		 }
    		 n++;
    	 }
      }
      Participant p=new Participant();
      p.setP_email(p_email);
      p.setP_name(p_name);
      p.setP_id(p_id);
      request.setAttribute("score", score);
      request.setAttribute("contest_id", id);
      request.setAttribute("p", p);
      RequestDispatcher rd=request.getRequestDispatcher("displayresult");
      rd.forward(request, response);
  }
}