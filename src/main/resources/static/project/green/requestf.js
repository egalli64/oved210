<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Welcome here!</title>
<script src="/js/project/green/login.js"></script>
</head>
<body>
	<h1>Welcome!</h1>
	<fieldset>
		<legend>Sign up</legend>
		<form name="frmLog" action="/project/green/login" method="post"
			onsubmit="return checkUser()">
			<div>
				<label for="userId">User:</label>
				<input name="user" id="userId">
				<label for="pwdId">Password:</label>
				<input name="password" id="pwdId" type="password">
			</div>
			<div>
				<button>Check in</button>
			</div>
		</form>
	</fieldset>