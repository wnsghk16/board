<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<form action="/action_page.php" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
    
	<label for="UserID"><b>UserID</b></label>
    <input id="userid" type="text" placeholder="Enter UserID" name="userid" required>

    <label for="Passwd"><b>Password</b></label>
    <input id="passwd" type="password" placeholder="Enter Password" name="passwd" required>
    
    <label for="Name"><b>Name</b></label>
    <input id="name" type="text" placeholder="Enter Name" name="name" required>
    
    <label for="email"><b>Email</b></label>
    <input id="email" type="text" placeholder="Enter Email" name="email" required>

    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>
    
    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button id="signup_btn" type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>   
<script>
$('#signup_btn').click(function(e){
	e.preventDefault()
	alert(`컨텍스트함 : ${ctx}`)
	$.ajax({
		url : `${ctx}/person/users`,
		type : 'POST',
		data : JSON.stringify(),
		dataType : 'json',
		contentType : 'application.json; charset=UTF-8',
		success: function(res){
			
		},
		error : function(err){
			alert(err)
		}
	})
})
</script> 
 <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
  padding: 14px 20px;
  background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
}
</style>