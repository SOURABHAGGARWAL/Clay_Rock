<script type="text/javascript">
var serverdate = new Date();
var montharray=new Array("January","February","March","April","May","June","July","August","September","October","November","December");

function padlength(paddable){
	var padded=(paddable.toString().length==1)? "0"+paddable : paddable;
	return padded;
}

function displaytime(){
	serverdate.setSeconds(serverdate.getSeconds()+1);
	var datestring=montharray[serverdate.getMonth()]+" "+padlength(serverdate.getDate())+", "+serverdate.getFullYear();
	document.getElementById("serverDate").innerHTML = datestring;
	var timestring=padlength(serverdate.getHours())+" : "+padlength(serverdate.getMinutes())+" : "+padlength(serverdate.getSeconds());
	document.getElementById("serverTime").innerHTML = timestring;
}

jQuery(window).load(function () {
	setInterval("displaytime()", 1000);
});
</script>
<style>
	.dateTimeDisplay{
	float:right; 
	color: white; 
	border-radius: 1em; 
	background-color: purple; 
	padding:5px 5px 5px 5px;
	}
</style>
<p class="dateTimeDisplay"><b><span id="serverDate"></span><br><span id="serverTime"></span></b></p>