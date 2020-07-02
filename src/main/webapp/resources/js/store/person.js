var person = person || {}
person = (function(){
	let _, javascript, session
	let init = function(){
		 _ = sessionStorage.getItem('context')
		 javascript = sessionStorage.getItem('javascript')
		 session = sessionStorage.getItem('session')
	}
	
	let join = function(payload){
		$.ajax({
			url : _+`/person/users`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				location.href = _+'/location/person/loginForm'
			},
			error: function(err){
				location.href = _+'/location/person/joinForm'
			}
		})
	}
	
	let login = function(payload){
		$.ajax({
			url : _+`/person/users/${payload.userid}`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				alert('성공')
				location.href = _+'/user'
			},
			error: function(err){
				alert('실패')
				location.href = _+'/location/person/loginForm'
			}
		})
	}
	
	let logout = function(){
		sessionStorage.removeItem('userid')
		sessionStorage.removeItem('context')
		sessionStorage.removeItem('javascript')
		sessionStorage.removeItem('css')
		sessionStorage.removeItem('image')
		location.href = _+'/' 
	}

	let remove = function(){
		$.ajax()
		sessionStorage.removeItem('userid')
		sessionStorage.removeItem('context')
		sessionStorage.removeItem('javascript')
		sessionStorage.removeItem('css')
		sessionStorage.removeItem('image')
		location.href = _+`/`
	}
	return {init, join, login, logout, remove}
})()