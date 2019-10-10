var cars=['Audi','Porche','MGVector','BMW'];
console.log(cars);


var todayDate=new Date();
console.log('Todays Date = '+todayDate);
var tDate= new Date(1);
console.log('Date ='+tDate);
var date= new Date("January 22,1997 06:35:54");
console.log(date);
var ate= new Date( 1997,0,22, 06,35,56,0);
console.log(ate);



var month=['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'];
var day=['Sun','Mon','Tue','Wed','Thu','Fri','Sat'];
console.log(month[todayDate.getMonth()]);
console.log(day[todayDate.getDay()]);



console.log(Math.ceil(4.4));
console.log(Math.random());
console.log(Math.floor(4.8));
console.log(Math.round(4.8));
console.log(Math.pow(3,4));
console.log(Math.round(Math.random()*10));



var name='Rahul';
console.log(name);
var name1 = name;
console.log(name1);
name1='Gandhi';
console.log(name);
console.log(name1);




var people ={
    name: 'Paul'
};

console.log(people.name);
var people1 = people;
console.log(people1.name);
people1.name='Tom';
console.log(people.name);
console.log(people1.name);



var num1=10;
var name='MyName';
var num2='10';
if(num1==num2){
console.log("Equal");
}else{
    console.log("Not Equal");
}

var num1=10;
var name='MyName';
var num2='10';
if(num1===num2){
console.log("Equal");
}else{
    console.log("Not Equal");
}

var num3=30;
var equals= (num1===num3)?'true':'false';
console.log(equals);



var compare=(num1>10)?'Greater':(num1<10)?'Lesser':'Equal';
console.log(compare);


var myAge=50;
console.log("Type of myAge = "+typeof myAge);
var yourName='Ben';
console.log("Type of yourName = "+typeof yourName);
var hobbies=['singing','coding','cricket'];
console.log("Type of hobbies = "+typeof hobbies);
var what=Array.isArray(hobbies);
console.log(what);
console.log(Array.isArray(hobbies));

var library=[
    {author:'Bill Gates',title:'The Road Ahead',bookId:1245},
    {author:'Steve Jobs',title:'Walter Isaacson',bookId:4264},
    {author:'Suzanne Collins',title:'Mockingjay:The Final Book of Hunger Games',bookId:3254}
];
for(var i=0; i<library.length;i++)
{
console.log(library[i]);
console.log(library[i].author);
}
console.log('------------------------');
for (var index in hobbies) {
    console.log("Hobbies = "+hobbies[index]);
}
console.log('------------------------');
 
var people2 = {
     name:'Don',
     age:35
 }
for(var ind in people2)
{
console.log(people2[ind]);
}
console.log('------------------------');
for (var val of hobbies){
    console.log("Hobbies ="+val);
}
 for(var i=0;i<hobbies.length;i++){
     //break;
     console.log(hobbies[i]);
 }

 hobbies[4]= 'skating';
 hobbies['name']= 'jumping';

 console.log('------------------------');
for (var r of hobbies)
{
    console.log('Hobbies = '+r);
}

console.log('------------------------');
for (var s in hobbies){
    console.log('Hobbies = '+hobbies[s]);
}
console.log('------------------------');
console.log(hobbies);
