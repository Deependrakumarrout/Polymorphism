package Polymorphism.Part2;

class B_Noodle {

    // Declaration of protected variable:
    protected double lengthInCentimeters;
    protected double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    // Constructor method:
    B_Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    // cook method:
    public void cook() {
        this.texture = "cooked";
        System.out.println("i have cooked the food.");
    }
}
