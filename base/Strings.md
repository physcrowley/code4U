```java

import java.util.Scanner;

/*
 * Copie des exemples dans les notes du cours. 
 * La plupart des méthodes n'ont aucune instruction de sortie. 
 * Le but est de copier chaque instruction ligne-par-ligne dans une session jshell 
 * pour voir le résultat.
 * @author physcrowley (2022-10)
 */


// str.charAt(n)
char[] s1 = { 'S', 't', 'r', 'i', 'n', 'g' }; 
char c = s1[ 4 ]; // 'n'

String s2 = "String"; // plus naturel à créer
s2.charAt( 4 ); // 'n'


// str.length()
"abcdefghijklmnopqrstuvwxyz".length(); // 26

String phrase = "Mais bon!";
phrase.length(); // 9


// str.substring(i, f)
"maillot".substring( 1, 4 ); // "ail"

String[] jours = { "lundi", "mardi", "mercredi", 
            "jeudi", "vendredi", "samedi", "dimanche" };
for ( String j : jours ) {
    System.out.println( j.substring( 0, 3 ) ); // "lun", "mar", …
}

// str.indexOf(sub) 
String fruit = "banane";
fruit.indexOf("n"); // 2
fruit.indexOf("ana"); // 1
fruit.indexOf("d"); // -1


// modification de casse
String affirmative = "Yes";
affirmative.toUpperCase(); // "YES"
affirmative.toLowerCase(); // "yes"

// str.equals(otherStr)
String s1 = "blé";

char[] c = {'b', 'l', 'é'};
String s2 = new String( c );


System.out.printf( "\ns1=%s  s2=%s\n\n", s1, s2 );
System.out.println( "   ==   contre  a.equals(b)");
System.out.printf( " %b            %b\n", s1 == s2, s1.equals(s2) );


// str.strip()
"   Momma mia    ".strip(); // "Momma mia"


// str.replace(old, new)
String engDecimal = "2,37".replace( ",", "." ); // "2.37"
double n = Double.parseDouble( engDecimal ); // convertit le String en double


// str.split(sub) 
"2,37;1,47;9,72;-2,31".split(";"); // { "2,37", "1,47", "9,72", "-2,31" }
"2,37; 1,47; 9,72; -2,31".split("; "); // { "2,37", "1,47", "9,72", "-2,31" }
"Les mots d'une phrase".split(" "); // { "Les", "mots", "d'une", "phrase" }

```

