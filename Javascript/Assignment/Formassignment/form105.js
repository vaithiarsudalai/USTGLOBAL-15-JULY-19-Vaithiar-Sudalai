function validate()
{
    let employeeData=document.forms['employeeForm'];
    let empPass=employeeData.pass.value;
    let empCPass=employeeData.cpass.value;
    if(empPass==='' && empCPass===''){
return false;
    }else
    if(empPass === empCPass){
        alert('Success');
        return true;
    }else{
        alert('Password not matching');
    return false;
    }
}