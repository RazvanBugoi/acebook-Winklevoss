function openTab(event, tabName) {
  // Declare all variables
  var i, tabcontent, tablinks;

  // Get all elements with class="tabcontent" and hide them
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }

  // Get all elements with class="tablinks" and remove the class "active"
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace("active", "");
  }

  // Show the current tab, and add an "active" class to the button that opened the tab
  document.getElementById(tabName).style.display = "block";
  event.currentTarget.className += "active";
}

// Below 2 are for getting friends of friends to work...
function deleteNoMutualDiv(divId, mutualCount) {
  if (mutualCount == 0) {
    var div = document.getElementById(divId);
    div.parentElement.remove();
  }
}

function cleanFriendsOfFriends() {
  var div = document.getElementById("0");
  var p1 = document.getElementById("P1")
  if (div.innerHTML.trim().length <= 41) {
    p1.textContent = "No recommendations.";
    div.remove();
  }
}
