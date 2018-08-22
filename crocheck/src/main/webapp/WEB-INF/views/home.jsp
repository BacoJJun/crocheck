
<!DOCTYPE html>
<html>
  <head>
    <title>Smoothie Chart Example</title>
    <script type="text/javascript" src="/crocheck/js/smoothie.js"></script>
  </head>
  <body>

    <h1>Smoothie Example</h1>

    <canvas id="mycanvas" width="400" height="100"></canvas>
	<!-- Jquery JS-->
	<script src="vendor/jquery-3.2.1.min.js"></script>
	<!-- Bootstrap JS-->
	<script src="vendor/bootstrap-4.1/popper.min.js"></script>
	<script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
	<!-- Vendor JS       -->
	<script src="vendor/slick/slick.min.js">
		
	</script>
	<script src="vendor/wow/wow.min.js"></script>
	<script src="vendor/animsition/animsition.min.js"></script>
	<script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
		
	</script>
	<script src="vendor/counter-up/jquery.waypoints.min.js"></script>
	<script src="vendor/counter-up/jquery.counterup.min.js">
		
	</script>
	<script src="vendor/circle-progress/circle-progress.min.js"></script>
	<script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
	<script src="vendor/chartjs/Chart.bundle.min.js"></script>
	<script src="vendor/select2/select2.min.js"></script>
    <script type="text/javascript">

      // Random data
      var line1 = new TimeSeries();
      var line2 = new TimeSeries();
      var line3 = new TimeSeries();
      
      setInterval(function() {
    		var jsondata = $.ajax({
    			url : '/crocheck/SystemStatus'
    				, type : 'post'
    				, dataType : 'json'
    				, async : false
    				, success : function(result){
    						if(result.result == 'success'){
    					        line1.append(new Date().getTime(),  result.systemStatus[0].cpu_sys_pct.toFixed(0));
    					        line2.append(new Date().getTime(), result.systemStatus[0].cpu_user_pct.toFixed(0) );	 
    					        line3.append(new Date().getTime(), result.systemStatus[0].cpu_idle_pct.toFixed(0) );	    					
    						}else{
    							alert(result.errorMsg);
    						}
    				}
    				, error : function(request){
    					alert('error!'); 
    					alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n");
    				}
    		});

      }, 1000);

      var smoothie = new SmoothieChart({ grid: { strokeStyle: 'rgb(125, 0, 0 )', fillStyle: 'rgb(60, 0, 0)', lineWidth: 1, millisPerLine: 250, verticalSections: 6 } });
      smoothie.addTimeSeries(line1, { strokeStyle: 'rgb(0, 255, 0)', fillStyle: 'rgba(0, 1, 0, 0.4)', lineWidth: 3 });
      smoothie.addTimeSeries(line2, { strokeStyle: 'rgb(255, 0, 255)', fillStyle: 'rgba(1, 0, 255, 0.3)', lineWidth: 3 }); 
      smoothie.addTimeSeries(line3, { strokeStyle: 'rgb(0, 0, 255)', fillStyle: 'rgba(1, 0, 255, 0.3)', lineWidth: 3 }); 
      smoothie.streamTo(document.getElementById("mycanvas"), 1000);
    </script>

    <p><a href="tutorial.html">Return to tutorial</a></p>
  
  </body>
</html>