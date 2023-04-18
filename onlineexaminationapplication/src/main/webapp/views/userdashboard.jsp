<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>User Dashboard</title>
	<!-- Bootstrap CSS -->
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		
	<!-- jQuery library -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
	</script>
	
	<!-- Bootstrap JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js">
	</script>
	
	<style>
		/* Add custom styles here */
	</style>
<meta charset="ISO-8859-1">
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">User Dashboard</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="#">Home</a></li>
				<li><a href="#">My Profile</a></li>
				<li><a href="#">Take Exam</a></li>
				<li><a href="#">View Results</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Logout</a></li>
			</ul>
		</div>
	</nav>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">My Profile</div>
					<div class="panel-body">
						<!-- Add profile details here -->
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="panel panel-default">
					<div class="panel-heading">Take Exam</div>
					<div class="panel-body">
						<!-- Add exam details and start button here -->
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="panel panel-default">
					<div class="panel-heading">View Results</div>
					<div class="panel-body">
						<!-- Add results table here -->
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
