<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href = "CSS/semantic.min.css" rel = "stylesheet" type = "text/css">
<link href = "CSS/chatPage.css" rel = "stylesheet" type = "text/css">
<link href = "CSS/flag.min.css" rel = "stylesheet" type = "text/css">
<link href = "CSS/icon.min.css" rel = "stylesheet" type = "text/css">
<script type ="text/javascript" src = "JS/jquery.min.js"></script>
<script src="https://js.pusher.com/4.1/pusher.min.js"></script>
<script type="text/javascript" src = "JS/procMsg.js"></script>
<script type ="text/javascript" src = "JS/semantic.min.js"></script>
<script type = "text/javascript" src = "JS/chatDesign.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chat window</title>
</head>
<body> 
	
	<div class= "ui conteiner" id = "mainChatConteiner">
		<div class = "ui conteiner-fluid" id = "chatWindow">
		<!--  
			<div class = "chat self">
				<p class = "timeStampSelf">Date</p>
				<p class = "selfId">Me:</p>
				<p class = "selfMessage">message</p>
			</div>
			
			<div class = "chat participants">
				<p class = "timeStampParticipant" >Date</p>
				<p class = "participantId" >Name:</p>
				<p class = "chatMessageParticipant">message</p>
			</div>
		-->
		</div>
		
		<div class = "ui input" id = "inputElements">
			
			<input type = "text"
			placeholder = "Enter message here..." 
			id = "textField">
			
			<i class = "blue big paper plane icon" 
			id = "sendIcon"></i> 
		
		</div>
	</div> 
	
</body>
</html>