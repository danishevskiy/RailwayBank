<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

	<title>Test</title>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</head>
<body>
<div class="jumbotron" style="margin-top:20px">
	<h2 class="text-center">Registration</h2>
	<h1 class="text-center">Step 3</h1>
<div class="container">
<form role="form" enctype="multipart/form-data" class="form-horizontal" action="/add_client" method="post">
	<fieldset >
		<div class="form-group">
			<label>Mobile Phone</label>
			<input type="text"  class="form-control" name="mobilePhone" placeholder="input">
			<label>Password</label>
			<input type="text"  class="form-control" name="password" placeholder="input">
			<label>email</label>
			<input type="text"  class="form-control" name="email" placeholder="input">
			<!--<label>Series ID Card</label>
			<input type="text"  class="form-control" placeholder="input">
			<label>Number ID Card</label>
			<input type="text"  class="form-control" placeholder="input">
			<label>TAX Number</label>
			<input type="text"  class="form-control" placeholder="input">-->
		</div>
		<!--<div class="form-group">
			<label for="Select">select menu</label>
			<select id="Select" class="form-control">
				<option>select</option>
			</select>
		</div>
		<div class="checkbox">
			<label>
				<input type="checkbox"> check this
			</label>
		</div>-->
		<input type="submit" class="btn btn-primary">
	</fieldset>
</form>
	</div>


<footer id="main">

</footer>
</body>
</html>

