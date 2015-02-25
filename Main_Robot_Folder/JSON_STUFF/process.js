$(document).ready(function(){
	start();
	$('.stop').on('click', function(){
		stops();
	});
	$('.start').on('click', function(){
		start();
	});
});
var run = function(){
	$.getJSON('output.json', function(data){
		console.log(data);
		$('.mainObject').html('');
		for(var arobj in data.sensors){
			
			sensor = data.sensors[arobj];
			console.log(sensor);
			//var lio = document.createElement("LI");
			var arrayobj = document.createElement("DIV");
			//arrayobj.innerHTML = "Array: " + arobj;
			arrayobj.className = "arrayObject";
			//$(lio).append(arrayobj);
			$('.mainObject').append(arrayobj);
			for(var property in sensor){
				console.log(property+": "+sensor[property]);
				var propdiv = document.createElement("DIV");
				//$(propdiv).append(sensor[property]+"<span>"+property+"<span>");
				if(property === 'name'){
					$(propdiv).append(sensor[property]+": ");
					propdiv.className = "name";
				}else{
					$(propdiv).append(sensor[property]);
					propdiv.className = "property";
				}
				//var propdiv = sensor[property]+"<span>"+property+"</span>";
				$(arrayobj).append(propdiv);
			}
		}
	});
};
var interval;
var start = function(){
	interval = setInterval(run, 30);
};
var stops = function(){
	clearInterval(interval);
};
