var string1 = 'Constructor';
var string2 = 'Redemption';

console.log(string1.toLowerCase());
console.log(string2.toLowerCase());


console.log('--------------------------------');
console.log(string1.toUpperCase());
console.log(string2.toUpperCase());

console.log('--------------------------------');
console.log(string1.charAt(4));
console.log(string2.charAt(5));

console.log('--------------------------------');
console.log(string1.indexOf('n',0));
console.log(string2.indexOf('e',0));
console.log(string1.indexOf('e',2));
console.log(string2.indexOf('o',2));

console.log('--------------------------------');
console.log(string1.concat(' Parameterized '));
console.log(string2.concat(' At ',' Best'));

console.log('--------------------------------');
console.log(string1.includes('n',1));
console.log(string2.includes('m',2));

console.log('--------------------------------');
console.log(string1.replace('o','i'));
console.log(string2.replace('e','a'));

console.log('--------------------------------');
var b=string1.split('s',4);
var a=string2.split('m',5);
console.log(b);
console.log(a);

console.log('--------------------------------');
console.log(string1.substr(3,3));
console.log(string2.substr(4,2));

console.log('--------------------------------');
console.log(string1.search('s'));
console.log(string1.search('m'));

console.log('--------------------------------');
var value15= 'Shine      '
console.log(value15.trim());
var value13='    Value';
console.log(value13.trim());