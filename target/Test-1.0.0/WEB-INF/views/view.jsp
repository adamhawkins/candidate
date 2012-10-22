<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Candidate</title>

    <meta name="description" content="Candiate test">
    <meta name="author" content="Adam Hawkins">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>    
    <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.1.1/css/bootstrap-combined.min.css" rel="stylesheet">
    <script src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.1.1/js/bootstrap.min.js"></script>
<script>

  var CANDIDATE = {
		  clicked: function(ele){
			  $(ele).button('loading');
			  
			  $.ajax({
				  url: '/mvc/json',
				  dataType:'json',
				  success: function(res) {
					  console.log(res);
			        $('#movies tr:first-child').after("<tr><td>" + res.name + "</td></tr>");
			        $('#movies').find('tr:gt(10)').remove();
				  },
				  error: function(e, xhr, settings, exception) {
				      var error = $('<div class="alert alert-error">' + e.statusText + '</div>').insertBefore('#movies');
				      setTimeout(function(){
				    	  error.slideUp(function(){
				    		  error.remove();
				    	  })
				      },1000);
				  },
				  complete: function(){
					  $(ele).button('reset');
				  }
				});
		  }
  }
  
  $(function(){
	  
  });
</script>
</head>
<body>
    <div class="container-fluid">
      <div class="row-fluid">
      <button class="btn btn-primary" data-loading-text="Loading.." onclick="CANDIDATE.clicked(this)" style="margin-top:10px;margin-bottom:10px">Click me</button>

      <table class="table table-bordered" id="movies" style="margin-top:10px  ">
        <tr><th>Movie title</th></tr>
      </table>
      
      </div>
    </div>
</body>
</html>