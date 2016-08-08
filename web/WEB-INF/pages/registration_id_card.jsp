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
	<h1 class="text-center">Step 1</h1>
<div class="container">
<form role="form" enctype="multipart/form-data" class="form-horizontal" action="/add_id_card" method="post">
	<fieldset >
		<div class="form-group">
			<label>Name</label>
			<input type="text"  class="form-control" name="name" placeholder="input">
			<label>Last Name</label>
			<input type="text"  class="form-control" name="lastName" placeholder="input">
			<label>Surname</label>
			<input type="text"  class="form-control" name="surName" placeholder="input">
			<label>Data</label>
			<input type="text"  class="form-control" name="dateOfBirth" placeholder="input">
			<label>Series ID Card</label>
			<input type="text"  class="form-control" name="seriesIDCard"  placeholder="input">
			<label>Number ID Card</label>
			<input type="text"  class="form-control" name="numberIDCard" placeholder="input">
			<label>TAX Number</label>
			<input type="text"  class="form-control" name="taxNumber" placeholder="input">
		</div>

		<input type="submit" class="btn btn-primary">
	</fieldset>
</form>
	</div>


<footer id="main">

</footer>
</body>
</html>

