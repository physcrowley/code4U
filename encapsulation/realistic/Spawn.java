package encapsulation.realistic;

public class Spawn {
    /**
     * Champs encapsulés pour les instances
     */
    private String race;
    private int power;
    private Weapon weapon;

    /**
     * Constructeur pour les types de joueurs
     * @param r sa race
     * @param p sa puissance initiale
     * @param w son arme initiale
     */
    public Spawn( String r, int p, Weapon w) {
        race = r;
        power = p;
        weapon = w;
    }

    /*
     * Méthodes accesseurs
     */
    public String race() { return race; }
    public int power() { return power; }
    public Weapon weapon() { return weapon; }
    
}
