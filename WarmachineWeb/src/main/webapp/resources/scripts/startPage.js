
	
$(document).ready(function() {
	$('input[value="LOAD_LIST"]').click(
		function() {
			loadArmies();
		}
	);
});

function loadArmies() {
    // fire off the request to /form.php
    $.ajax({
        url: "http://localhost:8080/warmachine/armyService/getAllArmyLists",
        dataType: "html",
        success: function(response, textStatus, jqXHR){
            $("#armyList").html(response);
        }
    });
}
