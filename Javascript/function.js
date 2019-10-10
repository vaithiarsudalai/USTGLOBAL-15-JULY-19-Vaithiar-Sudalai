var sumValue = getSum(10,20);

function getSum(num1,num2)
{
    var sum =num1+num2;
    return sum;
}
// var sumValue = getSum(10,20); both the ways are allowed
console.log(sumValue);


// var subValue1 = getSub(20,5);

var getSub = function(number1,number2)
{
    var sub  = number1-number2;
    return sub;
}
var subValue1 = getSub(20,5);
console.log(subValue1);


(function(val1,val2){
    var sum =val1+val2;
    console.log("Sum = "+sum);
}(10,20))

var getMul= (val3,val4)=> {
    var mulValue= val3*val4;
    return mulValue;
}
var pro = getMul(3,4);
console.log(pro);



console.log(name);
var name='Dean';


console.log(name1);
var name1='Kabir';
console.log(name1);

function fnname(){
    console.log(name3);
    var name3='John'; 
    console.log(name3);  
}
fnname();


// function fname()
// {
    // console.log('');
// }

function first(ca)
{
setTimeout(() =>{
    console.log("first");
    ca();
});
}
function second()
{
    console.log("second");
}

first(second);
// second();
