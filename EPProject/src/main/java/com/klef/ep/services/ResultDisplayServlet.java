package com.klef.ep.services;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Participant;
import com.klef.ep.models.Result;

import java.io.*;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.*;

@WebServlet("/displayresult")
public class ResultDisplayServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPProject/ResultServiceImpl!com.klef.ep.services.ResultService")
	ResultService resultService;
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			int score=(int)request.getAttribute("score");
			int c_id=(int)request.getAttribute("contest_id");
			Participant p=(Participant)request.getAttribute("p");
			Result r=new Result();
			r.setContest_id(c_id);
			r.setParticipant_id(p.getP_id());
			r.setScore(score);
			r.setParticipat_name(p.getP_name());
			r.setParticipant_email(p.getP_email());
			String result=resultService.insert(r);
			if(result!=null)
			{
				List<Result> results=(List<Result>) resultService.viewResultByCId(c_id);
				request.setAttribute("results", results);
				RequestDispatcher rd=request.getRequestDispatcher("leaderboard.jsp");
				rd.forward(request, response);
			}
			else
			{
				out.print("failed to insert");
			}
		}
		catch(Exception e)
		{
		out.println(e);	
		}
	}
}