import java.util.List;
import java.util.Objects;

public class Point {
    private double x;
    private double y;
    private double z;

    public Point() {
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Math.abs(point.getX()-this.x) < 0.0001 && Math.abs(point.getY() - this.y) < 0.0001 && Math.abs(point.getZ()- this.z) < 0.0001;
    }


    public double rangeTo (PlaneEquation planeEquation){
        double d = Math.sqrt(planeEquation.getA()* planeEquation.getA()+planeEquation.getB()* planeEquation.getB()+planeEquation.getC()* planeEquation.getC());
        return Math.abs(this.x*planeEquation.getA()+ this.y* planeEquation.getB()+ this.z* planeEquation.getC()+ planeEquation.getD())/d;
    }


}
