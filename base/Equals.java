package base;

import java.util.Scanner;

public class Equals {
    public static void main( String[] args ) {
        var input = new Scanner( System.console().reader() );

        // valeurs littérales (même objets en mémoire)
        String s1 = "blé";
        String s2 = "blé";

        // explicitement un nouvel objet en mémoire
        String s3 = new String( "blé" );

        // les valeurs d'un Scanner créent aussi des nouveaux objets en mémoire
        System.out.print("Taper 'blé' > ");
        String s4 = input.next().toLowerCase();
        System.out.println();

        System.out.println( "s1 = " + s1 + " (littérale \"blé\")" );
        System.out.println( "s2 = " + s2 + " (littérale \"blé\")" );
        System.out.println( "s3 = " + s3 + " (new String( \"blé\" ))" );
        System.out.println( "s4 = " + s4 + " (input.next())\n" );

        System.out.println( "a   b    a == b   a.equals(b)");
        System.out.printf(  "s1  s2   %-6b   %-11b\n", s1 == s2, s1.equals(s2) );
        System.out.printf(  "s2  s3   %-6b   %-11b\n", s2 == s3, s2.equals(s3) );
        System.out.printf(  "s2  s4   %-6b   %-11b\n", s2 == s4, s2.equals(s4) );

        /*
         * La conclusion est que que s1/s2, s3 et s4 pointent à 3 objets différents en mémoire,
         * d'où la sortie 'false' pour les comparaisons avec ==, mais contiennent exactement le
         * même texte, d'où la sortie 'true' avec la comparaison .equals().
         * 
         * Mais Java sauve de l'espace en mémoire avec les déclarations littérales : quand un
         * 2e String contient un texte déjà déclarée, Java va simplement pointer cette variable
         * vers l'objet texte existant, d'où le résultat 'true' pour la comparaison s1 == s2.
         */
    }
}

