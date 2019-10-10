function validateForm1()
{
   let formData1=document.forms[0];
    let firstName = formData1.fname.value;
    let lastName = formData1.lname.value;
    let eId= formData1.empid.value;
    let cName=formData1.cname.value;
    let mRadio=formData1.male.value;
    let fRadio=formData1.female.value;
    let oRadio=formData1.other.value;

    if(firstName!==''&& lastName!=='' && cName!==''){
        formData1.fname.style.border='4px solid red';
        formData1.lname.style.border='4px solid red';
        
        formData1.loginInSubmit.disabled=true;   
    }
    if((firstName.length>4 && lastName.length>4 && eId>999 && eId<10000) && (mRadio.checked===false || fRadio.checked===false || oRadio.checked===false)) 
    {
        formData1.fname.style.border='1px solid green';
        formData1.lname.style.border='1px solid green';
        formData1.empid.style.border='1px solid green';
        formData1.loginInSubmit.disabled=false;
 
    }else
    {
        formData1.fname.style.border='4px solid red';
        formData1.lname.style.border='4px solid red';
        formData1.empid.style.border='4px solid red';
        formData1.loginInSubmit.disabled=true;

    }


}