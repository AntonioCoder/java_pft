package pft.sandbox;

public class MyFirstProgramme {
    public static void main(String[] args) {
        hello("Anton");
        System.out.println("S kvadrat "+area(5));
        System.out.println("S priamo " +area(7,8));
    }

    public static void hello(String user) {
        System.out.println("Helloworld "+user);
    }
    public static double area(double l){
        return l*l;
    }
    public static double area(double a, double b){
        return a*b;
    }
}