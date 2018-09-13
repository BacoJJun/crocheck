/*
 * jQuery.fullscreen library v0.4.0
 * Copyright (c) 2013 Vladimir Zhuravlev
 *
 * @license https://github.com/private-face/jquery.fullscreen/blob/master/LICENSE
 *
 * Date: Wed Dec 11 22:45:17 ICT 2013
 **/
(function(e){function t(e){return e!==void 0}function n(t,n,l){var r=function(){};r.prototype=n.prototype,t.prototype=new r,t.prototype.constructor=t,n.prototype.constructor=n,t._super=n.prototype,l&&e.extend(t.prototype,l)}function l(e,n){var l;"string"==typeof e&&(n=e,e=document);for(var i=0;r.length>i;++i){n=n.replace(r[i][0],r[i][1]);for(var o=0;s.length>o;++o)if(l=s[o],l+=0===o?n:n.charAt(0).toUpperCase()+n.substr(1),t(e[l]))return e[l]}return void 0}var r=[["",""],["exit","cancel"],["screen","Screen"]],s=["","o","ms","moz","webkit","webkitCurrent"],i=navigator.userAgent,o=l("fullscreenEnabled"),u=-1!==i.indexOf("Android")&&-1!==i.indexOf("Chrome"),c=!u&&t(l("fullscreenElement"))&&(!t(o)||o===!0),_=e.fn.jquery.split("."),h=2>parseInt(_[0])&&7>parseInt(_[1]),f=function(){this.__options=null,this._fullScreenElement=null,this.__savedStyles={}};f.prototype={_DEFAULT_OPTIONS:{styles:{boxSizing:"border-box",MozBoxSizing:"border-box",WebkitBoxSizing:"border-box"},toggleClass:null},__documentOverflow:"",__htmlOverflow:"",_preventDocumentScroll:function(){this.__documentOverflow=e("body")[0].style.overflow,this.__htmlOverflow=e("html")[0].style.overflow,e("body, html").css("overflow","hidden")},_allowDocumentScroll:function(){e("body")[0].style.overflow=this.__documentOverflow,e("html")[0].style.overflow=this.__htmlOverflow},_fullScreenChange:function(){this.isFullScreen()?(this._preventDocumentScroll(),this._triggerEvents()):(this._allowDocumentScroll(),this._revertStyles(),this._triggerEvents(),this._fullScreenElement=null)},_fullScreenError:function(t){this._revertStyles(),this._fullScreenElement=null,t&&e(document).trigger("fscreenerror",[t])},_triggerEvents:function(){e(this._fullScreenElement).trigger(this.isFullScreen()?"fscreenopen":"fscreenclose"),e(document).trigger("fscreenchange",[this.isFullScreen(),this._fullScreenElement])},_saveAndApplyStyles:function(){var t=e(this._fullScreenElement);this.__savedStyles={};for(var n in this.__options.styles)this.__savedStyles[n]=this._fullScreenElement.style[n],this._fullScreenElement.style[n]=this.__options.styles[n];this.__options.toggleClass&&t.addClass(this.__options.toggleClass)},_revertStyles:function(){var t=e(this._fullScreenElement);for(var n in this.__options.styles)this._fullScreenElement.style[n]=this.__savedStyles[n];this.__options.toggleClass&&t.removeClass(this.__options.toggleClass)},open:function(t,n){t!==this._fullScreenElement&&(this.isFullScreen()&&this.exit(),this._fullScreenElement=t,this.__options=e.extend(!0,{},this._DEFAULT_OPTIONS,n),this._saveAndApplyStyles())},exit:null,isFullScreen:null,isNativelySupported:function(){return c}};var p=function(){p._super.constructor.apply(this,arguments),this.exit=e.proxy(l("exitFullscreen"),document),this._DEFAULT_OPTIONS=e.extend(!0,{},this._DEFAULT_OPTIONS,{styles:{width:"100%",height:"100%"}}),e(document).bind(this._prefixedString("fullscreenchange")+" MSFullscreenChange",e.proxy(this._fullScreenChange,this)).bind(this._prefixedString("fullscreenerror")+" MSFullscreenError",e.proxy(this._fullScreenError,this))};n(p,f,{VENDOR_PREFIXES:["","o","moz","webkit"],_prefixedString:function(t){return e.map(this.VENDOR_PREFIXES,function(e){return e+t}).join(" ")},open:function(e){p._super.open.apply(this,arguments);var t=l(e,"requestFullscreen");t.call(e)},exit:e.noop,isFullScreen:function(){return null!==l("fullscreenElement")},element:function(){return l("fullscreenElement")}});var a=function(){a._super.constructor.apply(this,arguments),this._DEFAULT_OPTIONS=e.extend({},this._DEFAULT_OPTIONS,{styles:{position:"fixed",zIndex:"2147483647",left:0,top:0,bottom:0,right:0}}),this.__delegateKeydownHandler()};n(a,f,{__isFullScreen:!1,__delegateKeydownHandler:function(){var t=e(document);t.delegate("*","keydown.fullscreen",e.proxy(this.__keydownHandler,this));var n=h?t.data("events"):e._data(document).events,l=n.keydown;h?n.live.unshift(n.live.pop()):l.splice(0,0,l.splice(l.delegateCount-1,1)[0])},__keydownHandler:function(e){return this.isFullScreen()&&27===e.which?(this.exit(),!1):!0},_revertStyles:function(){a._super._revertStyles.apply(this,arguments),this._fullScreenElement.offsetHeight},open:function(){a._super.open.apply(this,arguments),this.__isFullScreen=!0,this._fullScreenChange()},exit:function(){this.__isFullScreen=!1,this._fullScreenChange()},isFullScreen:function(){return this.__isFullScreen},element:function(){return this.__isFullScreen?this._fullScreenElement:null}}),e.fullscreen=c?new p:new a,e.fn.fullscreen=function(t){var n=this[0];return t=e.extend({toggleClass:null,overflow:"hidden"},t),t.styles={overflow:t.overflow},delete t.overflow,n&&e.fullscreen.open(n,t),this}})(jQuery);

$(function() {
	// open in fullscreen
	$('#requestfullscreen').click(function() {
		console.log("fullscreen?");
		$('#fullscreen').fullscreen();
		return false;
	});
	// exit fullscreen
	$('#exitfullscreen').click(function() {
		$.fullscreen.exit();
		return false;
	});
	// open in fullscreen
	$('#requestfullscreen_top').click(function() {
		console.log("fullscreen?");
		$('#fullscreen').fullscreen();
		return false;
	});
	// exit fullscreen
	$('#exitfullscreen_top').click(function() {
		$.fullscreen.exit();
		return false;
	});
	// document's event
	$(document).bind('fscreenchange', function(e, state, elem) {
		// if we currently in fullscreen mode
		if ($.fullscreen.isFullScreen()) {
			$('#fullscreen .requestfullscreen').hide();
			$('#fullscreen .exitfullscreen').show();
		} else {
			$('#fullscreen .requestfullscreen').show();
			$('#fullscreen .exitfullscreen').hide();
		}
		$('#state').text($.fullscreen.isFullScreen() ? '' : 'not');
	});
});