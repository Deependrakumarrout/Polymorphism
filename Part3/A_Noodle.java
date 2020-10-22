package Polymorphism.Part3;
import java.util.Scanner;
class A_Noodle {

    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    // constructor method:
    A_Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    // getCookPrep method:
    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce.";
    }

    // main method:
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // Declaring object:
        A_Noodle spaghetti, ramen, pho, main;

        // initializing all object from all the child classes.
        // Or we can say like -> It’s possible to use objects of different classes that share a parent class together in an array or ArrayList
        spaghetti = new B_Spaghetti();
        ramen = new C_Ramen();
        pho = new D_Pho();
        main = new A_Noodle(34.54,5.3," wheat ", " paddy");


        // Add your code below:
        // declaring Array below: With the help of array we can call all the function which are override.
        A_Noodle[] allTheNoodles = {main, spaghetti, ramen, pho};
        // for each loop do the work.
        // In the for-each loop, allTheNoodle is declared as the parent class type A_Noodle.
        for(A_Noodle allTheNoodle : allTheNoodles)
            System.out.println(allTheNoodle.getCookPrep());

        System.out.println(pho.ingredients + main.lengthInCentimeters);
        System.out.println(ramen.getCookPrep());
    }
}
