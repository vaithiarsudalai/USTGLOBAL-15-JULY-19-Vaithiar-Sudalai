var MathOperations;
(function (MathOperations) {
    var rectangle;
    (function (rectangle) {
        function area(length, breadth) {
            console.log('Area of Rectangle = ' + length * breadth);
        }
        rectangle.area = area;
        function perimeter(length, breadth) {
            console.log('Perimeter of Rectangle = ' + 2 * (length + breadth));
        }
        rectangle.perimeter = perimeter;
    })(rectangle = MathOperations.rectangle || (MathOperations.rectangle = {}));
})(MathOperations || (MathOperations = {}));
var MathOperations;
(function (MathOperations) {
    var pi = 3.14;
    var Circle;
    (function (Circle) {
        function circumferenceOfCircle(rad) {
            console.log("The circumference of the circle = " + 2 * pi * rad);
        }
        Circle.circumferenceOfCircle = circumferenceOfCircle;
        function areaOfCircle(rad) {
            console.log("The Area of the circle = " + rad * pi * rad);
        }
        Circle.areaOfCircle = areaOfCircle;
    })(Circle = MathOperations.Circle || (MathOperations.Circle = {}));
})(MathOperations || (MathOperations = {}));
/// <reference path="./module.ts" />
/// <reference path="./circle.ts" />
MathOperations.Circle.circumferenceOfCircle(23);
MathOperations.rectangle.area(5, 6);
