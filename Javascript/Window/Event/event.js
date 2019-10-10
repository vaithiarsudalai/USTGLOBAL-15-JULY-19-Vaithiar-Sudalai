function sayHello(){
    alert('Hello !!!!');
}


let buttonElement=document.getElementById('clickbutton');
buttonElement.onclick=function(){
    alert("Hello World");
}

let buttonElement1=document.getElementById('clickbutton1');
buttonElement1.onclick=function(){
    let pElement22=document.createElement('p');
    pElement22.textContent='New Element';
    document.body.appendChild(pElement22);
    alert('Done!!');
}

let buttonElement2=document.getElementById('clickbutton2');
buttonElement2.addEventListener('click',function(){
    alert('Good Evening');
});
let pElement3=document.getElementById('alertHi');
pElement3.addEventListener('click',function(){
    alert('Bye');
});

let h1Element1=document.createElement('h1');
function showText(){
    let inputElement=document.getElementById('showData');
    console.log(inputElement.value);

h1Element1.textContent=inputElement.value;
document.body.appendChild(h1Element1);
}