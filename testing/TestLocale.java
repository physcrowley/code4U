package testing;

import java.io.File;
import java.io.IOException;
// import java.util.Locale;
import java.util.Scanner;

/**
 * On doit utiliser {@code [Scanner object].useLocale( Locale.CANADA ); } pour
 * la console et pour les fichiers afin de saisir les valeurs {@code double} 
 * avec un {@code .} au lieu d'un {@code ,} afin d'éviter des erreurs d'exécution
 * liées au format des nombres.
 * 
 * @author physcrowley (2022-10)
 */
class TestLocale
{
    private static double d;
    
    public static void console()
    {       
        Scanner console = new Scanner( System.console().reader() );
        // console.useLocale( Locale.CANADA );
        System.out.println( "Entrer une valeur décimale (avec .) > " );
        d = console.nextDouble();
        System.out.println( "Nombre de la console : " + d );
    }

    public static void file()
    {
        // le try/catch nous permet de gérer l'erreur si le fichier n'est pas trouvé
        try 
        { 
            Scanner file = new Scanner( new File( "./data/locale.txt" ) );
            // file.useLocale(Locale.CANADA);
            d = file.nextDouble();
            System.out.println( "Du fichier : " + d );
            file.close();
        } // end of try
        catch (IOException e)
        {
            System.err.println( "Erreur d'ouverture du fichier" );
        } // end of catch
    } // end of main
} // end of TestLocale