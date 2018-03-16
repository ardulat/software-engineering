<!DOCTYPE html>
<html>
<head>
<title>Asynchronous requests</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

</head>
	<body>

		<h1 id="promise1">Hello world!</h1>
		<h2 id="promise2">Hello world!</h2>

		<script>
			// setTimeout
			var promise1 = new Promise(function(resolve, reject) {
  				setTimeout(resolve, 100, 'async');
			});

			promise1.then(function (greeting) {
			 	document.getElementById("promise1").innerHTML = "Hello " + greeting + "!";
			 	console.log('setTimeout done!');
			});

			// ajax
			var url = 'http://localhost:8080/amaratkhan_ayessembayev_lab7/text';
			var promise2 = new Promise(function(resolve,reject) {
				var response = $.ajax(url);
				var greeting = response.done(function (msg) {
					return JSON.parse(response.responseText).name;					
				});
				resolve(response);
			});

			promise2.then(function (greeting) {
				var name = JSON.parse(greeting).name;
				document.getElementById("promise2").innerHTML = "Hello " + name + "!";
				console.log('jQuery done!');
			});

		</script>
	</body>
</html>
