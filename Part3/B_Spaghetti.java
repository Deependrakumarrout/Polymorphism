package Polymorphism.Part3;

class B_Spaghetti extends A_Noodle {

    // constructor method:
    B_Spaghetti() {

        super(30.0, 0.2, "round", "semolina flour");
    }

    //@Override
    public String getCookPrep() {
        return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";
    }
}
