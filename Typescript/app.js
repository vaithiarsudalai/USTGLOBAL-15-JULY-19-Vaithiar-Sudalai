// let myName='Vignesh';
// let company;
// company='UST';
// company=123;
// console.log(company);
// console.log(myName);
// let sample: number|boolean;
// sample=23;
// sample=true;
// console.log(sample);
// let myArray:string[]=['kgf','ngk','true'];
// console.log(myArray);
// let myTuble:[string,number,boolean]=['',234,true];
// enum Colors {
//     red ='Danger',
//     green='Success',
//     blue='Primary',
//     black='Dark'
// }
// console.log(Colors.red);
// class Person{
// name:string;
// age:number;
// constructor(personName:string,personAge:number){
//         this.name=personName;
//         this.age=personAge;
// }
// }
//  let person= new Person('Viggy',22);
// console.log(person.name);
// class Person{
//     constructor(public personName:string,public personAge:number){  
//     }}
//  let person= new Person('Viggy',22);
//     console.log(person.personAge);
//     let myName='Vig';
//     myName=null;
// class Car{
// constructor(public brand:string,public model:string){
// }
// }
// let mer = new Car();
// console.log(mer.brand);
// console.log(Car.model);
// let merCar =new Car('Porche', 'CD021');
// console.log(merCar.brand);
// console.log(merCar.model);
// let bmwCar: Car={
//    brand:'BMW',
//    model:'x5'
// }
// class Person{
//    salary:number=24356;
//    constructor(public name:string, public age:number){
//    }
// }
// class Student extends Person{
// constructor(public myName:string,public myAge:number,public USN:number){
// super(myName,myAge);
// }
// }
// let person1 = new Person('Vignesh',22);
// let Student1 =new Student('Indhu',19,99999999);
// console.log(person1.salary);
// console.log(Student1.USN); 
// class Person{
//    constructor(public name:string,public age:number,public degree ?:string){}
// }
// let person1 : Person={
//    name: 'ssd',
// age: 43
// }
// let person2: Person{
//    name:'ssddf'
// }
// interface Student{
//    name1:string;
//    age:number;
//    printDetails(): void;
// }
// class Person implements Student{
//    name1='Vignesh';
//    age=23;
//    printDetails(){
//       console.log('name is '+this.name1+' age is '+this.age);
//    }
// }
// let person1 =new Person();
// person1.printDetails();
// let student1:Student={
//    name1:'xyz',
//    age:23,
//    printDetails: ()=>{
//       console.log('name is '+student1.name1+' age is '+student1.age)
//    }
// }
//  console.log(student1.printDetails());
//  function getArray<p>(item:p[]):p[]{
//     return new Array<p>().concat(item);
//  }
//  let strArray = getArray<string>(['','','']);
