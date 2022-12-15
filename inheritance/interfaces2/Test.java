package inheritance.interfaces2;

/**
 * Classe utilisée pour tester cette structure
 */
public class Test {
    public static void main(String[] args) {
        Player sir = new Player("knight");
        Player gandalf = new Player("mage");
        Player bruce = new Player("ninja");
        sir.attack(); // "Coup d'épée!!!"
        gandalf.attack(); // "Boule de feu!!"
        bruce.attack(); // "Coup de poing!!"
    }
}
