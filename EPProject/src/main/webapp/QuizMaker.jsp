<%@page import="com.klef.ep.models.Participant"%>
<%@page import="com.klef.ep.models.Questionnaire"%>
<%@ page import="com.klef.ep.models.Contest,java.util.*"%>

<h3>A Surprise Quiz</h3>
<form action="quizresult" method="POST">

<%
Participant p=(Participant)request.getAttribute("p");
int c_id=(int)request.getAttribute("contest_id");
List<Questionnaire> questionnaires=(List<Questionnaire>)request.getAttribute("questionlist");
for(Questionnaire q:questionnaires)
{
	if(q.getC_id()==c_id)
	{
		%>
		
  <p><%=q.getQ_name() %></p>
  <input type="radio"  name="<%=q.getQ_id()%>" value="<%=q.getOption1() %>"required>
  <label ><%=q.getOption1() %></label><br>
  <input type="radio"  name="<%=q.getQ_id()%>" value="<%=q.getOption2() %>"required>
  <label ><%=q.getOption2() %></label><br>
  <input type="radio"  name="<%=q.getQ_id()%>" value="<%=q.getOption3() %>"required>
  <label ><%=q.getOption3() %></label><br>
  <input type="radio"  name="<%=q.getQ_id()%>" value="<%=q.getOption4() %>"required>
  <label ><%=q.getOption4() %></label>
  <br>  

		<%
	}
}
%>
<input type="hidden" name="contest_id" value="<%=c_id%>" />
<input type="hidden" name="participant_id" value="<%=p.getP_id()%>" />
<input type="hidden" name="participant_name" value="<%=p.getP_name() %>" />
<input type="hidden" name="participant_email" value="<%=p.getP_email()%>" />
<input type="submit" />
</form>