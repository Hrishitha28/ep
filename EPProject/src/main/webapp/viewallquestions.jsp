
<center>
	<div data-role="controlgroup" id="buttons-1" style="background-color: #ccddff">
		<button><a href="adminhome.jsp" class="ui-btn ui-corner-all">Home</a></button>
		<button><a href="AddContest.jsp" class="ui-btn ui-corner-all">AddContest</a></button>
		<button><a href="viewcontests" class="ui-btn ui-corner-all">ViewContest</a></button>
		<button><a href="questions" class="ui-btn ui-corner-all">AddQuestions</a></button>
	</div>
</center>
<%@ page import="com.klef.ep.models.Questionnaire,java.util.*"%>
<%
	List<Questionnaire> questions=(List<Questionnaire>)request.getAttribute("questionlist");
%>
<h3 align="center">List Of Contests</h3>
<table align="center" border="1">
	<tr>
		<th>Contest Id</th>
		<th>Question Id</th>
		<th>Question Name</th>
		<th>option 1</th>
		<th>option 2</th>
		<th>option 3</th>
		<th>option 4</th>
		<th>answer</th>
		<th>Action</th>
	</tr>
	<%
		for(Questionnaire q:questions)
		{
			%>
				<tr>
					<td><%=q.getC_id() %></td>
					<td><%=q.getQ_id() %></td>
					<td><%=q.getQ_name() %></td>
					<td><%=q.getOption1() %></td>
					<td><%=q.getOption2() %></td>
					<td><%=q.getOption3() %></td>
					<td><%=q.getOption4() %></td>
					<td><%=q.getAnswer() %></td>
						
						<td>
						<a href="deleteContest?<%=q.getQ_id() %>">Delete</a>&nbsp;&nbsp;
						<a href="viewContestbyid?<%=q.getQ_id() %>">Update</a>&nbsp;&nbsp;
						</td>
				</tr>
			<%
		}
	%>
</table>