<html>
<body>
<h2>Hello World!</h2>
<p id="displayText">Checkpoint</p>
<script>
	var serv_request = new XMLHttpRequest();
	serv_request.onreadystatechange = function() {
		if (serv_request.readyState == 4 && serv_request.status == 200) {
			console.log("Success!");
			jo = JSON.parse(serv_request.responseText);
			text = jo.name;
			document.getElementById("displayText").innerHTML = text;
		}
	}
	serv_request.open('GET','text', true);
	serv_request.send(null);
</script>
</body>
</html>
