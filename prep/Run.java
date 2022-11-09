package prep;

import java.io.File;
import java.util.Scanner;

/** Classe pour tester et lancer le code dans le package {@code prep} 
 * @author physcrowley (2022-10)
*/
public class Run {

    /** 
     * Utilise la structure de données définie dans le struct/record
     *  {@link prep.Struct} 
     *  et les méthodes définies dans le module {@link prep.Module}
     */
    public static void main(String[] args) {
        
        String file = "./data/struct.txt"; // chemin du fichier de données à lire
        Scanner fileReader; // un Scanner pour le fichier

        // On utilise try/catch pour gérer l'erreur potentielle d'absence de 
        // fichier sans faire planter le programme
        try { 
            fileReader = new Scanner( new File( file ) );
	    fileReader.useLocale( java.util.Locale.CANADA_FRENCH );
        } catch ( Exception e ) {
            System.err.println( "Erreur : fichier \"" + file + "\" pas trouvé" );
            return; // quitter en cas d'échec
        }

        // En cas de réussite, créer un tableau en lisant le fichier
        Struct[] students = new Struct[ 100 ]; // un tableau assez grand

        // Lire le fichier et assigner les valeurs à nos Struct
        int n = 0; // le nombre de lignes lus
        while ( fileReader.hasNextLine() && n < 100 )
        {
            students[ n ] = new Struct(); // un nouveau Struct à l'index n
            // extraire les valeurs pour cet élève
            students[ n ].name = fileReader.next();
            students[ n ].schoolYear = fileReader.nextInt();
            students[ n ].average = fileReader.nextDouble();
            // passer à la prochaine ligne
            fileReader.nextLine(); 
            n++;
        }
        
        // Fermer le Scanner du fichier pour protéger son contenu
        fileReader.close();

        // Afficher quelques données
        Module.showList( n, students );
        Module.showAverage( n, students );
    }

}
