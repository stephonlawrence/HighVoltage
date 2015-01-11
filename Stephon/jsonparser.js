$(document).ready(function(){
	$.get( "test.json", function( data ) {
	  console.log(data.project);
	  $(".dataholder").append("<p>"+data.project+"+"+data.stars+"</p>");
	  // var items = [];
	  // $.each( data, function( key, val ) {
	  //   items.push( "<li id='" + key + "'>" + val + "</li>" );
	  // });
	 
	  // $( "<ul/>", {
	  //   "class": "my-new-list",
	  //   html: items.join( "" )
	  // }).appendTo( "body" );
	});
});