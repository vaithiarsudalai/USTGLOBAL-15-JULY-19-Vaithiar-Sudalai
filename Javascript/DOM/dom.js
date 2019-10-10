 // getElementById()
let pElement = document.getElementById('demo');
console.log(pElement);
pElement.textContent='This is new p tag';

// getElementbyClass()
let divElements = document.getElementsByClassName('blue');
console.log(divElements);

// 
let pElements = document.getElementsByTagName('p');
console.log(pElements);
//getElementByName:-it will return node list
//querySelector:-pass classname,id,tag.it will return single element.
//querySelectorAll(class,id or tag name).it will return node list.
//createElement('button'):-it will create the element and it will return.

let nameElement = document.getElementsByName('helement');
console.log(nameElement);

let demoElement =document.querySelector('#demo');
console.log(demoElement);

let blueClassElements= document.querySelectorAll('.blue');
console.log(blueClassElements);

let buttonElement =document.createElement('button');
buttonElement.textContent ='Click Me';
console.log(buttonElement);
document.body.appendChild(buttonElement);


let spanElement = document.getElementById('spanid');
spanElement.style.color ='pink';

let buttonElement1 =document.getElementById('buttonEle');
buttonElement1.className='add add1';

document.getElementById('tableid').innerHTML = 
`<table border="1px">
    <tr>
        <td>Name</td>
        <td>Age</td>
        </tr>
        <tr>
        <td>Vignesh</td>
        <td>22</td>
        </tr>
        <tr>
        <td>Bruce</td>
        <td>39</td>
        </tr>
        <tr>
        <td>Clark</td>
        <td>34</td>
        </tr>
        </table>` ;

// let tablElement =document.createElement('table');
// let tr1 =document.createElement('tr');
// let td1 =document.createElement('td');
// td1.textContent='Name';
// let td2 =document.createElement('td');
// td2.textContent='Age';
// let tr2 =document.createElement('tr');
// let td3 =document.createElement('td');
// td3.textContent='John';
// let td4 =document.createElement('td');
// td4.textContent='14';
// let tr3 =document.createElement('tr');
// let td5 =document.createElement('td');
// td1.textContent='Dinga';
// let td6 =document.createElement('td');
// td2.textContent='20';
// let tr4 =document.createElement('tr');
// let td7 =document.createElement('td');
// td1.textContent='Sundari';
// let td8 =document.createElement('td');
// td2.textContent='22';


let pElementData=document.getElementById('demo1');
// pElementData.style.color='Blue';

// pElementData.className='blue';
pElementData.classList='blue fonts';
