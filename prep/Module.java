package prep;

/**
 * Cette classe montre comment on peut grouper des méthodes utiles dans une
 * classe afin de s'en servir dans une autre. <p> En réalité, pour ce que Run.java
 * fait, cette façon de gérer le code a augmenté la complexité du 
 * programme sans bénéfice apparente, sauf rendre Run.java un peu plus lisible.
 * @author physcrowley
 */
public class Module {

    /**
     * Affiche les {@code n} premiers noms de la liste.
     * @param n le nombre de noms de la liste à traiter
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
     * Calcule la moyenne de la classe de n premiers élèves dans la liste.
     * @param n le nombre de moyennes de la liste à traiter
     * @param list la liste des objets de type Struct à traiter
     */
    public static void showAverage( int n, Struct[] list )
    {
        System.out.print( "La moyenne de la classe est ");
        double sum = 0;
        for ( int i = 0; i < n; i++ ) sum += list[ i ].average;
        System.out.printf( "%.1f\n", sum / n );
    }
    
}
