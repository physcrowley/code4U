package testing;

import java.io.File;
import java.util.Scanner;

/** Classe qui présente des méthodes avec les 3 différents types
 * d'erreurs. Ces méthodes sont testées dans la classe {@link TestAlgosErreurs}
 * @author physcrowley (2022-10)
 */
public class AlgosErreurs 
{
    /** Cette méthode contient une erreur de syntaxe. Le projet ne se
     * compile pas sans régler ça. <p> Le compilateur nous donne de
     * l'information à la console sur l'erreur.
     */
    public static void syntaxe()
    {
        System.out.println( "Woohoo, je programme comme un Pro!" );
    }


    /** 
     * Cette méthode tente de produire trois différentes erreurs d'exécution. 
     * Le programme se compile mais peut planter durant l'exécution.<p> 
     * Le JVM nous donne de l'information sur l'"Exception" - le terme 
     * officiel pour un plantage - à la console.
     */
    public static void execution( Scanner console )
    {
        /*
         * Premier scénario
         */
        System.out.println( "SCÉNARIO 1 - entrée de données incorrectes via la console" );
        
        // le bloc TRY peut contenir du code qui génère ("throws") une exception. Si c'est
        // le cas, au lieu de planter, le programme continue dans le bloc CATCH où le 
        // développeur peut faire quelque chose d'utile avec l'erreur.
        try
        {
            System.out.print( "Je vous demande un nombre entier (mais écrivez du texte) > " );
            int choix = console.nextInt(); // plantera ici, potentiellement         
            System.out.println( "Vous avez fourni le nombre " + choix );
        } catch (Exception e)
        {
            errorOutput( e ); // affiche les messages d'erreur (voir la définition de méthode plus bas)
            System.err.println( "CORRECTION : Entrer un nombre entier la prochaine fois.\n");
        }
        console.nextLine(); // vider le retour de ligne suite au nextInt()
        wait( console ); // voir la définition de méthode plus bas

        /*
         * Deuxième scénario
         */
        System.out.println( "SCÉNARIO 2 - paramètres de lieu affectant à la console" );
        try
        {
            // console.useLocale( Locale.CANADA );
            System.out.println( "Entrer une valeur décimale (avec .) > " );
            double d = console.nextDouble(); // plantera ici, potentiellement
            System.out.println( "Nombre de la console : " + d );
        } catch (Exception e)
        {
            errorOutput( e );
            System.err.println( "CORRECTION : Aller dans le fichier AlgosErreurs.java pour"
            + " décommenter la ligne de code dans la méthode exécution qui spécifie le"
            + " Locale pour le Scanner de la console (scénario 2) et essayez encore.\n" );

        }
        console.nextLine(); // vider le retour de ligne suite au nextDouble()
        wait( console );

        /*
         * Troisième test
         */
        System.out.println( "SCÉNARIO 3 - paramètres de lieu affectant la lecture d'un fichier" );
        try
        {
            String path = "./data/locale.txt";
            System.out.print( "\nTentative de lire la valeur à virgule flottant du fichier " + path );
            System.out.println(" ... ");

            Scanner file = new Scanner( new File( path ) );
            // file.useLocale(Locale.CANADA);
            double d = file.nextDouble(); // plantera ici, potentiellement
            System.out.println( "Du fichier : " + d );
            file.close();
        } catch (Exception e)
        {
            errorOutput( e );
            System.err.println( "CORRECTION : Aller dans le fichier AlgosErreurs.java pour"
            + " décommenter la ligne de code dans la méthode exécution qui spécifie le" 
            + " Locale pour le Scanner du fichier (scénario 3) et essayez encore.\n" );
        }
    }


    /** Bloque le programme pour donner à l'utilisateur le temps de lire les messages */
    private static void wait( Scanner console ) {
        System.out.print("Taper ENTRÉE pour continuer "); 
        console.nextLine();
        System.out.println(); // ligne vide
    }

    /** Affichage personnalisé des messages d'erreur */
    private static void errorOutput( Exception e )
    {
        // codes ANSI pour changer la couleur du texte à la console
        final String RESET = "\033[0m", RED = "\033[0;31m", GREEN = "\033[0;32m";

        // message d'erreur personnel
        System.err.println( GREEN );
        System.err.println( "KABOOM!!! Le programme a planté, a \"lancé une exception\","
        + " mais à l'intérieur du bloc try, donc le programme continue dans le bloc"
        + " catch. \nPour votre étude, voici les informations sur l'exception :" );
        
        // message d'erreur du JVM (infos sur l'exception)
        System.err.println( RED );
        e.printStackTrace();

        // retour à la couleur par défaut
        System.err.println( RESET );
    }


    /** 
     * Méthode pour calculer le factoriel d'un nombre avec l'itération, mais
     * qui contient des erreurs de logique, le type d'erreur le
     * plus difficile à trouver. L'algorithme n'a aucune erreur de
     * programmation évidente mais ne résout pas le problème qu'on veut
     * qu'il résout -> la calcul du factoriel est incorrect. <p> Il faut 
     * utiliser des techniques plus avancées pour repérer le ou les erreurs :
     * <p>
     * <ul>
     *   <li> ajouter des {@code println} à des endroits stratégiques pour
     * voir l'évolution des valeurs </li>
     *   <li> utiliser un débogueur avec des points d'arrêt pour suivre toutes 
     * les valeurs en mémoire et avancer pas-par-pas à travers le programme
     * </ul>
     * @param n un nombre entier à utiliser pour le calcul
     */
    public static int logic( int n )
    {
         // calculer le factoriel avec une boucle
        int factoriel = n;
        for ( int i = 0; i < n; i++ )
        {
            factoriel *= i;
        }
        return factoriel;
    }
    
}
