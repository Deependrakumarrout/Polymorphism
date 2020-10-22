package Polymorphism.Part3;

public class C_Ramen extends A_Noodle {

    // constructor method:
    C_Ramen() {
        super(30.0, 0.3, "flat", "wheat flour");
    }

    @Override
    public String getCookPrep() {
        return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";
    }
}
