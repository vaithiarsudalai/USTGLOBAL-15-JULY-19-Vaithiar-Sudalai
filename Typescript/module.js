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
