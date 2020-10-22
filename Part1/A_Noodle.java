
// METHOD OVERRIDING ->

package Polymorphism.Part1;

// Writing all code from online resource:
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

    // fruit method:
    public void fruit() {
        System.out.println("Mango juice.");
        this.texture = "Prepared.";
    }

    // main method:
    public static void main(String[] args) {
        // instance of B_Spaetzle class.
        B_Spaetzle kaesespaetzle = new B_Spaetzle();
        kaesespaetzle.fruit();
         // i have tried these below line:

        // instance of A_Noodle class ->
        A_Noodle trying = new A_Noodle(7.6,8.2, "regular", "rice, dal, sweet");
        trying.fruit();

        System.out.println(kaesespaetzle.texture);
        System.out.println(trying.texture);
        System.out.println(kaesespaetzle.lengthInCentimeters);
        System.out.println(trying.lengthInCentimeters);

    }
}
