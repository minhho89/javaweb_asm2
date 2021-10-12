<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Welcome ${user.userName}</title>
	<link rel="stylesheet" href="styles/main.css" type="text/css">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
	
</head>
<body>

	<div class="sidenav">
		<h1>1849 TEAM</h1>
		<a href="#">Dashboard</a>
		<a href="#">Staff Manager</a>
	</div>
	
	<div class="jumbotron"></div>
	<div class="main">
	  <h2>Members of the team</h2>
	  <table class="table table-sm table-dark">
		  <thead>
		    <tr>
		      <th scope="col">ID</th>
		      <th scope="col">Name</th>
		      <th scope="col">Student ID</th>
		      <th scope="col">Class</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <th scope="row">1</th>
		      <td>Member 1</td>
		      <td>Member Code 1</td>
		      <td>Class 1</td>
		    </tr>
		    <tr>
		      <th scope="row">2</th>
		      <td>Member 2</td>
		      <td>Member Code 2</td>
		      <td>Class 2</td>
		    </tr>
		    <tr>
		      <th scope="row">3</th>
		      <td>Member 3</td>
		      <td>Member Code 3</td>
		      <td>Class 3</td>
		    </tr>
		  </tbody>
		</table>
	</div>

	<!-- Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
</body>
</html>