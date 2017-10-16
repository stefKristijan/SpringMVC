<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${headerMessage}</h1>
	<form:errors path="student.*"/>
	<form action="" method="post">
	
		<label>
			Student's name: <input type="text" name="name" /> <br>
		</label>
		<label>
			Student's hobby: <input type="text" name="hobby" /><br>
		</label>
		<label>
			Student's mobile: <input type="text" name="mobile" /><br>
		</label>
		<label>
			Student's date: <input type="text" name="date" />
		</label><br>
		<label>
			Student's skills: 
			<select name="skills" multiple>
				<option value="Java Core">Java Core</option>
				<option value="Java Core2">Java Cor2</option>
				<option value="Java Core3">Java Cor3</option>
			</select>
		</label>
		<input type="submit" value="Submit student" />
	</form>

</body>
</html>