package testing;

import java.util.Scanner;

/**
 * Classe qui existe juste pour tester ce qu'on a fait dans la classe
 * {@link AlgoErreurs}
 * @author physcrowley (2022-10)
 */
public class TestAlgosErreurs {
    
    /** Scanner accessible à toutes les méthodes de la classe */
    private static Scanner input = new Scanner( System.console().reader() );

    /**
     * Teste les méthodes de la classe AlgosErreurs individuellement
     * @param args
     */
    public static void main(String[] args) {
        // testExecution();
        testLogic();
    }


    static void testExecution()
    {
        AlgosErreurs.execution( input );
    }

    static void testLogic()
    {
        // cas à tester et résultats attendus pour chaque cas
        int[] cases    = { -1, 0, 1, 2, 3,  4,   5 };
        int[] expected = { -1, 0, 1, 2, 6, 24, 120 };

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
            System.out.println( "Succès" );
        } else
        {
            System.out.println( errors + " erreurs / " + cases.length + " cas");
        }
    }
    
}
