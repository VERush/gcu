<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>University</title>

<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<h1>Welcome to Grand Circus University!</h1>
		
		<a href="/courselist"><button>List Courses</button></a><br>
				<a href="/studentlist"><button>List Students</button></a><br>
		<a href="/courseroster"><button>Show Roster for a Class</button></a><br>
		<a href="/transcript"><button>Show a Student Transcript</button></a><br>
		
	</div>
	

</body>
</html>