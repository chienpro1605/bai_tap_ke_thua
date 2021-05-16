package point2dandpoint3d;

public class test2d3d {
    public static void main(String[] args) {
        Point2d point2d = new Point2d();
        System.out.println(point2d);

        point2d = new Point2d(7,8);
        System.out.println(point2d);

        Point3d point3d = new Point3d(5,5,8);
        System.out.println(point3d);

        point3d = new Point3d(1,2, 7);
        System.out.println(point3d);

        Point3d abc = new Point3d(1,2,4);
        System.out.println(abc);

    }
}
