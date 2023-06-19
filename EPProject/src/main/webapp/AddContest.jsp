<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div data-role="controlgroup" id="buttons-1" style="background-color: #ccddff">
		<button><a href="adminhome.jsp" class="ui-btn ui-corner-all">Home</a></button>
		<button><a href="AddContest.jsp" class="ui-btn ui-corner-all">AddContest</a></button>
		<button><a href="viewcontests" class="ui-btn ui-corner-all">ViewContest</a></button>
		<button><a href="questions" class="ui-btn ui-corner-all">AddQuestions</a></button>
		</div>
		<form action="insertcontest" method="POST" enctype="multipart/form-data">
			<label>Contest Name</label>
			<input type="text" name="name" required/><br><br>
			<label>Contest Description</label>
			<input type="text" name="desc" required/><br><br>
			<label>Contest startDate</label>
	<input type="datetime-local" name="startdate" required/><br><br>
	<label>Contest endDate</label>
	<input type="datetime-local" name="enddate" required/><br><br>

	<input type="submit" />
		</form>

</body>
</html>