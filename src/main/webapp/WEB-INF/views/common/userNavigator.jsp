<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Portfolio</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Gallery</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a id="logout"><span class="glyphicon glyphicon-log-out"></span> 로그아웃</a></li>
        <li><a id="remove"><span class="glyphicon glyphicon-remove"></span> 회원탈퇴</a></li>
      </ul>
    </div>
  </div>
</nav>
<script src="${javascript}/store/person.js"></script>
<script>
document.getElementById('logout').addEventListener('click',function(e){
	e.preventDefault()
	person.init()
	person.logout()
})
document.getElementById('remove').addEventListener('click',function(e){
	e.preventDefault()
	person.init()
	person.remove()
})
</script>