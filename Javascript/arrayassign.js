var bike= ['Ktm','Hornet','Royal Enfield','Yamaha','Honda City'];
var cars= ['BMW','Mercedes','Audi','Jaguar','MG Vector'];
var laptop =[{
    name: 'Dell',
    price: 27000,
},
{
    name:'Hp',
    price: 30000
},
{
    name:'Lenovo',
    price: 35000
},
{
    name: 'Asus',
    price:32000
}
]
var Employee =[{
    name: 'Robert',
    EID: 3000,
},
{
    name:'Chris',
    EID: 2614
},
{
    name:'Mark',
    EID: 4561
},
{
    name: 'Jeremy',
    EID: 5624
}
]

cars.forEach((value,index) =>{
    console.log('Cars ='+value)
});

bike.forEach((value,index) =>{
    console.log('bike ='+value)
});

    console.log(Array.isArray(cars));
    console.log(Array.isArray(bike));
    console.log(Array.isArray(laptop));
    console.log(Array.isArray(Employee));

cars.push('Volkswagon','Nano');
console.log(cars);

cars.pop();
console.log(cars);

bike.push('Pulsar','Activa');
console.log(bike);

bike.pop();
console.log(bike);


cars.unshift('Skoda','Suzuki');
console.log(cars);

bike.unshift('Unicorn','Ignaitor');
console.log(bike);

bike.shift();
console.log(bike);

cars.shift();
console.log(cars);
 
console.log(cars.includes('Mercedes',0));
console.log(bike.includes('Yamaha',0));


cars.splice(2,1,'Rolls Roy');
console.log(cars);

bike.splice(2,1,'Kawasaki');
console.log(bike);


var ca=cars.slice(0,3);
console.log(ca);

var bi=cars.slice(1,3);
console.log(bi);



var c=cars.join('-');
console.log(c);

var e=bike.join('-');
console.log(e);

var f=bike.indexOf('Royal Enfield');
console.log(f);


var r=cars.indexOf('MG Vector');
console.log(r);

var number = [80,330,140,90];
var newNumber = number.map((val,ind)=>{
    val=val-50;
    return val;
});


console.log("Old Array = "+number);

console.log("New Array = "+newNumber);


var num = [180,40,70,200];
var newNum = num.map((val,ind)=>{
    val=val/10;
    return val;
});

console.log("Old Array = "+num);

console.log("New Array = "+newNum);



var fil=newNumber.filter((val,ind)=>{
    return val<50;
});
console.log(fil);

var fill=newNum.filter((val,ind)=>{
    return val>10;
});
console.log(fill);

var newLaptop = laptop.map((ind=>{
    ind.price=ind.price + 1000;
    return ind;
}));
console.log(newLaptop);

var Employees=Employee.filter(ind=>{
    return ind.EID=2700 && ind.name.length>4;    
});
console.log(Employees);
