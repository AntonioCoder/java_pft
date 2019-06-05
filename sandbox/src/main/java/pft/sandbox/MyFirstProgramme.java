package pft.sandbox;

public class MyFirstProgramme {
    public static void main(String[] args) {
        hello("Anton");

        Square square = new Square(5);
        System.out.println("S kvadrat "+square.area());

        Rectangle rectangle = new Rectangle(6,7);
        System.out.println("S priamo " +rectangle.area());
    }

    public static void hello(String user) {
        System.out.println("Helloworld "+user);
    }


}