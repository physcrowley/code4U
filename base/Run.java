package base;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/** Classe pour tester et lancer le code dans le package {@code base} 
 * @author physcrowley (2022-10)
*/
public class Run {
    public static void main(String[] args) {
        
        // exemple de différents types de méthodes
        // methods();

        // exemples de traverse de tableaux
        traversingArrays();
        
        // exemple de récursivité
        // recursion();

        // exemple d'usage d'un objet pour organiser les données
        // struct();
    }

    /** Utilise les différentes formes de méthodes dans {@link base.Methods} */
    static void methods(){
        /*
         * Ici, les appels de fonctions assignent les valeurs de retour à des
         * variables et fournissent des valeurs à assigner aux paramètres.
         */
        Methods.greet();
        String name = Methods.getName();
        int points = Methods.prize( name );
        String prize = Methods.makePrize( name, points );
        System.out.println( prize );
    }

    /** 
     * Utilise les méthodes pour traverser les tableaux définis 
     * dans {@link base.Tableaux}
     *  */
    static void traversingArrays() {
        System.out.println( "Traverser les tableaux" );
        System.out.println( "\nWHILE");
        Tableaux.traverseWithWhile();
        System.out.println( "\nFOR" );
        Tableaux.traverseWithFor();
        System.out.println( "\nFOR EACH" );
        Tableaux.traverseWithForEach();
        System.out.println();
    }

    /** Utilise les méthodes du module {@link base.Recursion} */
    static void recursion()
    {
        int[] nums = {-7, 0, 1, 2, 3, 20, 40};
        
        System.out.println( "Factoriel " );
        for ( int n : nums ){
            long result = Recursion.factorial( n );
            String err = "";
            if ( result == -1 ) err = "erreur de nombre négatif";
            else if ( result < 0 ) err = "erreur de résultat trop grand";
            System.out.printf( "%6d -> %d %s\n", n, result, err );
        }
        System.out.println( "\nOreils de lapin" );
        //ne pas faire le cas négatif
        for ( int i = 1; i < nums.length; i++ ) {
            int n = nums[ i ]; 
            System.out.printf(
                "%6d lapins -> %d oreils\n", n, Recursion.bunnyEars( n ) );
        }
        System.out.println( "\nFibonacci" );
        for ( int n : nums ){
            int result = Recursion.fibonacci( n );
            String err = result == -1 ? "erreur de nombre négatif" : "";
            System.out.printf(
                "    n=%2d -> %d %s\n", n, result, err );
        }
    }

    /** Utilise le struct/record défini dans {@link base.Struct} */
    static void struct()
    {
        // tenter de lire le fichier de données
        String file = "./data/base_struct.txt"; 
                      // chemin à partir de la racine du "projet" code4U
        Scanner fileReader;
        try {
            fileReader = new Scanner( new File( file ) );
            fileReader.useLocale( Locale.CANADA ); // le décimal est un point (.)
        } catch ( Exception e ) {
            System.out.println( "Erreur : fichier \"" + file + "\" pas trouvé" );
            return; // quitter en cas d'échec
        }

        // créer un tableau en lisant le fichier
        Struct[] students = new Struct[ 100 ]; // un tableau assez grand
        int n = 0; // le nombre de lignes lus
        while ( fileReader.hasNextLine() && n < 100 )
        {
            students[ n ] = new Struct(); // un nouveau Struct à l'index n
            // extraires les valeurs pour cet élève
            students[ n ].name = fileReader.next();
            students[ n ].schoolYear = fileReader.nextInt();
            students[ n ].average = fileReader.nextDouble();
            // passer à la prochaine ligne
            fileReader.nextLine(); 
            n++;
        }
        fileReader.close();

        // Afficher quelques données
        System.out.println( "Noms des " + n + " élèves :" );
        System.out.print("\n\t");
        for ( int s = 0; s < n; s++ ) {
            System.out.print( students[ s ].name + " " );
        }
        System.out.println("\n");

        System.out.print( "La moyenne de la classe est ");
        double sum = 0;
        for ( int s = 0; s < n; s++ ) sum += students[ s ].average;
        System.out.printf( "%.1f\n", sum / n );
    }

}
