package inheritance.interfaces2;

/**
 * Interface
 */
public interface Attack {
    public void attack(); // juste la déclaration
}

//
// Classes qui implémentent l'interface
//

class SwordAttack implements Attack {
    public void attack() {
        System.out.println("Coup d'épée!!!");
    }
}

class MagicAttack implements Attack {
    public void attack() {
        System.out.println("Boule de feu!!");
    }
}

class FistAttack implements Attack {
    public void attack() {
        System.out.println("Coup de poing!!");
    }
}
