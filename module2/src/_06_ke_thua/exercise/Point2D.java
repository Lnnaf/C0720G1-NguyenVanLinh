package _06_ke_thua.exercise;


import java.util.Arrays;

public class Point2D {
    float []array;
    float x=2.0f, y=2.0f;
    Point2D(){
    }
    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y= y;
    }
    public float[] getXY(){
        array = new float[2];
        array[0]=x;
        array[1]=y;
        return array;
    }

    @Override
    public String toString() {
        return "Point2D " + "XY=" + Arrays.toString(array) + ", x=" + x + ", y=" + y;
    }
}
class Point3D extends Point2D{
    float z = 0.0f;
    public Point3D() {
    }
    public Point3D(float z){
        super.getX();
        super.getY();
        this.z =z;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    void setXYZ(float x, float y, float z){
       this.x= x;
       this.y = y;
        this.z =z;
    }
    float[]getXYZ(){
        array = new float[3];
        array[0]=x;
        array[1]=y;
        array[2]= z;
        return array;
    }

    @Override
    public String toString() {
        return "Point3D " + "XYZ = " + Arrays.toString(array) + ", x= " + x + ", y= " + y + ", z= "   + z ;
    }
}
class TestPoint{
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(2,3);
        point2D.getXY();
        System.out.println(point2D);
        Point3D point3D = new Point3D(3);
        point3D.getXYZ();
        System.out.println(point3D);
    }
}