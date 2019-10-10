function validateForm2()
{
   let formData2=document.forms[0];
    let firstName2 = formData2.finame.value;
    let lastName2 = formData2.laname.value;
    let zipId= formData2.zip.value;
    if(firstName2.length>4 && lastName2.length>4 && zipId>99999 && zipId<1000000)
    {
        formData2.finame.style.border='1px solid green';
        formData2.laname.style.border='1px solid green';
        formData2.zip.style.border='1px solid green';
        formData2.logSubmit.disabled=false;
    }else
    {
        formData2.finame.style.border='4px solid red';
        formData2.laname.style.border='4px solid red';
        formData2.zip.style.border='4px solid red';
        formData2.logSubmit.disabled=true;

    }
}
