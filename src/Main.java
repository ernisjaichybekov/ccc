//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double radius = 5.0;

        // Статикалык методдорду колдонуп
        System.out.println("Area: " + Circle.area(radius)); // Area: 78.53981633974483
        System.out.println("Circumference: " + Circle.circumference(radius));
    }
}