$(document).ready(function(){
// Identify every user uniquely
var uniqueId = Math.random().toString(36).substring(2)+(new Date()).getTime().toString(36);
var date = new Date();


// Sending message
$("#sendIcon").click(function(){
		var message = $('#textField').val();

		$.post('sendMsg.action',{
			message:message,
			uniqueId:uniqueId
		})
		.done(function(data){
			$("#textField").val("");
		});
});

//Printing message

var pusher = new Pusher('f9ee0bbcbb88171b126d',{cluster:'eu',encrypted: true});

var channel = pusher.subscribe('FunChatApplication');
channel.bind('sendMsg',function(data){

	var determination = (data.uniqueId == uniqueId) ?  "self" : "participants";
	var identification = (data.uniqueId == uniqueId) ? "Me" : "Participant";
	var directionTimeStamp = (data.uniqueId == uniqueId) ? "timeStampSelf" : "timeStampParticipant";
	var directionId = (data.uniqueId==uniqueId) ? "selfId" : "participantId" ;
	var directionMessage = (data.uniqueId == uniqueId) ? "selfMessage" : "chatMessageParticipant";

	$('#chatWindow').append(
		`<div class = "chat ${determination}">
				<p class = "${directionTimeStamp}"></p>
				<p class = "${directionId}">${identification}:</p>
				<p class = "${directionMessage}">${data.message}</p>
			</div>`
	);
});

});