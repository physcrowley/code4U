package base;
/**
 * Exemples de récursivité
 * @author physcrowley (2022-10)
 */
public class Recursion {
    public static void main(String[] args) {
        int val = 9;
        System.out.println("Boucle");
        loop( val );
        System.out.println("Recursivité");
        recurse( val );
    }

    /**
     * Affiche les nombres de 1 à n sur des lignes séparées
     * @param n upper limit
     */
    static public void loop( int n ){
        for (int i = 1; i <= n; i++ ) {
            System.out.println( i );
        }
    }

    /** Affiche les nombres de curr à target sur des lignes séparées */
    static public void recurse( int curr, int target ) {
        // cas de base
        if ( curr > target ) return;
        
        // autres cas
        System.out.println( curr );
        recurse( curr + 1, target ); // se rapproche de curr > target
    }

    /**
     * Affiche les nombres de 1 à {@code target} sur des lignes séparées
     * @param target
     */
    static public void recurse( int target ) {
        recurse( 1, target);
    }
}
