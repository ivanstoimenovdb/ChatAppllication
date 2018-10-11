<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "link" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href= "CSS/semantic.min.css"
	  rel = "stylesheet"
	  type = "text/css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" 
	integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" 
	crossorigin="anonymous">
<link href = "CSS/flag.min.css" 
	  rel = "stylesheet"
	  type = "text/css">
<link href = "CSS/index.css"
	  rel = "stylesheet"
	  type = "text/css">
	  

<script type="text/javascript"
		src = "JS/jquery.min.js"></script>  
<script type="text/javascript"
		src = "JS/semantic.min.js"></script>
<script type="text/javascript"
		src = "JS/index.js"></script>
<meta http-equiv = "Content-Type" content="text/html; charset=UTF-8">
<title>ChatApp</title>
</head>
<body>
<a href = "commonChatRoom.jsp">to common room</a>
		
					<!-- Main conteiner -->
	<div class = "ui conteiner" id = "mainConteiner">
		
					<!-- Menu buttons -->
		<div class = "ui conteiner" id = "menuconteiner">
			<div class = "ui secondary pointing menu">
				<a class = "active item" id = "logButton">
					Logging
				</a>
				<div class = "right menu">
					<a class = "item" id = "regButton">
						Registration
					</a>
				</div>
			</div>
		</div>
		
					<!--  Registration form -->
		<div class = "ui form" id = "registrationForm">
			<link:form action = "register">
			
					<!-- First name field -->
				<link:textfield name = "firstName"
				maxlength="40" 
				placeholder = "Enter first name..." 
				label = "First name" id = "firstNameReg"/>
				
					<!-- Last name field -->
				<link:textfield name = "lastName"
				maxlength="40" 
				placeholder = "Enter your last name..." 
				label = "Last name" id = "lastNameReg" />
				
					<!-- User name field -->
				<link:textfield name = "userName"
				maxlength="40"
				placeholder = "Enter your user name..."
				label = "User name" id = "userNameReg"/>
				
					<!-- Password field -->
				<link:textfield name = "passwordReg"
				maxlength="20"
				placeholder = "Enter your future password..."
				label = "Password" id = "passwordReg"/>
				
					<!--Confirm password field -->
				<link:textfield name = "confirmPassReg"
				maxlength="20"
				placeholder = "Confirm your password..."
				label = "Confirm password" id = "confirmPassReg"/>
				
						<!--Email field -->
				<link:textfield name = "emailReg"
				maxlength="20"
				placeholder = "Enter your email..."
				label = "Email" id = "emailReg"/>
								
						<!-- Buttons of registration -->
				<div class = "ui buttons" id = "wholeBtn">
					
						<!-- Confirm button -->
					<button 
					class = "ui positive button"
					id = "confirmBtn" name="confirmButtonReg">
						Confirm
					</button>
					
						<!-- Or divider -->
					<div class = "or">
					</div>
					
						<!-- Clear button -->
					<button 
					class="ui negative button" 
					id = "clearBtn" name = "clearButtonReg">
  					Clear
  					</button>
  					
  						<!-- Or divider -->
  					<div class = "or ">
  					</div>
  						
  						<!-- Back button -->
  					<button 
  					class = "ui button" 
  					id = "backBtn"
  					name = "backButtonReg">
  					Back
  					</button>
				</div>
			</link:form>
		</div>
		
					<!-- Logging Form -->
		<div class = "logging" id = "loggingForm">
			<link:form action = "logging" 
			class = "ui form" id ="loginForm">
			
					<!-- User Icon -->
				<i class = "fas fa-user fa-2x cust"
				aria-hidden = "true" id = "userIcon">
				</i>
				
					<!-- Lock Icon -->
				<i class = "fas fa-lock fa-2x cust" 
				aria-hidden = "true" id = "lockPass">
				</i>
				
				<div id = "inputFields">
						<!-- User name field - login form -->
					<link:textfield name = "userNameLogging"
					label = "User name"
					class = "logInputs"
					id = "userNameLog" 
					maxlength="20"
					placeholder = "Enter your user name..."/>
					
						<!-- Password field - login form -->
					<link:textfield name = "passwordLogging"
					label = "Password"
					class = "logInputs"
					id = "passLogField"
					maxlength="20"
					placeholder = "Enter your password..."/>
				</div>
					<!-- Submit blue button -->
				<div class = "ui blue button" 
				id = "submitBtn">
					Login
				</div>
				
					<!-- Link to registration form -->
				<div class = "regLink" 
				id = "regLink">
					
					<p
					class = "registerRef"
					id = "reg" name = "registration">
						Registration
					</p>
				
				</div>
				
			</link:form>
		</div>
	</div>
	
</body>
</html>