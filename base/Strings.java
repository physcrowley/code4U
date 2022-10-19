package base;

import java.util.Scanner;

/**
 * Copie des exemples dans les notes du cours. 
 * La plupart des méthodes n'ont aucune instruction de sortie. 
 * Le but est de copier chaque instruction ligne-par-ligne dans une session jshell 
 * pour voir le résultat.
 * @author physcrowley (2022-10)
 */
public class Strings {

    /** Instructions à copier dans jshell en lien avec str.charAt(n) */
    static void charAt() {
        char[] s1 = { 'S', 't', 'r', 'i', 'n', 'g' }; 
        char c = s1[ 4 ]; // 'n'

        String s2 = "String"; // plus naturel à créer
        s2.charAt( 4 ); // 'n'
    }

    /** Instructions à copier dans jshell en lien avec str.length() */
    static void length() {
        "abcdefghijklmnopqrstuvwxyz".length(); // 26

        String phrase = "Mais bon!";
        phrase.length(); // 9
    }

    
    /** Instructions à copier dans jshell en lien avec str.substring(i, f) */
    static void subString() {
        "maillot".substring( 1, 4 ); // "ail"
        
        String[] jours = { "lundi", "mardi", "mercredi", 
                    "jeudi", "vendredi", "samedi", "dimanche" };
        for ( String j : jours ) {
            System.out.println( j.substring( 0, 3 ) ); // "lun", "mar", …
        }
    }

    /** Instructions à copier dans jshell en lien avec str.indexOf(sub) */
    static void indexOf() {
        String fruit = "banane";
        fruit.indexOf("n"); // 2
        fruit.indexOf("ana"); // 1
        fruit.indexOf("d"); // -1
    }

    /** Instructions à copier dans jshell en lien avec la modification de casse */
    static void upperLower() {
        String affirmative = "Yes";
        affirmative.toUpperCase(); // "YES"
        affirmative.toLowerCase(); // "yes"
    }

    /** Méthode à copier et à appeler dans jshell en lien avec str.equals(otherStr) */
    static void equals() {
        var input = new Scanner( System.console().reader() );

        String s1 = "blé";

        char[] c = {'b', 'l', 'é'};
        String s2 = new String( c );

        System.out.print("Taper 'blé' > ");
        String s3 = input.next().toLowerCase();

        System.out.printf( "\ns1=%s  s2=%s  s3=%s\n\n", s1, s2, s3 );
        System.out.println( "   ==   contre  a.equals(b)");
        System.out.printf( " %b            %b\n", s1 == s2, s1.equals(s2) );
        System.out.printf( " %b            %b\n", s1 == s3, s1.equals(s3) );
        System.out.printf( " %b            %b\n", s3 == s2, s3.equals(s2) );
    }

    /** Instruction à copier dans jshell en lien avec str.strip() */
    static void strip() {
        "   Maria ".strip(); // "Maria"
    }

    /** Instructions à copier dans jshell en lien avec str.replace(old, new) */
    static void replace() {
        String engDecimal = "2,37".replace( ",", "." ); // "2.37"
        double n = Double.parseDouble( engDecimal ); // convertit le String en double
    }

    /** Instructions à copier dans jshell en lien avec str.split(sub) */
    static void split() {
        "2,37;1,47;9,72;-2,31".split(";"); // { "2,37", "1,47", "9,72", "-2,31" }
        "2,37; 1,47; 9,72; -2,31".split("; "); // { "2,37", "1,47", "9,72", "-2,31" }
        "Les mots d'une phrase".split(" "); // { "Les", "mots", "d'une", "phrase" }
    }
}
