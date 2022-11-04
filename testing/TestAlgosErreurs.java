package testing;

import java.util.Scanner;

/**
 * Classe qui existe juste pour tester ce qu'on a fait dans la classe
 * {@link AlgoErreurs}
 * @author physcrowley (2022-10)
 */
public class TestAlgosErreurs {

    /** Pour l'interaction avec l'utilisateur durant les tests */
    private static Scanner input = new Scanner( System.console().reader() );

    /** codes ANSI pour changer la couleur du texte à la console */
    static final String RESET = "\033[0m", RED = "\033[0;31m", GREEN = "\033[0;32m";

    /** code ANSI pour vider la console */
    static final String FLUSH = "\033[H\033[2J";
    
    /**
     * Teste les méthodes de la classe {@link AlgosErreurs} individuellement
     * @param args
     */
    public static void main(String[] args) {
        /*
         * pas besoin de tester la méthode qui vise les erreurs de
         * syntaxe parce qu'il faut résoudre ces erreurs avant de
         * pouvoir lancer les tests. Voir AlgosErreurs.syntaxe()
         * directement.
         */
        
        // tester les méthodes qui visent des erreurs d'exécution
        System.out.println( FLUSH ); // vider la console
        testExecOops();
        testExecConsole();
        testExecFile();

        // tester la méthode qui vise les erreurs de logique
        // testLogic();
    }


    /** Cette méthode passe des cas de test à la méthode {@code AlgosErreurs.execOopsNotInt()} */
    static void testExecOops()
    {
        System.out.print( "TEST de execOopsNotInt" );
        System.out.println( " - erreurs humaines lors des interactions\n" );

        AlgosErreurs.execOopsNotInt( "r" ); // pas un entier
        pause();
        AlgosErreurs.execOopsNotInt( "3" ); // un entier
        warnAndFlush(); // voir la définition de méthode plus bas
    }


    /** Cette méthode passe des cas de test à la méthode {@code AlgosErreurs.execDoublesAtConsole()} */
    static void testExecConsole()
    {
        System.out.print( "TEST de execDoublesAtConsole" );
        System.out.println( " - paramètres de lieu affectant à la console\n" ); 

        AlgosErreurs.execDoublesAtConsole( "1,2" ); // format français
        pause();
        AlgosErreurs.execDoublesAtConsole( "1.2" ); // format anglais
        warnAndFlush();
    }

    /** Cette méthode passe des cas de test à la méthode {@code AlgosErreurs.execDoublesInFile()} */
    static void testExecFile()
    {
        System.out.print( "TEST de execDoublesInFile" );
        System.out.println( " - paramètres de lieu affectant la lecture d'un fichier\n" ); 

        AlgosErreurs.execDoublesInFile( "./data/locale_fr.txt" ); // format français
        pause();
        AlgosErreurs.execDoublesInFile( "./data/locale_en.txt" ); // format anglais
        warnAndFlush();
    }


    /** Bloque le programme pour donner à l'utilisateur le temps de lire les messages */
    private static void pause() {
        System.out.print("Taper ENTRÉE pour continuer "); 
        input.nextLine(); // attendre l'entrée
        System.out.println(); // ligne vide
    }

    /** Avertissement et effacage de la console */
    private static void warnAndFlush()
    {
        System.out.print( "\n" + RED );
        System.out.println( "Prendre une capture d'écran - la console sera effacée. " + RESET );
        pause();
        System.out.println( FLUSH );
    }


    static void testLogic()
    {
        // cas à tester et résultats attendus pour chaque cas
        int[] cases    = { -3, -2, -1, 0, 1, 2, 3,  4,   5 };
        int[] expected = { -6,  2, -1, 0, 1, 2, 6, 24, 120 };

        // boucle de test
        int errors = 0;
        for (int i = 0; i < cases.length; i++ )
        {
            if (AlgosErreurs.logic( cases[i] ) != expected[i] )
            {
                errors++;
            }
        }
        if ( errors == 0 )
        {
            System.out.println( GREEN + "Succès" + RESET );
        } else
        {
            System.out.println( RED + errors + " erreurs" + RESET 
                                + " / " + cases.length + " cas"  );
        }
    }    
}
