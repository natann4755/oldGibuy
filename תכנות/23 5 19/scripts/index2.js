function shoo () {
    var minimum = (document.getElementById("mm").value *1)
    var maximum = (document.getElementById("maxi").value *1)
    nambers = " "
    for ( ;minimum<=maximum ; minimum ++  ){
             nambers += minimum + "<br/>"  }
             document.getElementById("addd").innerHTML = nambers     
}