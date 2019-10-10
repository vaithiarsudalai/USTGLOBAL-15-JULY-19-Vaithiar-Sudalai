let employeeJSON={
    name:'Ricky',
    age:34,
    hobbies:['dancing','singing']
}
console.log(`My name is ${employeeJSON.name}`); //String interpolation
console.log(employeeJSON);
let jsonObject=JSON.stringify(employeeJSON);
console.log(jsonObject);
let jsObject=JSON.parse(jsonObject);
console.log(jsObject);