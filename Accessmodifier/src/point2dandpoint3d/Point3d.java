package point2dandpoint3d;

public class Point3d extends Point2d {
    private float z = 0;

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr1 = {this.getX(), this.getY(), this.getZ()};
        return arr1;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + getX() +
                ", y=" + getY() +
                " " + "{" + getXYZ()[0] + "," + getXYZ()[1] + getXYZ()[2] +
                '}';
    }
}
