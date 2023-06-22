let checked = document.getElementById("#checkbox")
let text = document.querySelector(".text")
//  function on() {
//     document.querySelector("body").style = "background-color: black";
//  }
 
function validate() {
    var checked = document.getElementById("checked");
    if (checked.checked) {
      alert("checked");
    } else {
      alert("You didn't check it! Let me check it for you.");
    }
  }