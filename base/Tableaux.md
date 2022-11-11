# Tableaux

Copie des exemples dans les notes du cours. 

>Le but est de copier chaque instruction ligne-par-ligne dans une session `jshell` pour voir le résultat.

```java

//
// Déclarations variées, index, length
//

// déclaration littérale
int[] nums = {72, 51, 32, 94, 10, 61, 85, 76, 42, 20};

nums[ 0 ];
nums[ 5 ];
nums.length;
nums[ nums.length  - 1 ];
   
    
// déclarations vides (valeurs par défaut) avec taille spécifique        
int[] numbers = new int[ 1000 ];
String[] names = new String[ 35 ];
double[] averages = new double[ 100 ];
char[] symbols = new char[ 97 ];

// déclarés avec une liste de valeurs littérales
String[] jours = { 
    "lundi", "mardi", "mercredi","jeudi", 
    "vendredi", "samedi", "dimanche" };
jours[ 3 ];


double[] prix = { 1.99, 5.99, 9.99, 14.99, 19.99, 149.99 };
prix[ prix.length - 1 ];

//
// Algorithmes pour traverser les tableaux
//

// boucle while

int i = 0; // i représente l'index
while ( i < nums.length ) {
    System.out.print( nums[ i ] + " " ); 
    // ou autre(s) opération(s) avec nums[i]
    i++;
}


// boucle for

for ( int i = 0; i < nums.length; i++ ) {
    System.out.print( nums[ i ] + " " ); 
    // ou autre(s) opération(s) avec nums[i]
}


// boucle for each

for ( String jour : jours ) { // se lit "For each jour in the array jours"
    System.out.print( jour + " " ); 
    // ou autre opération avec la valeur de l'élément
}

```
