// (function(){
    
//         var bike=new Object();
//     bike.name='Kawasaki Ninja';
//     bike.price=150000;
//     bike.cc=250;
//      console.log(bike);

//     var car=new Object();
//     car.name='Porche';
//     car.price=750000;
//     car.mph=75;
//     console.log(car);

//     var lead=new Object();
//     lead.name='Paul';
//     lead.id=15;
//     lead.hobby='Singing';
// console.log(lead);

//     var singer=new Object();
//     singer.name='Micheal Jackson';
//     singer.age=44;
// console.log(singer);

//     var cartoon=new Object();
//     cartoon.name='Shinchan';
//     cartoon.ry=1995;
// console.log(cartoon);
  
// }());

// (function(){
    
//     var bike=new Object();
// bike.name='Kawasaki Ninja';
// bike.price=150000;
// bike.cc=250;
//  console.log(bike);

// var car=new Object();
// car.name='Porche';
// car.price=750000;
// car.mph=75;
// console.log(car);

// var lead=new Object();
// lead.name='Paul';
// lead.id=15;
// lead.hobby='Singing';
// console.log(lead);

// var singer=new Object();
// singer.name='Micheal Jackson';
// singer.age=44;
// console.log(singer);

// var cartoon=new Object();
// cartoon.name='Shinchan';
// cartoon.ry=1995;
// console.log(cartoon);

// }());

function movie(name,bugdet)
{
    this.name=name;
    this.bugdet=bugdet;
}

var marvel=new movie('Averager',25000000);
var dc=new movie('Aquaman',28035000);
var paramount=new movie('Transformers',30000000);
var sony=new movie('Spiderman',35000000);
var columbia=new movie('Men in black',20000000);
var universal=new movie('Fast and Furious',35000000);

 console.log(marvel);
console.log(dc);
console.log(paramount);
console.log(columbia);
console.log(universal);

// console.log(content);
(function(){
    
    var bike = {
name:'Kawasaki Ninja',
price:150000,
cc:250
    }
 console.log(bike);

var car={
name:'Porche',
price:750000,
mph:75}
console.log(car);

var lead={
name:'Paul',
id:15,
hobby:'Singing'}
console.log(lead);

var singer={
name:'Micheal Jackson',
age:44 }
console.log(singer);

var cartoon={
name:'Shinchan',
ry:1995,
}
console.log(cartoon);

}());

// function person(name,age){
//     var person ={
// name: name,
// age: age
//     }

// }
// var person = person('Varun',22);
// console.log(person);


var bike= new Array('Ktm','Hornet','Royal Enfield');
    

    var cricketer= new Array('Sachin','Rahul','Virat');
    

    var car= new Array('Porche','Mercedes','Rolls Roys');
    

    var footballPlayers= new Array('Messi','Ronaldo','Neymar Jr','Miller');
    

    var nbaStars = new Array('LeBron','Shaq','McRoy');
    

    
    var month=['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dec'];
    var day=['Sun','Mon','Tue','Wed','Thu','Fri','Sat'];
    var tvSeries=['Game of Thones','Friends','Big Bang Theory','Lucifer','Stranger Things'];
    var classics=['The Usual Suspect','Hangover','Due Date','Daddys Home ','Home Alone'];
    var phone=['MI','one plus','Iphone','Samsung','Nokia','Oppo','Vivo'];




    for(var ind in bike)
{
console.log(bike[ind]);
}
for(var ind in cricketer)
{
console.log(cricketer[ind]);
}
for(var ind in car)
{
console.log(car[ind]);
}
for (var val of footballPlayers){
    console.log(val);
}
for (var val of nbaStars){
    console.log(val);
}
for (var val of day){
    console.log(val);
}
month.forEach((value,index) =>{
    console.log(value)
});
tvSeries.forEach((value,index) =>{
    console.log(value)
});
classics.forEach((value,index) =>{
    console.log(value)
});
for(var i=0;i<phone.length;i++){

    console.log(phone[i]);
}





