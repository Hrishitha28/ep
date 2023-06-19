<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List,com.klef.ep.services.ContestService,com.klef.ep.models.Contest"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="questionpass" method="POST">
			<label>Contest name</label>
			<select name="c_name" >
			<%
			List<Contest> c=(List<Contest>)request.getAttribute("contestlist");
			for(Contest contest:c)
			{
				%>
				<option value=<%=contest.getContest_name() %>><%=contest.getContest_name() %></option>
				<%		
			}
			%>
			</select><br><br>
			<label>Question name</label>
			<input type="text" name="q_name" required/><br><br>
			<label>Question Description</label>
			<input type="text" name="desc" required/><br><br>
			<label>Question option1</label>
			<input type="text" name="op1" required/><br><br>
			<label>Question option2</label>
			<input type="text" name="op2" required/><br><br>
			<label>Question option3</label>
			<input type="text" name="op3" required/><br><br>
			<label>Question option4</label>
			<input type="text" name="op4" required/><br><br>
			<label>Question answer</label>
			<input type="text" name="answer" required/><br><br>

	<input type="submit" />
		</form>

</body>
</html>