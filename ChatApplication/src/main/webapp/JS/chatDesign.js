//J QUERY FOR COMMON CHAT WINDOW

$(document).ready(function(){

	$('#textField').focus(function(){
		$(this).animate({
			width: '600px'
		},600);
		$(this).css('border','solid 1px lightgrey');
		$(this).css('box-shadow','none');	
	});

	$('#textField').blur(function(){
		$(this).animate({
			width: '200px'
		},600);
		$(this).css('border','outset 3px lightgrey');
		$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
	});

	$('#sendIcon').on({

		mouseenter: function(){
			$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
			$(this).css('border','outset lightgrey 3px');
		},

		mouseleave: function(){
			$(this).css('box-shadow','none');
			$(this).css('border','solid lightgrey 1px');
		},

		mousedown: function(){
			$(this).css('box-shadow','none');
			$(this).css('border','solid lightgrey 1px');
		},

		mouseup: function(){
			$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
			$(this).css('border','outset lightgrey 3px');
		}
	});
});