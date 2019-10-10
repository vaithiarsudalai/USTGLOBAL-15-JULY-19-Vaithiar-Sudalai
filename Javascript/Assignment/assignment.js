//Factorial
// Named Function

function factNumber(num)
{
    var fact=1;
    for(var i=1;i<=num;i++)
    {
         fact=fact*i;
    }
    return fact;
}
var getFact = factNumber(5);
console.log("Factorial = "+getFact);


//Function Expression

var facNumber = function(n)
{
    var fac=1;
    for(var i=1;i<=n;i++)
    {
         fac=fac*i;
    }
    return fac;
}
var  getFac = facNumber(5);
console.log("Factorial = "+getFac);

//IIFE

(function(nu){
    var fa=1;
    for(var i=1;i<=nu;i++)
    {
         fa=fa*i;
    }
    console.log("Factorial = "+fa);
}(5))


//Fat Arrow

var getFacto= (val1)=> {
    var f=1;
    for(var i=1;i<=val1;i++)
    {
         f=f*i;
    }
    return f;
}
var pro = getFacto(4);
console.log("Factorial = "+pro);



//Fibonacci Series

//Named Function

function fNumber(m)
{
    var a=1;
    var b=1;
    var fi=0;
    if(m===1)
    {
        console.log(a);
    }else
    if(m===2)
    {
        console.log(a);
        console.log(b);
    }else
    {
        console.log(a);
            console.log(b);
        for(i=3;i<=m;i++)
        {
            fi=a+b; 
            console.log(fi);
            a=b;
            b=fi;
        }
    }
    return fi;
}
var getFi = fNumber(5);
console.log("Fibonacci = "+getFi);



//Function Expression

var fibbNumber = function(number)
{
    var a=1;
    var b=1;
    var fib=0;
    if(number===1)
    {
        console.log(a);
    }else
    if(number===2)
    {
        console.log(a);
        console.log(b);
    }else
    {
        console.log(a);
            console.log(b);
        for(i=3;i<=number;i++)
        {
            fib=a+b; 
            console.log(fib);
            a=b;
            b=fib;
        }
    }
    return fib;
}
var  getFib = fibbNumber(5);
console.log("Fibonaci = "+getFib);


// IIFE

 (function(g){
    var a=1;
    var b=1;
    var fib=0;
    if(g===1)
    {
        console.log(a);
    }else
    if(g===2)
    {
        console.log(a);
        console.log(b);
    }else
    {
        console.log(a);
            console.log(b);
        for(i=3;i<=g;i++)
        {
            fib=a+b; 
            console.log(fib);
            a=b;
            b=fib;
        }
    }
     console.log("Fibonacci = "+fib);
 }(5))


// Fat Arrow

 var getFibonacci= (val6)=> {
    var a=1;
    var b=1;
    var fib=0;
    if(val6===1)
    {
        console.log(a);
    }else
    if(val6===2)
    {
        console.log(a);
        console.log(b);
    }else
    {
        console.log(a);
            console.log(b);
        for(i=3;i<=val6;i++)
        {
            fib=a+b; 
            console.log(fib);
            a=b;
            b=fib;
        }
    }
    return fib;
}
var p = getFibonacci(4);
console.log("Fibonacci = "+p);


// Circumference of a circle


//Named Function

function cirCirum(radius)
{
    var circle =2*3.14*radius;
    return circle;
}
var ciCir = cirCirum(5);
console.log("Circumference = "+ciCir);



//Function Expression 

var cirCu = function(radii)
{
    var circle =2*3.14*radii;
    return circle;
}
var  cCir = cirCu(5);
console.log("Circumference = "+cCir);






// IIFE

(function(rad){
    var cir =2*3.14*rad;
     console.log("Circumference = "+cir);
 }(5))




// Fat Arrow


 var circleCirumcumference= (val9)=> {
    var circle =2*3.14*val9;
    return circle;
}
var pro = circleCirumcumference(4);
console.log("Circumference = "+pro);




// Prime Number


// Named Function

function checkPrime(x)
{
    if(x===1)
    {
        return false;
    }
    else
    if(x===2){
        return true;
    }
    else{
        for(var i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
        }return true;
    }
}
var cPrime = checkPrime(37);
console.log("Is the given Number Prime? = "+cPrime);



// Function Expression 

var chPrime = function(pr)
{
    if(pr===1)
    {
        return false;
    }
    else
    if(pr===2){
        return true;
    }
    else{
        for(var i=2;i<=pr/2;i++){
            if(pr%i==0){
                return false;
            }
        }return true;
    }
}
var  chPri = chPrime(5);
console.log("Is the given Number Prime? = "+chPri);



// IIFE

(function(primeno){
    if(primeno===1)
    {
        console.log("Is the given Number Prime? = false");
    }
    else
    if(primeno===2){
        console.log("Is the given Number Prime? = true");
    }
    else{
        for(var i=2;i<=primeno/2;i++){
            if(primeno%i==0){
                console.log("Is the given Number Prime? = false");
            }
        }console.log("Is the given Number Prime? = true");
    }
 }(5))



//  Fat Arrow

 var checkingPrime= (val7)=> {
    if(val7===1)
    {
        return false;
    }
    else
    if(val7===2){
        return true;
    }
    else{
        for(var i=2;i<=val7/2;i++){
            if(val7%i==0){
                return false;
            }
        }return true;
    }
}
var primenumber = checkingPrime(4);
console.log("Is the given Number Prime? = "+primenumber);



//Array 

// Named Function 

function sumArray(b)
{
    var sumar=0;
    for(var i=0;i<b.length;i++)
    {
         if(isNaN(b[i])){
             continue;
         }
         sumar=sumar+b[i];
    }
    return sumar;
}
var a=[1,2,10,20];
var getSumo = sumArray(a);
console.log("Sum = "+getSumo);


// Function Expression

var addArray = function(c)
{
    var sumar=0;
    for(var i=0;i<c.length;i++)
    {
         if(isNaN(c[i])){
             continue;
         }
         sumar=sumar+c[i];
    }
    return sumar;
}
var d=[1,2,10,20];
var  getSummation = addArray(d);
console.log("Sum = "+getSummation);


// IIFE

(function(e){
    var sumar=0;
    for(var i=0;i<e.length;i++)
    {
         if(isNaN(e[i])){
             continue;
         }
         sumar=sumar+e[i];
    }
    console.log("Sum = "+sumar);
}([1,2,10,20]))


// Fat Arrow

var getSumma= (val8)=> {
    var sumar=0;
    for(var i=0;i<val8.length;i++)
    {
         if(isNaN(val8[i])){
             continue;
         }
         sumar=sumar+val8[i];
    }
    return sumar;  
}
var j= [1,2,10,20];
var arr = getSumma(j);
console.log("Sum = "+arr);

