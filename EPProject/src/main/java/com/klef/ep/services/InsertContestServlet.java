package com.klef.ep.services;

import java.io.*;
import java.sql.*;

import javax.ejb.*;
import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.klef.ep.models.Contest;

@WebServlet("/insertcontest")
public class InsertContestServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	@EJB(lookup = "java:global/EPProject/ContestServiceImpl!com.klef.ep.services.ContestService")
	ContestService contestService;
  public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
  {
      response.setContentType("text/html");
      PrintWriter out=response.getWriter();
      String contest_name=request.getParameter("name");
      String contest_desc=request.getParameter("desc");
      String contest_startDate=request.getParameter("startdate");
      String contest_endDate=request.getParameter("enddate");
      Contest c=new Contest();
      c.setContest_name(contest_name);
      c.setDescription(contest_desc);
      c.setContest_startdate(contest_startDate);
      c.setContest_enddate(contest_endDate);
      String result=contestService.insertContest(c);
      if(result!=null)
      {
    	  out.println(result);
    	  RequestDispatcher rd=request.getRequestDispatcher("viewcontests");
    	  rd.forward(request, response);
    	  
      }
      else
      {
    	  out.println("insettion failed");
      }
  }
}