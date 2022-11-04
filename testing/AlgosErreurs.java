package testing;

import java.io.File;
import java.util.Locale; // sera utilisé après l'application de quelques corrections
import java.util.Scanner;

/** Classe qui présente des méthodes avec les 3 différents types
 * d'erreurs. Ces méthodes sont testées dans la classe {@link TestAlgosErreurs}
 * @author physcrowley (2022-10)
 */
public class AlgosErreurs 
{
    /** codes ANSI pour changer la couleur du texte à la console */
    final static String RESET = "\033[0m", RED = "\033[0;31m", GREEN = "\033[0;32m";
    
    /** Cette méthode contient une erreur de syntaxe. Le projet ne se
     * compile pas sans régler ça. <p> Le compilateur nous donne de
     * l'information à la console sur l'erreur.
     */
    public static void syntaxe()
    {
        System.out.println( "Woohoo, je programme comme un Pro!" );
    }


    /**
     * Cette méthode tente de produire une exception liée à une erreur d'entrée de 
     * données (p. ex. mauvaise touche) durant une interaction via la console. 
     * Elle tente de saisir un {@code int}.
     * @param input l'entrée pour la console simulée
     */
    public static void execOopsNotInt( String input )
    {
        // ce Scanner prendra directement les valeurs passées en argument au lieu
        // des valeurs passées via interaction à la console
        Scanner consoleSim = new Scanner( input );
        
        // le bloc TRY peut contenir du code qui génère ("throws") une exception. Si c'est
        // le cas, au lieu de planter, le programme continue dans le bloc CATCH où le 
        // développeur peut faire quelque chose d'utile avec l'erreur.
        try
        {
            System.out.print( "Entrer un nombre entier > " );
            System.out.println( GREEN + input ); // la valeur passée en argument
            int choix = consoleSim.nextInt(); // plantera ici, potentiellement         
            System.out.println( RESET + "Bravo! J'ai bien lu " + choix );
        } 
        catch (Exception e)
        {
            errorOutput( e ); // affiche les messages d'erreur (voir la définition de méthode plus bas)
            System.err.println( "CORRECTION : Entrer un nombre entier la prochaine fois.\n");
        }
        consoleSim.close();
    }


    /**
     * Cette méthode tente de produire des exceptions liées à des formats de nombres
     * incompatibles entre le Scanner (qui utilise par défaut les paramètres de lieu   
     * du système) et les entrées via la console.
     * @param input l'entrée pour la console simulée
     */
    public static void execDoublesAtConsole( String input )
    {
        // ce Scanner prendra directement les valeurs passées en argument au lieu
        // des valeurs passées via interaction à la console
        Scanner consoleSim = new Scanner( input );
        
        try
        {
            // consoleSim.useLocale( Locale.CANADA ); // formats anglais
            System.out.print( "Entrer une valeur décimale (avec .) > " );
            System.out.println( GREEN + input ); // la valeur passée en argument
            double d = consoleSim.nextDouble(); // plantera ici, potentiellement
            System.out.println( RESET + "Bravo! J'ai bien lu " + d );
        } 
        catch (Exception e)
        {
            errorOutput( e );
            System.err.println( "CORRECTION : Pour des programmes de console, c'est important"
              + " de donner des invites de commande claires \n\tET de spécifier un paramètre de"
              + " lieu (Locale) EXPLICITEMENT en vous assurant \n\tque le Locale et les invites"
              + " soient cohérentes. Négliger un des deux peut donner \n\tdes comportements"
              + " inattendus.\n" );
        }
        consoleSim.close();
    }
    
    /**
     * Cette méthode tente de produire des exceptions liées à des formats de nombres
     * incompatibles entre le Scanner (qui utilise par défaut les paramètres de lieu   
     * du système) et les entrées dans un fichier.
     * @param path le chemin vers le fichier à lire
     */
    public static void execDoublesInFile( String path )
    {
        try
        {
            //
            // afficher le contenu du fichier
            //
            Scanner fileRead = new Scanner( new File( path ) ); // plantera ici, potentiellement
            System.out.print( "Le fichier " + GREEN + path + RESET + " contient le texte : " );
            System.out.println( GREEN + fileRead.nextLine() + RESET );
            fileRead.close();

            //
            // extraire la valeur double
            //
            Scanner fileGet = new Scanner( new File( path ) ); // plantera ici, potentiellement
            // fileGet.useLocale(Locale.CANADA); // formats anglais
            double d = fileGet.nextDouble(); // plantera ici, potentiellement
            System.out.println( "Bravo! J'ai bien lu " + d );
            fileGet.close();
        } 
        catch (Exception e)
        {
            errorOutput( e );
            System.err.println( "CORRECTION : En lisant des fichiers, c'est important"
            + " de connaître le FORMAT des données \n\tdans le fichier ET de spécifier"
            + " EXPLICITEMENT un paramètre de lieu (Locale) \n\tqui soit cohérent"
            + " avec ce format. Négliger un des deux peut donner des \n\tcomportements"
            + " inattendus.\n" );
        }
    }

    /** Affichage personnalisé des messages d'erreur */
    private static void errorOutput( Exception e )
    {
        // message d'erreur personnel
        System.err.println( GREEN );
        System.err.println( "KABOOM!!! Le programme a planté, a \"lancé une exception\","
        + " mais à l'intérieur du bloc TRY, donc le programme continue dans le bloc"
        + " CATCH. \nPour votre étude, voici les informations sur l'exception :" );
        
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
