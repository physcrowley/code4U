```java
/*
 * Exemples à copier et à valider dans une session jshell
 */

// --------- CARACTÈRES D'ÉCHAPPEMENT ---------------

System.out.println("J'ai dit \"Oui, mon kiki!\""); // J'ai dit "Oui, mon kiki!"

// --------- TEXTE DE FORMAT ---------------

String nom = "Kiki";
String.format( "Mon nom est %s", nom );
String.format( "Mon nom est %S", nom ); // majuscules

String.format( "%d et %d fait %d", 5, 4, 20 )


String firstName = "David", lastName = "Crowley";
System.out.printf( "%s %S\n", firstName, lastName ); // David CROWLEY

int kilo = 1024;
System.out.printf( "En décimal : %d, en hex : %x\n", kilo, kilo ); 
    // "En décimal : 1024, en hex : 400"

// Spécifier une précision pour les valeurs à virgule flottante
double p = 3.1415926535897932385;
double t = 2 * p;
System.out.printf( "Pi : %f, Tau : %f\n", p, t ); // précision par défaut

System.out.printf( "Pi : %.2f, Tau : %.2f\n", p, t ); // précisions spécifiques
System.out.printf( "Pi : %.4f, Tau : %.4f\n", p, t ); 
System.out.printf( "Pi : %.15f, Tau : %.15f\n", p, t );

// Spécifier une largeur fixe pour une valeur
String s;
s = String.format( "%8d  %8d  %8d", 8, 32, 128 ); // largeur de 8
    //        8        32       128
s = String.format( "%-8d  %-8d  %-8d", 8, 32, 128 ); // aligné à gauche
    // 8         32        128     .
s = String.format( "%08d  %08d  %08d", 8, 32, 128 ); // rempli avec des 0
    // 00000008  00000032  00000128

```