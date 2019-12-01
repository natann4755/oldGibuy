function maill (){
    var msg = confirm ("do you wont send?")
    if (msg) {
        alert ("the meil send")
    }
    else   
     msg = prompt ("write yoer mail") 
       if (msg) {
           document.getElementById("mail").value = msg
       }
      else {
          alert ("go out")
      }
    }
     