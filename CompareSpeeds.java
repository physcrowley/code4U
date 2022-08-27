import java.util.Random;
import java.util.Scanner;

/**
 * Gabarit pour comparer deux ou plusieurs algorithmes en termes du temps d'exécution.
 */
public class CompareSpeeds 
{
    public static void main( String[] args ) 
    {
		long start, stop, elapsed, slowest = 0, fastest = Long.MAX_VALUE;

		final int ITERATIONS = 40; // nombre de fois qu'on répète le test
		final int SIZE = 20000; // quantité de données d'entrée, n

		int[] intArr = new int[ SIZE ];

		Random gen = new Random(555555576); 
            // graine fixe générant toujours la même séquence de 
            // valeurs pseudo-aléatoires

		Scanner kb = new Scanner(System.in);

        String algoDescription = "erreur";

		System.out.println( "Ce programme compare les performances de quelques algorithmes." );
        System.out.println( "Taper 'Entrée' pour continuer ..." );
		kb.nextLine();

		for ( int runs=0; runs<ITERATIONS; runs++ ) 
        {
            // générer les valeurs pseudo-aléatoires
			for ( int i=0; i<SIZE; i++ ) 
            {
				intArr[i] = gen.nextInt(1000); // de 0 à 1000
			}

            algoDescription = "[nom de l'algorithme]";
            start = System.nanoTime();
            // appeler une fonction qui lance votre algorithme utilisant, en paramètre, intArr
            // p. ex.: selectionSort( intArr ), bubbleSort( intArr ), mergeSort( intArr )
            stop = System.nanoTime();
	
			elapsed = (stop-start)/1000000;

            // mettre à jour les meilleurs et pires temps
            // on ignore les 10  premières boucles où le compilateur optimise encore l'exécution
			if ( runs > 10 && elapsed < fastest ) 
				fastest = elapsed;
			if ( runs > 10 && elapsed > slowest )
				slowest = elapsed;
		}

        System.out.println( "\n" + algoDescription );
        System.out.println( "\t" + ITERATIONS + " passes avec " + SIZE + " données." );
		System.out.println( "\tMeilleur temps : " + fastest + " milliseconds." );
		System.out.println( "\tPire temps: " + slowest + " milliseconds." );
        slowest = 0;
        fastest = Long.MAX_VALUE;

		// dupliquer les lignes 30 à 59 pour les autres algorithmes à tester (ou créer un
        // menu de sélection et les tester un par un sans dupliquer le code du test à 
        // part les lignes 38, 40 et 41)
	}

    // définir les autres fonctions ici (ou créer des instances dans main() si elles sont
    // déjà définies dans une autre classe).
}
