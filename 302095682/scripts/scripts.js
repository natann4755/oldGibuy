function mail() {
 alert ("yore mail send")
}
function neu_list(){
    document.getElementById("list").style.visibility = "hidden"
    pris=document.getElementById("pris").value
    ne_list = ""
    namee = ["corola","camery","prius"];
    prise = [80000,100000,90000];
    infor = ["beisik kar","maneg kar","hibrib kar"];
    for (i=0;i<prise.length; i++){
        if (pris>= prise[i])
        ne_list+=  namee[i] + " " + prise[i] +" " + infor[i] + "<br/>"
    }
    document.getElementById("new").innerHTML =   ne_list
} 


