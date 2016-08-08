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
    <h1 class="text-center">Step 2</h1>
    <div class="container">
        <form role="form" enctype="multipart/form-data" class="form-horizontal" action="/add_address" method="post">
            <fieldset >
                <div class="form-group">
                    <label>City</label>
                    <input type="text"  class="form-control" name="city" placeholder="input">
                    <label>Street</label>
                    <input type="text"  class="form-control" name="street" placeholder="input">
                    <label>House</label>
                    <input type="text"  class="form-control" name="house" placeholder="input">
                    <label>Landine Phone</label>
                    <input type="text"  class="form-control" name="landinePhone" placeholder="input">
                    <label>ZIP Code</label>
                    <input type="text"  class="form-control" name="zipCode" placeholder="input">

                </div>
                <input type="submit" class="btn btn-primary">
            </fieldset>
        </form>
    </div>


    <footer id="main">

    </footer>
</body>
</html>

