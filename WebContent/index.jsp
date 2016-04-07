<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MortgagePage</title>
</head>
<body>
<form action="MortgageProcess" method="post">
	<h2>Mortgage Calculator</h2>
	<h3>Please Enter:</h3>
		<p>
			Principal: <input type="text" name="principal" value=${param.principal}><br> 
			Rate: <input type="text" name="rate" value=${param.rate}><br> 
			Term in Years: <input type="number" name="term" min="1" max="30" value=${param.term}><br>			
			<input type="submit" value="Calculate"> <br>
		</p>
			
	</form>
	${message}
</body>
</html>