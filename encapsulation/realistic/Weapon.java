package encapsulation.realistic;

public class Weapon {

    /*
     * Champs encapsulés des instances 
     */

    private String name;
    private int strength;

    /**
     * Constructeur
     * @param n le nom du Weapon
     * @param s la force du Weapon
     */
    public Weapon( String n, int s ) {
        name = n;
        strength = s;
    }

    /*
     * Méthodes accesseurs
     */
    public String getName() { return name; }
    public int getStrength() { return strength; }

    /*
     * Méthode de comparaison
     */

    @Override
    public boolean equals( Object o ) {
        try{
            Weapon other = (Weapon) o;
            // si les valeurs de l'autre Weapon sont identiques
            if ( this.name.equals(other.getName()) 
                && this.strength == other.getStrength() ) return true;
            // sinon
            return false;
        } catch( Exception e ){ // pas un Object de type Weapon
            return false;
        }
        
    }

    /*
     * Méthode d'affichage
     */
    @Override
    public String toString() {
        return name + ":" + strength;
    }
}
