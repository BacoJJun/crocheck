<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
<script type='text/javascript' src='js/loginform.js'></script>
</head>
<body class="sessions new">
  <div class="container" id="sessions-content">
  <div class="col-lg-4 col-md-4"></div>
  <div class="col-md-4 document">
    <div class="section" style='background-color:white; padding: 21px 30px 42px;margin-top:0px;margin-bottom: 5px;'>
    <img alt="CroCheck" id="brand-logo" class="img-responsive" src="img/logo-sdns.png" />
    <h3 class="text-center">접속하기</h3>

    <div class="form"><input name="utf8" type="hidden" value="&#x2713;" /><input type="hidden" name="authenticity_token" value="" />
        <div class="form-inputs">
          <div class="form-group string optional admin_username"><label class="control-label string optional" for="admin_username">Username</label><input class="form-control string optional" autofocus="autofocus" type="text" value="" name="admin[username]" id="admin_username" /></div>
          <div class="form-group password optional admin_password"><label class="control-label password optional" for="admin_password">Password</label><input class="form-control password optional" type="password" name="admin[password]" id="admin_password" /></div>
          <div class="form-group boolean optional admin_remember_me"><div class="checkbox"><input value="0" type="hidden" name="admin[remember_me]" /><label class="boolean optional" for="admin_remember_me"><input class="boolean optional" type="checkbox" value="1" name="admin[remember_me]" id="admin_remember_me" />Remember me</label></div></div>
        </div>
        <div class="form-actions text-right">
          <input type="submit" name="commit" value="로그인" class="btn btn-default" id="loginsubmit" />
        </div>
</div>  
</div>
<div style='text-align:center;padding-top:20px;'>
<img style="position:relative;top:-2px;" src="/img/ci.png" width="185" height="50" /> copyright. 2017
</div>
</div>
</div>
</body>
</html>
