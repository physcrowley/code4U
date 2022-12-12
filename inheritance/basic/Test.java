package inheritance.basic;

public class Test {
    public static void main(String[] args) {
        // objet enfant, Dog, qui utilise des méthodes du parent, Animal
        Dog spot = new Dog("Spot", 4);
        System.out.println(spot.name() + " a " + spot.legs() + " jambes");

        // méthodes surchargés dans la classe enfant, Dog
        spot.speak();
        spot.eat();
    }
}
