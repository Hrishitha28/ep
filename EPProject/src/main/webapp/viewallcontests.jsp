
<center>
	<div data-role="controlgroup" id="buttons-1" style="background-color: #ccddff">
		<button><a href="adminhome.jsp" class="ui-btn ui-corner-all">Home</a></button>
		<button><a href="AddContest.jsp" class="ui-btn ui-corner-all">AddContest</a></button>
		<button><a href="viewcontests" class="ui-btn ui-corner-all">ViewContest</a></button>
		<button><a href="questions" class="ui-btn ui-corner-all">AddQuestions</a></button>
	</div>
</center>
<%@ page import="com.klef.ep.models.Contest,java.util.*"%>
<%
	List<Contest> Contests=(List<Contest>)request.getAttribute("contestlist");
%>
<h3 align="center">List Of Contests</h3>
<table align="center" border="1">
	<tr>
		<th>Contest Id</th>
		<th>Contest Name</th>
		<th>Contest Description</th>
		<th>Contest Start Date</th>
		<th>Contest End Date</th>
		<th>Action</th>
	</tr>
	<%
		for(Contest c:Contests)
		{
			%>
				<tr>
					<td><%=c.getContest_id() %></td>
					<td><%=c.getContest_name() %></td>
					<td><%=c.getDescription() %></td>
					<td><%=c.getContest_startdate() %></td>
					<td><%=c.getContest_enddate()%></td>
						
						<td>
						<a href="deleteContest?<%=c.getContest_id() %>">Delete</a>&nbsp;&nbsp;
						<a href="viewContestbyid?<%=c.getContest_id() %>">Update</a>&nbsp;&nbsp;
						</td>
				</tr>
			<%
		}
	%>
</table>