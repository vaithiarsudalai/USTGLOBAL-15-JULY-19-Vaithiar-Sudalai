namespace MathOperations{
    const pi=3.14;
   export namespace Circle{
    export function circumferenceOfCircle(rad:number){
        console.log("The circumference of the circle = "+2*pi*rad);
    }
    export function areaOfCircle(rad:number){
        console.log("The Area of the circle = "+rad*pi*rad);
    }
}}