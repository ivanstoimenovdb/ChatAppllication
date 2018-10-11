// J Query for index
$(document).ready(function(){

	$('#regButton').click(function(){

		$(this).addClass("active");
		$('#logButton').removeClass("active");

		$("#registrationForm").animate({
			left: "180px",
			opacity: 1,
		});

		$('#registrationForm').css("zIndex",1);
		$('#registrationForm').css('box-shadow','10px 10px 32px 5px');
		$('#registrationForm').css('border','outset 3px darkgrey');

		$("#loggingForm").animate({
			left: "250px",
			opacity: 0.1,
		});

		$('#loggingForm').css("zIndex",0);
		$('#loggingForm').css('box-shadow','none');
		$('#loggingForm').css('border','solid 1px black');
	});

	$('#logButton').click(function(){
		$(this).addClass("active");
		$('#regButton').removeClass("active");

		$("#loggingForm").animate({
			left: "450px",
			opacity: 1,
		});

		$('#loggingForm').css("zIndex",1);
		$('#loggingForm').css('box-shadow','10px 10px 32px 5px');
		$('#loggingForm').css('border','outset 3px darkgrey');

		$("#registrationForm").animate({
			left: "450px",
			opacity: 0.1,
		});

		$('#registrationForm').css("zIndex",0);
		$('#registrationForm').css('box-shadow','none');
		$('#registrationForm').css('border','solid 1px black');

	});

	$('#registrationForm').click(function(e){
		if(!$(e.target).hasClass('button'))
		{
			$('#regButton').addClass("active");
			$('#logButton').removeClass("active");

			$(this).animate({
				left: "180px",
				opacity: 1,
			});

			$(this).css("zIndex",1);
			$(this).css('box-shadow','10px 10px 32px 5px');
			$(this).css('border','outset 3px darkgrey');

			$("#loggingForm").animate({
				left: "250px",
				opacity: 0.1,
			});

			$('#loggingForm').css("zIndex",0);
			$('#loggingForm').css('box-shadow','none');
			$('#loggingForm').css('border','solid 1px black');
		}
	});

	$('#loggingForm').click(function(e){
		if(!$(e.target).hasClass('registerRef'))
		{
		$('#logButton').addClass("active");
		$('#regButton').removeClass("active");

		$(this).animate({
			left: "450px",
			opacity: 1,
		});

		$(this).css("zIndex",1);
		$(this).css('box-shadow','10px 10px 32px 5px');
		$(this).css('border','outset 3px darkgrey');

		$("#registrationForm").animate({
			left: "450px",
			opacity: 0.1,
		});

		$('#registrationForm').css("zIndex",0);
		$('#registrationForm').css('box-shadow','none');
		$('#registrationForm').css('border','solid 1px black');
		}
	});

	$('#reg').click(function(){

		$('#regButton').addClass("active");
		$('#logButton').removeClass("active");

		$('#registrationForm').animate({
			left: "180px",
			opacity: 1,
		});

		$('#registrationForm').css("zIndex",1);
		$('#registrationForm').css('box-shadow','10px 10px 32px 5px');
		$('#registrationForm').css('border','outset 3px darkgrey');

		$("#loggingForm").animate({
			left: "250px",
			opacity: 0.1,
		});

		$('#loggingForm').css("zIndex",0);
		$('#loggingForm').css('box-shadow','none');
		$('#loggingForm').css('border','solid 1px black');
	});

	$('#userNameLog').focus(function(){
		$('#userIcon').animate({
			opacity: 1
		},400);
		$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
		$(this).css('border','outset lightgrey 3px');
	});

	$('#userNameLog').blur(function(){
		$('#userIcon').animate({
			opacity: 0.1
		},400);
		$(this).css('box-shadow','none');
		$(this).css('border', 'solid lightgrey 1px');
	});

	$('#passLogField').focus(function(){
		$('#lockPass').animate({
			opacity: 1
		},400);
		$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
		$(this).css('border','outset lightgrey 3px');
	});

	$('#passLogField').blur(function(){
		$('#lockPass').animate({
			opacity: 0.1
		},400);
		$(this).css('box-shadow','none');
		$(this).css('border', 'solid lightgrey 1px');
	});

	$('#firstNameReg').focus(function(){
		$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
		$(this).css('border', 'outset lightgrey 3px');
	});

	$('#firstNameReg').blur(function(){
		$(this).css('box-shadow','none');
		$(this).css('border', 'solid lightgrey 1px');
	});

	$('#lastNameReg').focus(function(){
		$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
		$(this).css('border', 'outset lightgrey 3px');
	});

	$('#lastNameReg').blur(function(){
		$(this).css('box-shadow','none');
		$(this).css('border', 'solid lightgrey 1px');
	});

	$('#userNameReg').focus(function(){
		$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
		$(this).css('border', 'outset lightgrey 3px');
	});

	$('#userNameReg').blur(function(){
		$(this).css('box-shadow','none');
		$(this).css('border', 'solid lightgrey 1px');
	});

	$('#passwordReg').focus(function(){
		$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
		$(this).css('border', 'outset lightgrey 3px');
	});

	$('#passwordReg').blur(function(){
		$(this).css('box-shadow','none');
		$(this).css('border', 'solid lightgrey 1px');
	});

	$('#confirmPassReg').focus(function(){
		$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
		$(this).css('border', 'outset lightgrey 3px');
	});

	$('#confirmPassReg').blur(function(){
		$(this).css('box-shadow','none');
		$(this).css('border', 'solid lightgrey 1px');
	});

	$('#emailReg').focus(function(){
		$(this).css('box-shadow','2px 2px 15px 5px lightgrey');
		$(this).css('border', 'outset lightgrey 3px');
	});

	$('#emailReg').blur(function(){
		$(this).css('box-shadow','none');
		$(this).css('border', 'solid lightgrey 1px');
	});

	$('#submitBtn').on({

		mouseenter: function(){
			$(this).css('box-shadow','1px 1px 3px 2px lightgrey');
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
			$(this).css('box-shadow','1px 1px 3px 2px lightgrey');
			$(this).css('border','outset lightgrey 3px');
		}

	});


	$('#confirmBtn').on({
		mouseenter: function(){
			$(this).css('box-shadow','1px 1px 3px 2px lightgrey');
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
			$(this).css('box-shadow','1px 1px 3px 2px lightgrey');
			$(this).css('border','outset lightgrey 3px');
		}
	});

	$('#clearBtn').on({

		mouseenter: function(){
			$(this).css('box-shadow','1px 1px 3px 2px lightgrey');
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
			$(this).css('box-shadow','1px 1px 3px 2px lightgrey');
			$(this).css('border','outset lightgrey 3px');
		}

	});


	$('#backBtn').on({

		mouseenter: function(){
			$(this).css('box-shadow','1px 1px 3px 2px lightgrey');
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
			$(this).css('box-shadow','1px 1px 3px 2px lightgrey');
			$(this).css('border','outset lightgrey 3px');
		}

	});

	$('#backBtn').click(function(){
		$('#logButton').addClass("active");
		$('#regButton').removeClass("active");

		$("#loggingForm").animate({
			left: "450px",
			opacity: 1,
		});

		$('#loggingForm').css("zIndex",1);
		$('#loggingForm').css('box-shadow','10px 10px 32px 5px');
		$('#loggingForm').css('border','outset 3px darkgrey');

		$("#registrationForm").animate({
			left: "450px",
			opacity: 0.1,
		});

		$('#registrationForm').css("zIndex",0);
		$('#registrationForm').css('box-shadow','none');
		$('#registrationForm').css('border','solid 1px black');
	});

});