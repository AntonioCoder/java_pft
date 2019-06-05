package pft.sandbox;

public class MyFirstProgramme {
    public static void main(String[] args) {
        hello("Anton");

        Square square = new Square(5);
        System.out.println("S kvadrat "+square.area());

        Rectangle rectangle = new Rectangle(6,7);
        System.out.println("S priamo " +rectangle.area());

        Point point1 = new Point(0,1);
        Point point2 = new Point(0,0);
        System.out.println("distance= "+Point.distance(point1, point2));
        System.out.println("distance1= "+distance(point1, point2));
    }

    public static void hello(String user) {
        System.out.println("Helloworld "+user);
    }

    public static double distance(Point p1, Point p2){
        double distance;
        distance = Math.sqrt((Math.pow((p1.getX()-p2.getX()),2) +Math.pow((p1.getY()-p2.getY()),2)));
        return distance;
    }


}