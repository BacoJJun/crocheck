
<!DOCTYPE html><html lang='en' class=''>
<head>
<!-- <script src='js/event-runner.js'></script> -->
<meta charset='UTF-8'>
<meta name="robots" content="noindex">
<meta name="viewport" content="width=device-width, initial-scale=1">

<style class="cp-pen-styles">body{
  margin: 0;
  padding: 0;
  background: #CCC;
}

.container{
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  min-width: 500px;
  margin: 0px;
}
.head{
  width: 100%;
  text-align: center;
  font-family: 'Lato', sans-serif;
  padding-bottom: 20px;
  font-weight: normal;
  color: #222;
  letter-spacing: 1px
}
.component{
  float: left;
  margin: 10px;
  position: relative;
}

.signals{
  width: 30%;
  height: 200px;
}
.signals .dot{
  width: 15px;
  height: 15px;
  background: #121212;
  display: inline-block;
  border-radius: 50%;
  position: absolute;
  left: 30%;
  top: 50%;
  opacity: 0;
  transform: translate(-50%, -50%);
  animation: blink 3s ease-in infinite alternate;
}

.signals .first{
  margin-left: 0px;
}

.signals .second{
  margin-left: 30px;
  animation-delay: 0.2s;
}

.signals .third{
  margin-left: 60px;
  animation-delay: 0.4s;
}
.signals .fourth{
  margin-left: 90px;
  animation-delay: 0.6s;
}
.signals .fifth{
  margin-left: 120px;
  animation-delay: 0.8s;
}
.signals .sixth{
  margin-left: 150px;
  animation-delay: 1s;
}
.signals .seventh{
  margin-left: 180px;
  animation-delay: 1.2s;
}
@-webkit-keyframes blink{
  from { opacity: 0 }
  to { opacity: 1 }
}

@media only screen and (max-width: 500px){
  .container{
    width: 100%;
    min-width: 100%
  }
  .component{
    display: block;
    float: left;
    clear: both;
    left: 50%;
    transform: translateX(-50%);
  }
  .signals{
    transform: translateX(-50%) rotate(90deg);
  }
  .server{
    width: 17%;
  }
}</style></head><body>

<div class="container">
  <h3 class="head">Connecting to server</h3>

		<div class="component signals">
			<div class="dot first"></div>
			<div class="dot second"></div>
			<div class="dot third"></div>
			<div class="dot fourth"></div>
			<div class="dot fifth"></div>
			<div class="dot sixth"></div>
			<div class="dot seventh"></div>
		</div>

	</div>

</body></html>