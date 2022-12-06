package encapsulation.realistic;

public class Weapon {

    //
    // Champs encapsulés des instances 
    //

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

    //
    // Méthodes accesseurs
    //
    public String name() { return name; }
    public int strength() { return strength; }

    //
    // Méthode de comparaison
    //

    /*
     * Cette méthode nous permet de comparer deux Weapons comme on veut.
     * La méthode equals() est définie dans java.lang.Object et cette 
     * version est utilisée par défaut si on ne définie pas notre propre
     * version, comme la méthode toString().
     * 
     * La première chose bizarre est qu'il faut passer un Object et non
     * un Weapon (parce que c'est comme ça que c'est définie dans Object).
     * Cela nous force à caster l'objet vers un Weapon, ce qui peut échouer,
     * d'où le bloc try{} catch (Exception){}. Si l'Object o est de type Weapon,
     * on peut procéder à la comparaison des champs individuels. Sinon, on
     * tombe dans le bloc catch (Exception){} où on dit simplement que les
     * deux ne sont pas égaux.
     */
    @Override
    public boolean equals( Object o ) {
        try {
            // si o est un Weapon, ne plantera pas
            Weapon other = (Weapon) o;
            // si les champs des deux Weapon sont identiques
            if ( name.equals( other.name() ) && strength == other.strength() ) {
                return true;
            } 
            // sinon
            return false;
        } catch( Exception e ) { // a planté parce qu'o n'est pas un Weapon
            return false;
        }
    }

    //
    // Méthode d'affichage
    //
    @Override
    public String toString() {
        return name + ":" + strength;
    }
}
