package testing;

import java.util.Scanner;

/**
 * Classe qui existe juste pour tester ce qu'on a fait dans la classe
 * {@link AlgoErreurs}
 * @author physcrowley (2022-10)
 */
public class TestAlgosErreurs {

    /**
     * Teste les méthodes de la classe AlgosErreurs individuellement
     * @param args
     */
    public static void main(String[] args) {
        /*
         * pas besoin de tester AlgosErreurs.syntaxe() parce l'erreur doit être
         * résolue avant de pouvoir compiler AlgosErreurs.
         */
        
        // méthode pour tester AlgosErreurs.execution( Scanner )
        testExecution();

        // méthode pour tester AlgosErreurs.logic( int )
        // testLogic();
    }


    static void testExecution()
    {
        Scanner input = new Scanner( System.console().reader() );
        AlgosErreurs.execution( input );
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

    // codes ANSI pour changer la couleur du texte à la console
    static final String RESET = "\033[0m", RED = "\033[0;31m", GREEN = "\033[0;32m";
    
}
