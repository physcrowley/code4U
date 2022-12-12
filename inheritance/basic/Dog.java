package inheritance.basic;

public class Dog extends Animal {

    public Dog(String n, int l) {
        super(n, l); // appelle l'implémentation de la classe "supérieur", le parent Animal
    }

    // méthodes surchargées

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Je mange des croquettes et des restes de table");
    }
}
