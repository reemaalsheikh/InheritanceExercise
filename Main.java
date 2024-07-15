//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Shape shape1 = new Shape();
        System.out.println("Shape 1:");
        System.out.println("Filled: "+shape1.isFilled());
        shape1.setFilled(true);
        System.out.println(shape1);
        System.out.println();



        Shape shape2 = new Shape("Red",false);
        System.out.println("Shape 2:");
        shape2.setFilled(true);
        System.out.println("Filled: "+shape1.isFilled());
        System.out.println(shape2);
        System.out.println();


        System.out.println("_____________");
        System.out.println();
        System.out.println("Circle:");


        Circle circle1 = new Circle();
        circle1.setRadius(7.5);
        circle1.setColor("Yellow");
        circle1.setFilled(true);
        System.out.println(circle1);
        System.out.println("Filled: "+circle1.isFilled());
        System.out.println("Area= "+ circle1.getArea());
        System.out.println("Perimeter= "+ circle1.getPerimeter());
        System.out.println();



        Circle circle2 = new Circle(1.0);
        circle2.setColor("White");
        circle2.setFilled(true);
        System.out.println(circle2);
        System.out.println("Area= "+ circle2.getArea());
        System.out.println("Perimeter= "+ circle2.getPerimeter());
        System.out.println();


        Circle circle3 = new Circle(5 ,"blue",true);
        circle3.setRadius(5.5);
        System.out.println(circle3);
        System.out.println("Area= "+ circle3.getArea());
        System.out.println("Perimeter= "+ circle3.getPerimeter());
        System.out.println();


        System.out.println("_____________");
        System.out.println();
        System.out.println("Rectangle:");

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(1.0);
        rectangle1.setWidth(4);
        rectangle1.setColor("green");
        rectangle1.setFilled(true);
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        System.out.println();



        Rectangle rectangle2 = new Rectangle(4.0 , 5.0);
        rectangle2.setColor("Purple");
        rectangle2.setFilled(false);
        System.out.println(rectangle2);
        System.out.println("Filled: "+rectangle2.isFilled());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println();



        Rectangle rectangle3 = new Rectangle("Yellow",false , 3.5,4.5);
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());
        System.out.println(rectangle3);
        System.out.println();

        System.out.println("_____________");
        System.out.println();
        System.out.println("Square:");

        Square square1 = new Square();
        System.out.println(square1);
        square1.setSide(2.0);
        System.out.println("Filled: "+square1.isFilled());
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
        System.out.println();

        Square square2 = new Square(3.0);
        System.out.println(square2);
        System.out.println("Area: " + square2.getArea());
        System.out.println("Perimeter: " + square2.getPerimeter());
        System.out.println();

        Square square3 = new Square("Gray",true,5.0);
        System.out.println(square3);
        System.out.println("Area: " + square3.getArea());
        System.out.println("Perimeter: " + square3.getPerimeter());







    }
}