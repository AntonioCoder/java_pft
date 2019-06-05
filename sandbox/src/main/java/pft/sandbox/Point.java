package pft.sandbox;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static double distance(Point p1, Point p2){
        double distance;
        distance = Math.sqrt((Math.pow((p1.x-p2.x),2) +Math.pow((p1.y-p2.y),2)));
        return distance;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}
