<!-- Login Session -->

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Login</title>
</head>
<body>
	<form action=" " method="post">
		Username <input type="text" name="user"><br>
		Password <input type="password" name="password"><br>
		<input type="submit" value="Submit" name="submit" >
		<!-- <a href="session_logout.php">Click here to clean</a> -->
		<input type="submit" value="Session Logout" name="logout">
	</form>

	<?php
		if (isset($_POST['submit'])) {
			$user = $_POST['user'];
			$password = $_POST['password'];

			$con = pg_connect("host=localhost user=postgres password=ashish.10 dbname=ashish");
			if ($con) {
				$query = "select * from login where username='$user' and password='$password'";
				$result = pg_query($con, $query);

				if (!$result)
					echo "Login Denied";
				else
					echo "User $user is successfully logged in";
			}
		}

		if (isset($_POST['logout'])) {
			session_start();
			unset($_SESSION['user']);
			unset($_SESSION['pass']);
			echo "You have cleaned session";
			echo "<br>Refreshing in 5 seconds..";
	
			header('refresh:4; URL=20.php');
		}
	?>
</body>
</html>