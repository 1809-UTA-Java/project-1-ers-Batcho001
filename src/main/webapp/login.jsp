<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html;" />
<title>Login Page</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<form method="post" action="Login">
		<div style="padding: 100px 0 0 250px;">
			<div>
				<h2>Login Page</h2>
				Please provide your credential to use this website <br> <br>
						<div style="margin-top: 20px;">Username:</div>
						<div style="margin-top: 20px;">
							<input name="username" title="Username"
								value="" size="30" maxlength="50" />
						</div>
						<div>Password:</div>
						<div>
							<input name="password" type="password"
								title="Password" value="" size="30" maxlength="48" />
						</div>  New User? <a
							href="register.jsp" style="margin-left: 30px;">Register Here</a>
					<br /> <br /> <input style="margin-left: 100px;" type="submit"
						value="Login" />
			</div>
		</div>
	</form>
</body>
</html>