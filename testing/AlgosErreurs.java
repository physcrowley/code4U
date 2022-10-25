package testing;

import java.util.Scanner;

/** Classe qui présente des méthodes avec les 3 différents types
 * d'erreurs
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
     * Cette méthode peut donner une erreur d'exécution. Le programme
     * se compile mais peut planter durant l'exécution.<p> Le JVM
     * nous donne de l'information sur l'"Exception" - le terme officiel
     * pour un plantage - à la console.
     */
    public static void execution( Scanner console )
    {
        System.out.println( "TEST 1 - simple erreur" );
        try
        {
            System.out.print( "Je te demande un nombre entier (mais écrit du texte) > " );
            int choix = console.nextInt();
            System.out.println( "Tu as fourni le nombre " + choix );
            System.out.println( "\nOn essaye un autre cas test.\n" );
        } catch (Exception e)
        {
            errorOutput( e );
            System.out.println( "\tEntrer un nombre entier la prochaine fois.\n");
        }


        System.out.println( "TEST 2 - format des nombres à la console" );
        try
        {
            TestLocale.console();
            System.out.println( "\nOn essaye un autre cas test.\n" );
        } catch (Exception e)
        {
            errorOutput( e );
            System.out.println( "\tAller dans le fichier TestLocale.java pour"
            + " décommenter la ligne de code qui spécifie le Locale pour l'objet"
            + " Scanner et essayez encore.\n" );

        }


        System.out.println( "TEST 3 - format des nombres dans un fichier" );
        try
        {
            TestLocale.file();
        } catch (Exception e)
        {
            errorOutput( e );
            System.out.println( "\tAller dans le fichier TestLocale.java pour"
            + " décommenter la ligne de code qui spécifie le Locale pour le fichier"
            + " et essayez encore.\n" );
        }

    }

    /** 
     * Petite méthode d'appui à la méthode {@code execution} pour mieux afficher les
     * messages d'erreur
     */
    private static void errorOutput( Exception e )
    {
        // codes ANSI pour changer la couleur du texte à la console
        final String RESET = "\033[0m", RED = "\033[0;31m", GREEN = "\033[0;32m";

        // message d'erreur personnel
        System.err.println( GREEN );
        System.err.println( "BOOM!!! Le programme aurait planté, mais il y avait"
        + " du code try/catch pour intervenir. Voici le message sur l'Exception :" );
        
        // message d'erreur du JVM
        System.err.println( RED );
        e.printStackTrace();

        // retour à la couleur par défaut
        System.err.println( RESET );
    }

    /** 
     * Cette méthode contient des erreurs de logique, le type d'erreur le
     * plus difficile à trouver. L'algorithme n'a aucune erreur de
     * programmation évidente mais ne résout pas le problème qu'on veut
     * qu'il résout -> son résultat est incorrect. <p> Il faut utiliser des
     * techniques plus avancées pour repérer le ou les erreurs :
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
