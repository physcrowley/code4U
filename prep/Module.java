package prep;

/**
 * Cette classe montre comment on peut grouper des méthodes utiles dans une
 * classe afin de s'en servir dans une autre. <p> En réalité, pour ce que 
 * {@link prep.Run} fait, cette façon de gérer le code a augmenté la complexité  
 * du programme sans bénéfice apparente, sauf :
 * <ul>
 *   <li>rendre {@link prep.Run} plus lisible.</li>
 *   <li>démontrer la technique des modules de manière simple.</li>
 * </ul>
 * Notamment, le mot-clé {@code static} peut être expliqué avec cet exemple.
 * 
 * @author physcrowley
 */
public class Module {

    /**
     * Affiche les {@code n} premiers noms de la liste.
     * @param n le nombre de noms à traiter
     * @param list la liste des objets de type Struct à traiter
     */
    public static void showList( int n, Struct[] list)
    {
        System.out.println( "Noms des " + n + " élèves :" );
        System.out.print("\n\t");
        for ( int i = 0; i < n; i++ ) {
            System.out.print( list[ i ].name + " " );
        }
        System.out.println("\n");
    }

    
    /**
     * Calcule la moyenne de classe pour les n premiers élèves dans la liste.
     * @param n le nombre de moyennes à traiter
     * @param list la liste des objets de type Struct à traiter
     */
    public static void showAverage( int n, Struct[] list )
    {
        System.out.print( "La moyenne de la classe est ");
        double sum = 0;
        for ( int i = 0; i < n; i++ ) sum += list[ i ].average;
        System.out.printf( "%.1f\n", sum / n );
    }
    
    /*
     * Mot-clé STATIC
     * 
     * Le mot-clé `static` veut dire qu'on doit référer à la classe dans laquelle
     * la méthode (ou la variable) est définie quand on l'utilise.
     * 
     * Par exemple, dans prep.Run on appelle la méthode showList comme ceci :
     * `Module.showList()` parce showList est un membre static de la classe
     * Module.
     * 
     * Déclarer quelque chose "static" signifie qu'il appartient à la CLASSE.
     * 
     * EN CONTRASTE, les variables dans prep.Struct ne sont PAS déclarées avec
     * le mot-clé `static`. Cela veut dire qu'une copie de chaque variable sera
     * créée chaque fois qu'on crée une nouvelle INSTANCE de type Struct dans
     * prep.Run (avec le mot-clé `new`).
     * 
     * Notez qu'on accède aux valeurs name, schoolYear et average en faisant 
     * référence à chaque instance directement (p. ex. students[0].name ) et
     * non à la classe Struct. Notez aussi qu'on modifie juste la valeur d'une
     * instance spécifique avec les instructions d'assignation; les autres 
     * instances gardent leurs propres valeurs.
     * 
     */

}
