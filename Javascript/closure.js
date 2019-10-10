function sum(a,b){
    function addSum(){
        return a+b;
    }
    return addSum
}

var addFunc = sum(10,20);
var total = addFunc();
console.log('Total',total);

console.log('=================================');
console.log(window);
console.log(this);
console.log(this===window);

var name='Vignesh';
console.log(window.name);
console.log(this.name);


var person =
{
    name :'Prithvi Raj',
    age:39,
    getName: function(){
        console.log('Get data Method'+this);
        console.log(window);
        getData();
        function getData(){
        console.log('Get data Method'+this);  //Window object
        }
        return this.name;
    }
}

var actorName =person.getName();
console.log('Name = '+actorName);

console.log('==============================================');
// for(var i=0; i<5;i++)
// {
//     console.log(i);
// }
// console.log('Value of i '+i);


// for(let j=0; j<5;j++)
// {
//     console.log(j);
// }
// console.log('Value of j '+j);

var hobbies=['dancing','singing','cricket'];
console.log('hobbies '+hobbies);
var hobbies=['numismatics'];
console.log('Hobbies '+hobbies);
hobbies=['Painting'];
console.log('hobbies '+hobbies);

console.log('===========================================');

let fruits=['Orange','Banana'];
console.log('Fruits = '+fruits);
 fruits=['Jackfruit'];
console.log('Fruits ='+fruits);

console.log('===============================');

const items=['Deo','Hair Wax','Book'];
console.log('Items ='+items);
items[0]=['bag','pen'];
console.log(items);


