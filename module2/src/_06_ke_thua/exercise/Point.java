package _06_ke_thua.exercise;

import java.util.Arrays;

public class Point {
    float[] array;
    float x = 0.0f, y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
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
        this.y = y;
    }
    public float[] getXY(){
        array = new float [2];
        array[0]=x;
        array[1]=y;
        return array;
    }

    @Override
    public String toString() {
        return "Point " + "XY= " + Arrays.toString(array) +
                ", x= " + x +
                ", y= " + y ;
    }
}
class MovablePoint extends Point{
    float xSpeed=0.0f, ySpeed = 0.0f;
    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        array = new float[2];
        array[0]=xSpeed;
        array[1]=ySpeed;
        return array;
    }

    @Override
    public String toString() {
        return "MovablePoint: "+'('+x+", "+y+')'+"speed: "+ Arrays.toString(getSpeed())
                ;
    }

    public void move(){
        x+= xSpeed;
        y+= ySpeed;
    }
}
class TestMovePoints{
    public static void main(String[] args) {
        Point point = new Point(3,3);
        point.getXY();
        System.out.println(point);
    MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        movablePoint.move();
        System.out.println(movablePoint);

    }
}
