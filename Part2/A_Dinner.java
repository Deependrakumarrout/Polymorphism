
// USING A CHILD CLASS AS ITS PARENT CLASS ->

package Polymorphism.Part2;
class A_Dinner {

    // makeNoodles method: with B_Noodle class name that had a parameter.
    private void makeNoodles(B_Noodle noodle, String sauce) {
        noodle.cook();
        System.out.println("Mixing " + noodle.texture + " noodles made from "+noodle.ingredients + " with " + sauce + ".");;
        System.out.println("Dinner is served!");

    }

    // main method:
    public static void main(String[] args) {
        // instance of A_Dinner class:
        A_Dinner noolesDinner = new A_Dinner();
        // Add your code here:

        // Here the first one B_Noodle is Parent class with a object biangBiang that is the instance of (C_BiangBiang) class.
        B_Noodle biangBiang = new C_BiangBiang();
        noolesDinner.makeNoodles(biangBiang, "soy sauce and chili oil");
    }
}
