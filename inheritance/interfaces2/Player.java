package inheritance.interfaces2;

/**
 * Objet qui inclut un champ de type interface afin
 * de bénficier du polymorphisme
 */
public class Player {
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
