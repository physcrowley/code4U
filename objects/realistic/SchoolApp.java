package objects.realistic;

import java.util.Arrays;
import java.util.Scanner;

public class SchoolApp {

    static Scanner console = new Scanner( System.console().reader() );

    static String[] classes = { 
        "Anglais", "Français", "Maths", "Chimie", "Bio", "Physique", "Droit",
        "Affaires", "Arts", "Musique"};

    static Student player;

    /** code ANSI pour vider la console */
    static final String FLUSH = "\033[H\033[2J";

    public static void main(String[] args) {

        //
        // Acceuil
        //
        System.out.print( FLUSH );
        System.out.println( "=== Bienvenue à l'école! ===\n" );

        System.out.print( "Voulez-vous vous inscrire? [o/n] > ");
        String enter = console.nextLine();
        if ( ! enter.equalsIgnoreCase( "o" ) ) // pas "oui"
        {
            System.out.println( "Au revoir!");
            return; // fin de main / fin du programme
        }

        //
        // Inscription
        //
        System.out.println( FLUSH + "=== Menu d'inscription ===\n" );
       
        System.out.print( "Quel est votre nom? > " );
        player = register( console.nextLine() ); // initialiser l'objet Student
        System.out.println();


        while ( joinClass() ) {} // tout se passe dans la méthode joinClass() : boolean
        if ( player.courses.size() == 0 ) // n'ont pas choisi de cours
        {
            System.out.println( "Au revoir!");
            return; // fin de main / fin du programme
        }

        //
        // Obtenir des notes
        //
        System.out.println( FLUSH + "=== Menu académique ===\n" );
        while ( takeTest() ) {} // tout se passe dans la méthode takeTest() : boolean

        //
        // Fin du programme
        //
        System.out.println( FLUSH + "Au revoir, " + player.name + "!\n" );
        System.out.println( "Voici votre relevé de notes :" );
        printTranscript();
    }


    private static Student register( String name )
    {
        return new Student( name, 1 );
    }
    

    private static boolean joinClass()
    {
        System.out.print( "Inscrivez-vous à un cours parmis la liste suivante" );
        System.out.println(" ou choisir [q] pour quitter :");
        System.out.println( Arrays.toString( classes ) );
        System.out.print( "\nVotre choix > ");
        String choix = console.nextLine();
        if ( choix.equals( "q" ) ) return false;
        for (String c : classes )
        {
            if ( choix.equalsIgnoreCase( c ) ) 
            {
                player.addCourse( c ); // ajouter un cours
                return true;
            }
        }
        System.out.println( "    Ce n'était pas un choix valide." );
        return true;
    }
    

    private static boolean takeTest()
    {
        // choix du cours
        System.out.print( "Choisir [q] pour quitter ou un cours parmis les" );
        System.out.println( " suivants pour prendre un test.");
        System.out.println( "    " + player.courses.keySet() );
        String choix = console.nextLine();

        if ( choix.equals( "q" ) ) return false; // ne pas prendre de test et quitter

        // la nouvelle note
        double grade = 40.0 + Math.random()*60;

        for ( String course : player.courses.keySet() )
        {
            if ( choix.equalsIgnoreCase( course ) )
            {
                player.updateCourseGrade( course, grade ); // mettre à jour la note
        
                System.out.print("    ");
                if ( grade >= 80 )
                {
                    System.out.println( "Bravo!" );
                }
                else if ( grade > 60 )
                {
                    System.out.println( "Bon! C'est quand même acceptable." );
                }
                else
                {
                    System.out.println( "Cela vous mérite un appel aux parents!" );
                }
                return true;
            }
        }
        System.out.println( "    Ce n'était pas un choix valide." );
        return true;
    }


    private static void printTranscript()
    {
        System.out.println( player );
        System.out.println();
        System.out.printf("%-10s %-10s\n", "Cours", "Moyenne" );
        System.out.println("---------- ----------" );
        for ( String s : player.courses.keySet() )
        {
            System.out.printf("%-10s %10.1f\n", s , player.courses.get( s ) );
        }
        System.out.println();
    }
    
}
