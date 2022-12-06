package encapsulation.realistic;

import java.util.ArrayList;

public class Player {

    //
    // Champs encapsulés des instances
    //

    private String name;
    private Spawn type;
    private Weapon weapon;
    private int power;
    private int health;

    private ArrayList<Weapon> weapons; // peut cumuler des objets

    
    //   
    // Champs encapsulés de la classe
    // 

    private static ArrayList<Spawn> types = new ArrayList<>();
    
    /* 
     * charger les types possibles et leurs valeurs initiales
     * 
     * ce code, dans le bloc static {}, sera exécutée dès que la classe est
     * chargée en mémoire même si aucune instance n'est créée.
     */
    static {
        types.add( new Spawn("Elfe", 40, new Weapon("arc et flèche", 10) ) );
        types.add( new Spawn("Sorcier", 80, new Weapon("amulette de puissance", 10) ) );
        types.add( new Spawn("Érudit", 30, new Weapon("tome de sagesse", 15) ) );
    }

    /**
     * Constructeur qui assigne un type valide et les valeurs initiales
     * appropriées pour ce type.
     * @param n le nom du Player
     * @param t le type du Player
     */
    public Player( String n, String t) {
        // assigner le type selon le nom fourni
        for (Spawn s : types ) {
            if ( t.equalsIgnoreCase( s.race() ) ) {
                type = s;
            }
        }
        if ( type == null ) { // aucune correspondance valide
            System.err.println( "Type invalide " + t );
            System.err.println( "Le type 'défaut' est assigné." );
            type = new Spawn( "Défaut", 0, null );
        }

        // valeurs automatiques
        name = n;
        health = 100;
        power = type.power();
        weapons = new ArrayList<>();
        weapon = type.weapon();
        weapons.add( weapon );
    }

    //
    // Méthodes accesseurs
    //

    public String name() { return name; }
    public String type() { return type.race(); }
    public String weapon() { return weapon.name(); }
    public int power() { return power; }
    public int health() { return health; }
    public ArrayList<Weapon> weaponsList() { return weapons; }

    //
    // Méthodes mutateurs
    //
    
    public void changeWeapon( Weapon w ) {
        int old = weapon.strength(); // puissance actuelle du Weapon
        addWeapon(w); // ajouter le nouveau Weapon à la liste
        weapon = w; // changer le Weapon actif
        power += weapon.strength() - old ; // ajuster la puissance
    }

    public void addWeapon( Weapon w ) {
        if ( ! weapons.contains( w ) ) { 
            weapons.add( w ); // seulement s'il n'est pas déjà dans la liste
        }
    }

    public void healthBoost( int n ) { 
        if ( ! isDead() ) health += n; 
    }

    public void takeDamage( int n ) {
        health -= n;
        if ( isDead() ) health = 0;
    }

    public boolean isDead() { return health <= 0; }

    public void powerBoost( int n ) { power += n; }

    public void powerLoss( int n ) { 
        power -= n; 
        if (power < 0 ) power = 0;
    }

    //
    // Méthode d'affichage
    //
    @Override
    public String toString() {
        return String.format(
            "%s (%s): santé=%d, puissance=%d, arme=%s\n\tarmes=%s",
            name, type.race(), health, power, weapon, weapons
        );
    }
}
