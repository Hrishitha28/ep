<!DOCTYPE html>
<%@page import="com.klef.ep.models.Result"%>
<%@page import="java.util.List"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Leaderboard</title>
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/leaderboard.css">
</head>
<body>

<% List<Result> results=(List<Result>)request.getAttribute("results"); %>
	<section class="main-content">
	

			<h4>All Participants</h4>

			<table class="table">
				<thead>
					<tr>
						<th>User</th>
						<th>Rank</th>
						<th>Score</th>
						<th>Email</th>
						<th>Congratulate</th>
					</tr>
				</thead>
				<tbody>
					<%
					int n=0;
					int score=0;
					for(Result r:results) 
					{
						if(r.getScore()!=score)
						{
							score=r.getScore();
							n++;
						}
						%>
						
						<tr>
						<td>
							<div class="d-flex align-items-center">
								<images src="images/user1.jpg" class="circle-images circle-images--small mr-2" alt="User images">
								<div class="user-info__basic">
									<h5 class="mb-0"><%=r.getParticipat_name()%></h5>
									<p class="text-muted mb-0">@<%=r.getParticipat_name()%></p>
								</div>
							</div>
						</td>
						<td>
							<div class="d-flex align-items-baseline">
								<h4 class="mr-1"><h4><%=n%></h4><small class="text-success"></small>
							</div>
						</td>
						<td><%=r.getScore()%></td>
						<td><%=r.getParticipant_email() %></td>
						<td>
							<button class="btn btn-success btn-sm">Congratulate</button>
						</td>
					</tr>
						<%
						
					}
					%>
					
					
					
					
					
				</tbody>
			</table>
		</div>
	</section>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>