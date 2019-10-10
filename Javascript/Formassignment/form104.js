function validateForm10(){
    let fomData106=document.forms[0];
    let userName=fomData106.uname.value;
    let passWord=fomData106.pass.value;
    if(userName==='' && passWord==='')
    {
        document.getElementById('err1').innerHTML=`
        <p id="p1" style="color:red">Invalid input</p>
        `;
        document.getElementById('err2').innerHTML=`
        <p id="p2" style="color:red">Invalid input</p>
        `;
        
        fomData106.logSubmit.disabled=true;
    }else
    if(userName.length>4 && passWord.length>4)
    {
        var parent = document.getElementById("err1");
var child = document.getElementById("p1");
parent.removeChild(child);
var parent = document.getElementById("err2");
var child = document.getElementById("p2");
parent.removeChild(child);
        fomData106.logSubmit.disabled=false;
}else{
    document.getElementById('err1').innerHTML=`
    <p id="p1" style="color:red">Invalid input</p>
    `;

    document.getElementById('err2').innerHTML=`
        <p id="p2" style="color:red">Invalid input</p>
        `;
        
        fomData106.logSubmit.disabled=true;
}}

function showPass(){
    
}