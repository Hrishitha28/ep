package com.klef.ep.services;

import java.io.*;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/deleteContest")
public class DeleteContestServlet extends HttpServlet {
	@EJB(lookup = "java:global/EPProject/ContestServiceImpl!com.klef.ep.services.ContestService")
	ContestService contestService;
	 public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	  {
		 String res=null;
	      response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	      try
	      {
	    	int id=Integer.parseInt(request.getQueryString());
	    	
	    	res=contestService.deleteContests(id);
	    	out.println(res);
	    	if(res!=null)
	    	{
	    		RequestDispatcher rd=request.getRequestDispatcher("viewcontests");
	    		rd.include(request, response);
	    	}
	    	
	      }
	      catch(Exception e)
	      {
	    	out.println(e);  
	      }
	  }

}
