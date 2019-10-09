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
