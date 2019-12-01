function myinput_onChange(){
        alert(document.getElementById("myinput").value);
    }

    function sendMail(){
        var userCoich = confirm('are you shure?');
        if(userCoich){
            alert('maile sent');
        }
        else{
           userCoich = prompt("type new mail:", "");
           document.getElementById('myinput').value = userCoich;
        }
   }

   function display(){
       var min = document.getElementById('minimum').value * 1;
       var max = document.getElementById('maximum').value * 1;
       text = ""
       for ( ; min<=max;min++){
           text += min + "<br/>"
       }
     document.getElementById("dis").innerHTML = text;
   }
    
    
    