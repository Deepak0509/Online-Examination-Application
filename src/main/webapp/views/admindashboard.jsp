<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Admin Dashboard</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<!-- Brand/logo -->
		<a class="navbar-brand" href="#">Online Test System</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="#">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="#">View
					Reports</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbardrop"
				data-toggle="dropdown"> Manage Questions </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="#">Add Questions File</a> <a
						class="dropdown-item" href="#">Remove Questions File</a>
				</div></li>
		</ul>

		<ul class="navbar-nav ml-auto">
			<li class="nav-item"><a class="nav-link" href="#">Logout</a></li>
		</ul>
	</nav>

	<div class="container mt-3">
		<h2>Welcome Admin!</h2>
		<div class="row">
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">View Reports</h4>
						<p class="card-text">Click here to view the students' details
							according to the demand from the client.</p>
						<a href="#" class="btn btn-primary">View Reports</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Add Questions File</h4>
						<p class="card-text">Click here to upload the excel file of
							questions provided by the client in a desired format.</p>
						<a href="#" class="btn btn-primary">Add Questions File</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card">
					<div class="card-body">
						<h4 class="card-title">Remove Questions File</h4>
						<p class="card-text">Click here to delete the file with the
							given file name from the database.</p>
						<a href="#" class="btn btn-primary">Remove Questions File</a>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>