package inheritance.interfaces;
//
// Interface
//

interface Attack {
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

//
// Objet qui inclut un champ de type interface afin
// de bénficier du polymorphisme
//

class Player {
    private Attack attack; // champ de type interface
    private String type;

    public Player(String t) {
        setType(t);
    }

    public void setType(String t) {
        type = t;
        setAttack(); // doit modifier l'attaque en conséquence
    }

    /** Assigne l'implémentation appropriée au champ = polymorphisme */
    private void setAttack() {
        if (type.equals("knight"))
            attack = new SwordAttack();
        else if (type.equals("mage"))
            attack = new MagicAttack();
        else if (type.equals("ninja"))
            attack = new FistAttack();
        else attack = null;
    }

    public String type() {
        return type;
    }

    public void attack() {
        attack.attack();
    }
}

//
// Classe utilisée pour tester cette structure
//

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