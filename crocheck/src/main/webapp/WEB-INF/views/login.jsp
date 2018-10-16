<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<link rel="icon" href="img/favicon.ico" type="image/ico" />
<title>CROCHECK SDNS</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body class="sessions new">
  <div class="container" id="sessions-content">
  <div class="col-lg-4 col-md-4"></div>
  <div class="col-md-4 document">
    <div class="section" style='background-color:white; padding: 21px 30px 42px;margin-top:0px;margin-bottom: 5px;'>
    <img alt="CroCheck" id="brand-logo" class="img-responsive" src="img/logo-sdns.png" />
    <h3 class="text-center">접속하기</h3>

    <form action="/logincheck" id="logincheck" method="post">
        <div class="form-inputs">
          <div class="form-group string optional admin_username"><label class="control-label string optional" for="admin_username">Username</label><input class="form-control string optional" autofocus="autofocus" type="text" value="" name="admin_username" id="admin_username" /></div>
          <div class="form-group password optional admin_password"><label class="control-label password optional" for="admin_password">Password</label><input class="form-control password optional" type="password" name="admin_password" id="admin_password" /></div>
        </div>
        <div class="form-actions text-right">
          <input type="submit" name="commit" class="btn btn-default " id="loginsubmit" value="접속"/>
        </div>
</form>  
</div>
<div style='text-align:center;padding-top:20px;'>
<img style="position:relative;top:-2px;" src="/img/ci.png" width="185" height="50" /> copyright. 2017
</div>
</div>
</div>
</body>
</html>
