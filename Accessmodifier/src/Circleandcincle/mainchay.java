package Circleandcincle;

public class mainchay {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle.setRadius(5);
        System.out.println("Area circle :" + circle.getArea());

        circle = new Circle(5,"red");
        System.out.println(circle);

        Cylinder ABC = new Cylinder(5,"red",5);
        System.out.println(ABC);
        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 5);
        System.out.println("Total is: " + cylinder.getThetic());


    }
}
