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
        System.out.println( "Woohoo, je programme comme un Pro!" )
    }

    /** 
     * Cette méthode peut donner une erreur d'exécution. Le programme
     * se compile mais peut planter durant l'exécution.<p> Le JVM
     * nous donne de l'information sur l'"Exception" - le terme officiel
     * pour un plantage - à la console.
     */
    public static void execution( Scanner console )
    {
        System.out.print( "Je te demande un nombre (mais écrit du texte) > " );
        int choix = console.nextInt();
        System.out.println( "Tu as fourni le nombre " + choix );
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
