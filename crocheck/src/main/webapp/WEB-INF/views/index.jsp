<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Dashboard</title>

    <!-- Fontfaces CSS-->
    <link href="css/font-face.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href="vendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="vendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/theme.css" rel="stylesheet" media="all">

</head>

<body >
    <div class="page-wrapper">
        <!-- HEADER MOBILE-->
        <!-- END HEADER MOBILE-->

        <!-- PAGE CONTAINER-->
        <div class="container">
            <!-- HEADER DESKTOP-->
            <!-- HEADER DESKTOP-->

            <!-- MAIN CONTENT-->
            <div class="content">
                <div class="section__content section__content--p60 ">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="overview-wrap">
                                    <h2 class="title-1">2018. 08. 07  10:00:00</h2>
                                    <button class="au-btn au-btn-icon au-btn--blue">
                                        <i class="zmdi zmdi-plus"></i>MENU</button>
                                </div>
                            </div>
                        </div>
			<div class="row">
                        <div class="row col-sm-6 col-lg-8">
                            <div class="col-sm-6 col-lg-6">
                                <div class="overview-item overview-item--c1">
                                    <div class="overview__inner">
                                        <div class="overview-box clearfix">
                                            <div class="text-right" style="color:white;">
                                                <span>Today Total</span>
                                                <h2 style="color:white;">1036128</h2>
                                                <span>Yesterday 총합    </span>
                                                <span>12302029</span>
                                            </div>
                                        </div>
                                    </div>
				</div>
			        </div>
				<div class="col-sm-6 col-lg-6">
                                <div class="overview-item overview-item--c4" >
                                    <div class="overview__inner">
                                        <div class="overview-box clearfix">
                                            <div class="text-right">
                                                <span>Today Total</span>
                                                <h2 style="color:white;">1036128</h2>
                                                <span>Yesterday Total    </span>
                                                <span>12302029</span>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="au-cardw col-lg-12">
                                    <div class="au-card-inner">
                                        <div class="cahrtjs-size-monitor">
                                            <canvas id="barChart"  style="height:480px;" ></canvas>
                                        </div>
                                    </div>
                            </div>
			</div>
			<div class="row col-sm-6 col-lg-4">
                            <div class="col-sm-6 col-lg-6">
                                <div class="statistic__item statistic__item--blue">
                                    <div class="overview__inner">
                                        <div class="overview-box clearfix">
                                            <div class="text-right" style="color:white;">
                                                <h2 class="text-left" style="color:white;">CPU</h2>
                                                <h2 style="color:white;" id="cpu_idle">52%</h2>
                                                <p>IOWait : <span id="cpu_iowait">48</span></p>
                                                <p>System : <span id="cpu_sys">0%</span></p>
                                                <p>User : <span id="cpu_user">48</span></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-lg-6">
                                <div class="statistic__item statistic__item--blue">
                                    <div class="overview__inner">
                                        <div class="overview-box clearfix">
                                            <div class="text-right" style="color:white;">
                                                <h2 style="color:white;">MEMORY</h2>
                                                <h2 style="color:white;" id="mem_percentage">32%</h2>
                                                 <p class="text-right" id="mem_total"></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
			    <div class="col-md-6 col-lg-6">
                                <div class="statistic__item">
                                        <div class="overview-box clearfix">
                                            <div class="text-right" style="color:white;">
                                                <h2 class="number text-left">Network</h2>
                                                <h2 >52%</h2>
                                                <span class="desc">Idle : 48%    </span></br>
                                                <span class="desc">IOWait : 0%</span></br>
                                                <span class="desc">System : 0%</span></br>
                                                <span class="desc">User : 0%</span>
                                            </div>
                                        </div>
                                </div>
                            </div>
				<div class="col-md-6 col-lg-6">
                                <div class="statistic__item statistic__item--blue">
                                    <div class="overview__inner">
                                        <div class="overview-box clearfix">
                                            <div class="text-right" style="color:white;">
                                                <h2 class="text-left" style="color:white;">DISK</h2>
                                                <h2 style="color:white;">52%</h2>
						<span class="desc">Total : 719837289MB    </span></br>
						<span class="desc">/ : 15%    </span></br>
                                                <span class="desc">/boot : 13%</span></br>
                                                <span class="desc" style="color:red;">/DATA1 : 55%</span></br>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

			</div>
			</div>
                        <div class="row">
                            <div class="col-sm-6 col-lg-6">
                                <h2 class="title-1 m-b-25">Domain Top List</h2>
                                <div class="table-responsive table--no-card m-b-40">
                                    <table class="table table-borderless table-striped table-earning">
                                        <thead>
                                            <tr>
                                                <th>date</th>
                                                <th>order ID</th>
                                                <th class="text-right">price</th>
                                            </tr>
                                        </thead>
                                        <tbody>

                                        </tbody>
                                          
                                        
                                    </table>
                                </div>
                            </div>
                            <div class="col-sm-6 col-lg-6">
                                <h2 class="title-1 m-b-25">Client Top List</h2>
                                <div class="au-card au-card--bg-blue au-card-top-countries m-b-40">
                                    <div class="au-card-inner">
                                        <div class="table-responsive">
                                            <table class="table table-top-countries">
                                                <tbody>
                                        			<div id="show_domain"></div>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="copyright">
					<p> HUMANSTAR </p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
	</div>
            <!-- END MAIN CONTENT-->
            <!-- END PAGE CONTAINER-->
        </div>

    </div>

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
    <script src="vendor/select2/select2.min.js">
    </script>
        <script type="text/javascript" src="/crocheck/js/refresh.js"></script>

    <!-- Main JS-->
    <script src="js/main.js"></script>

</body>

</html>
<!-- end document-->
