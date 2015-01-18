$(document).ready(function(){
	var i; 
	function starti(){
		i = setInterval(function(){
			$.get( "test.json", function( data ) {
				var d = JSON.parse(data);
				$(".dataholder").html("<p>"+d.project+"+"+d.stars+"</p>");
			});
		}, 1000/60);
	}
	function stopi(){
		clearInterval(i);
	}
	$('.start').on('click', function(){
		starti();
	});
	$('.stop').on('click', function(){
		stopi();
	});
});