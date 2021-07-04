// console.log("Hi testing");
window.onload = function(){
	const myForm = document.getElementById("myForm");
	
	myForm.addEventListener('submit', function(e)
	{
		e.preventDefault();

		const toSend = {
			username: document.getElementById("username").value,
			password: document.getElementById("password").value
		};
		
		// console.log(JSON.stringify(toSend));

		function getData(callback)
		{
			var obj;
			fetch('http://localhost:8080/login',
			{
				method: 'post',
				headers: {
				    'Content-Type': 'application/json',
				},
				body: JSON.stringify(toSend),
				mode: 'cors'
			}).then(function (response){
				return response.json();
			}).then(function (json){
				obj = json;
			}).then(function(){
				callback(obj);
			}).catch(function (error){
				console.error(error);
			});
		}

		function doSomething(obj)
		{
			// console.log(obj.reponseText);
			window.alert(obj.responseText);
		}

		getData(doSomething);
	});
}