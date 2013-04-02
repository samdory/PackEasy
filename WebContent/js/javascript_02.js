/***********************************************************************************************************************
 DOCUMENT: includes/javascript.js
 DEVELOPED BY: Ryan Stemkoski
 COMPANY: Zipline Interactive
 EMAIL: ryan@gozipline.com
 PHONE: 509-321-2849
 DATE: 3/26/2009
 UPDATED: 3/25/2010
 DESCRIPTION: This is the JavaScript required to create the accordion style menu.  Requires jQuery library
 NOTE: Because of a bug in jQuery with IE8 we had to add an IE stylesheet hack to get the system to work in all browsers. I hate hacks but had no choice :(.
 ************************************************************************************************************************/
$(document).ready(function() {

	//ACCORDION BUTTON ACTION (ON CLICK DO THE FOLLOWING)

	$('.mytrip_accordion_01').click(function() {

		//REMOVE THE ON CLASS FROM ALL BUTTONS
		$('.mytrip_accordion_01').removeClass('on');

		//NO MATTER WHAT WE CLOSE ALL OPEN SLIDES
		$('.mytrip_content_01').slideUp('normal');

		//IF THE NEXT SLIDE WASN'T OPEN THEN OPEN IT
		if ($(this).next().is(':hidden') == true) {

			//ADD THE ON CLASS TO THE BUTTON
			$(this).addClass('on');
			
			//OPEN THE SLIDE
			$(this).next().slideDown('normal');
		}
	});
	$('.mytrip_accordion_02').click(function() {

		//REMOVE THE ON CLASS FROM ALL BUTTONS
		$('.mytrip_accordion_02').removeClass('on');

		//NO MATTER WHAT WE CLOSE ALL OPEN SLIDES
		$('.mytrip_content_02').slideUp('normal');

		//IF THE NEXT SLIDE WASN'T OPEN THEN OPEN IT
		if ($(this).next().is(':hidden') == true) {

			//ADD THE ON CLASS TO THE BUTTON
			$(this).addClass('on');
			
			//OPEN THE SLIDE
			$(this).next().slideDown('normal');
		}
	});
	$('.mytrip_accordion_03').click(function() {

		//REMOVE THE ON CLASS FROM ALL BUTTONS
		$('.mytrip_accordion_03').removeClass('on');

		//NO MATTER WHAT WE CLOSE ALL OPEN SLIDES
		$('.mytrip_content_03').slideUp('normal');

		//IF THE NEXT SLIDE WASN'T OPEN THEN OPEN IT
		if ($(this).next().is(':hidden') == true) {

			//ADD THE ON CLASS TO THE BUTTON
			$(this).addClass('on');
			
			//OPEN THE SLIDE
			$(this).next().slideDown('normal');
		}
	});
	$('.mytrip_accordion_04').click(function() {

		//REMOVE THE ON CLASS FROM ALL BUTTONS
		$('.mytrip_accordion_04').removeClass('on');

		//NO MATTER WHAT WE CLOSE ALL OPEN SLIDES
		$('.mytrip_content_04').slideUp('normal');

		//IF THE NEXT SLIDE WASN'T OPEN THEN OPEN IT
		if ($(this).next().is(':hidden') == true) {

			//ADD THE ON CLASS TO THE BUTTON
			$(this).addClass('on');
			
			//OPEN THE SLIDE
			$(this).next().slideDown('normal');
		}
	});
	$('.mytrip_accordion_05').click(function() {

		//REMOVE THE ON CLASS FROM ALL BUTTONS
		$('.mytrip_accordion_05').removeClass('on');

		//NO MATTER WHAT WE CLOSE ALL OPEN SLIDES
		$('.mytrip_content_05').slideUp('normal');

		//IF THE NEXT SLIDE WASN'T OPEN THEN OPEN IT
		if ($(this).next().is(':hidden') == true) {

			//ADD THE ON CLASS TO THE BUTTON
			$(this).addClass('on');
			
			//OPEN THE SLIDE
			$(this).next().slideDown('normal');
		}
	});
	$('.mytrip_accordion_06').click(function() {

		//REMOVE THE ON CLASS FROM ALL BUTTONS
		$('.mytrip_accordion_06').removeClass('on');

		//NO MATTER WHAT WE CLOSE ALL OPEN SLIDES
		$('.mytrip_content_06').slideUp('normal');

		//IF THE NEXT SLIDE WASN'T OPEN THEN OPEN IT
		if ($(this).next().is(':hidden') == true) {

			//ADD THE ON CLASS TO THE BUTTON
			$(this).addClass('on');
			
			//OPEN THE SLIDE
			$(this).next().slideDown('normal');
		}
	});
	$('.mytrip_accordion_07').click(function() {

		//REMOVE THE ON CLASS FROM ALL BUTTONS
		$('.mytrip_accordion_07').removeClass('on');

		//NO MATTER WHAT WE CLOSE ALL OPEN SLIDES
		$('.mytrip_content_07').slideUp('normal');

		//IF THE NEXT SLIDE WASN'T OPEN THEN OPEN IT
		if ($(this).next().is(':hidden') == true) {

			//ADD THE ON CLASS TO THE BUTTON
			$(this).addClass('on');
			
			//OPEN THE SLIDE
			$(this).next().slideDown('normal');
		}
	});
	$('.mytrip_accordion_08').click(function() {

		//REMOVE THE ON CLASS FROM ALL BUTTONS
		$('.mytrip_accordion_08').removeClass('on');

		//NO MATTER WHAT WE CLOSE ALL OPEN SLIDES
		$('.mytrip_content_08').slideUp('normal');

		//IF THE NEXT SLIDE WASN'T OPEN THEN OPEN IT
		if ($(this).next().is(':hidden') == true) {

			//ADD THE ON CLASS TO THE BUTTON
			$(this).addClass('on');
			
			//OPEN THE SLIDE
			$(this).next().slideDown('normal');
		}
	});

	/*** REMOVE IF MOUSEOVER IS NOT REQUIRED ***/

	//ADDS THE .OVER CLASS FROM THE STYLESHEET ON MOUSEOVER
	$('.mytrip_accordion_01').mouseover(function() {
		$(this).addClass('over');

		//ON MOUSEOUT REMOVE THE OVER CLASS
	}).mouseout(function() {
		$(this).removeClass('over');
	});
	$('.mytrip_accordion_02').mouseover(function() {
		$(this).addClass('over');

		//ON MOUSEOUT REMOVE THE OVER CLASS
	}).mouseout(function() {
		$(this).removeClass('over');
	});
	$('.mytrip_accordion_03').mouseover(function() {
		$(this).addClass('over');

		//ON MOUSEOUT REMOVE THE OVER CLASS
	}).mouseout(function() {
		$(this).removeClass('over');
	});
	$('.mytrip_accordion_04').mouseover(function() {
		$(this).addClass('over');

		//ON MOUSEOUT REMOVE THE OVER CLASS
	}).mouseout(function() {
		$(this).removeClass('over');
	});
	$('.mytrip_accordion_05').mouseover(function() {
		$(this).addClass('over');

		//ON MOUSEOUT REMOVE THE OVER CLASS
	}).mouseout(function() {
		$(this).removeClass('over');
	});
	$('.mytrip_accordion_06').mouseover(function() {
		$(this).addClass('over');

		//ON MOUSEOUT REMOVE THE OVER CLASS
	}).mouseout(function() {
		$(this).removeClass('over');
	});
	$('.mytrip_accordion_07').mouseover(function() {
		$(this).addClass('over');

		//ON MOUSEOUT REMOVE THE OVER CLASS
	}).mouseout(function() {
		$(this).removeClass('over');
	});
	$('.mytrip_accordion_08').mouseover(function() {
		$(this).addClass('over');

		//ON MOUSEOUT REMOVE THE OVER CLASS
	}).mouseout(function() {
		$(this).removeClass('over');
	});
	/*** END REMOVE IF MOUSEOVER IS NOT REQUIRED ***/

	/********************************************************************************************************************
	 CLOSES ALL S ON PAGE LOAD
	 ********************************************************************************************************************/
	// $('.accordionContent').hide();
	$('.mytrip_content_01').show();$('.mytrip_content_02').show();$('.mytrip_content_03').show();
	$('.mytrip_content_04').show();$('.mytrip_content_05').show();$('.mytrip_content_06').show();
	$('.mytrip_content_07').show();$('.mytrip_content_08').show();
});
