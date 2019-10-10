var hobbies =['singing','coding','dancing','skipping','jumping'];
hobbies.forEach(function(value,index){
    console.log('hobbies ='+value)
});

console.log('-----------------------');
hobbies.forEach((value,index) =>{
    console.log('hobbies ='+value)
});

console.log('-----------------------');
hobbies.push('bike','travel');
console.log(hobbies);

console.log('-----------------------');
hobbies.pop();
console.log(hobbies);

console.log('-----------------------');
hobbies.unshift('Gaming','Farming');
console.log(hobbies);

console.log('-----------------------');
hobbies.shift();
console.log(hobbies);

console.log('-----------------------');
var a= hobbies.includes('coding',0);
console.log(a);

console.log('-----------------------');
hobbies.splice(2,1,'collecting','running');
console.log(hobbies);

console.log('-----------------------');
var hobbs=hobbies.slice(0,3);
console.log(hobbs);

console.log('-----------------------');
var hob=hobbies.join('-');
console.log(hob);

console.log('-----------------------');
var d=hobbies.indexOf('collecting');
console.log(d);

console.log('-----------------------');
var r=hobbies.indexOf('Gaming');
console.log(r);

console.log('-----------------------');
var number = [10,30,40,60];
var newNumber = number.map((val,ind)=>{
    val=val+10;
    return val;
});
console.log("Old Array = "+number);
console.log('-----------------------');
console.log("New Array = "+newNumber);

console.log('-----------------------');
var fil=number.filter((val,ind)=>{
    return val>30;
});
console.log(fil);

var items =[{
             item:'pen',
             price:50},
             {
                item:'bag',
                price:500},
                {
                    item:'laptop',
                    price:50000},
                    {
                        item:'mouse',
                        price:500},
            ]

            var newItems = items.map((ind=>{
                ind.price=ind.price + 10;
                return ind;
            }));
            console.log(newItems);

            var newIte=items.filter(ind=>{
                return ind.price>500 && ind.item.length>3;    
            });
            console.log(newIte);

