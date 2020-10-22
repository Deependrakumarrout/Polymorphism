package Polymorphism.Part1;

// inheriting the child class (B_Spaetzle)
class B_Spaetzle extends A_Noodle{

    B_Spaetzle() {
        super(3.0,1.5, "irregular", "eggs, flour, salt");
        this.texture = "lumpy and liquid";

    }

    // Add the new fruit() method below:
    @Override
    public void fruit() {
        System.out.println("Grinding or scraping dough.");
        System.out.println("Prepared.");
    }
}
