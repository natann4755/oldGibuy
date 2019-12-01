  
    
    
    
    
    function edit()  {   
        if (my_input.value=="edit")   
            {my_input.value="save"
            a()
              }
           
    else { 
        my_input.value="edit"
        b ()      
       }
     }

     function a() { 
     document.getElementById("name1").style.visibility = "hidden";
     document.getElementById("pozishen1").style.visibility = "hidden";
     document.getElementById("More_details1").style.visibility = "hidden"
     document.getElementById("name2").style.visibility = "visible";
     document.getElementById("pozishen2").style.visibility = "visible";
     document.getElementById("More_details2").style.visibility = "visible";
     document.getElementById("name2").value = document.getElementById("name1").innerHTML;
     document.getElementById("pozishen2").value =  document.getElementById("pozishen1").innerHTML;
     document.getElementById("More_details2").value = document.getElementById("More_details1").innerHTML
}

    function b() {
        document.getElementById("name2").style.visibility = "hidden";
        document.getElementById("pozishen2").style.visibility = "hidden";
        document.getElementById("More_details2").style.visibility = "hidden"
        document.getElementById("name1").style.visibility = "visible";
        document.getElementById("pozishen1").style.visibility = "visible";
        document.getElementById("More_details1").style.visibility = "visible";
        document.getElementById("name1").innerHTML = document.getElementById("name2").value;
        document.getElementById("pozishen1").innerHTML =  document.getElementById("pozishen2").value;
        document.getElementById("More_details1").innerHTML = document.getElementById("More_details2").value


}






    
  