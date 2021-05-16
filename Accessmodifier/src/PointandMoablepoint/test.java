package PointandMoablepoint;

public class test {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        point = new Point(1,2);
        System.out.println(point);

        MoveablePoint ABC = new MoveablePoint();
        System.out.println(ABC);

        ABC = new MoveablePoint(1,2,3,4);
        System.out.println(ABC);
    }
}
