package Polymorphism.Part3;

class D_Pho extends A_Noodle {

    // constructor method:
    D_Pho() {
        super(30.0, 0.64, "flat", "rice flour ");
    }

    @Override
    public String getCookPrep() {
        return "Soak pho for 1 hour, then boil for 1 minute in broth." +
                "Then garnish with cilantro and jalapeno.";
    }
}
