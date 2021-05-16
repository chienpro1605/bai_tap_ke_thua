package Circleand;

public class Cylincle extends Circle{
    private double height;


    public Cylincle(double height) {
        this.height = height;
    }


    public Cylincle(double radius, String color, boolean filled, double height) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getThetic(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylincle{" +
                "height=" + height +
                '}'+ " , " + " the tich= " + getThetic();
    }
}
