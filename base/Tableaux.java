package base;

/**
 * Copie des exemples dans les notes du cours. Les méthodes {@code numsStats} et {@code
 * declarations} n'ont pas d'instructions de sortie. Le but est de copier chaque
 * instruction ligne-par-ligne dans une session jshell pour voir le résultat.
 * @author physcrowley (2022-10)
 */
public class Tableaux {

    /** Instructions à copier dans jshell en lien avec un tableau */
    static void numsStats(){
        int[] nums = {72, 51, 32, 94, 10, 61, 85, 76, 42, 20};
        int val, stat;
        val  = nums[ 0 ];
        val  = nums[ 5 ];
        stat = nums.length;
        val  = nums[ nums.length  - 1 ];
    }
    
    /** 
     * Instructions à copier dans jshell en lien avec la déclaration
     * d'une variété de tableaux.
     */
    static void declarations() {
        // vides (valeurs par défaut) avec taille spécifique        
        int[] numbers = new int[ 1000 ];
        String[] names = new String[ 35 ];
        double[] averages = new double[ 100 ];
        char[] symbols = new char[ 97 ];

        // déclarés avec une liste de valeurs littérales
        String[] jours = { "lundi", "mardi", "mercredi",
            "jeudi", "vendredi", "samedi", "dimanche" 
        };
        String jour = jours[ 3 ];

        double[] prix = { 1.99, 5.99, 9.99, 14.99, 19.99, 149.99 };
        double dernier = prix[ prix.length - 1 ];
    }

    private static int[] nums = {72, 51, 32, 94, 10, 61, 85, 76, 42, 20};

    static void traverseWithWhile() {
        int i = 0; // i représente l'index
        while ( i < nums.length ) {
            System.out.print( nums[ i ] + " " ); 
            // ou autre(s) opération(s) avec nums[i]
            i++;
        }
        System.out.println();
    }

    static void traverseWithFor() {
        for ( int i = 0; i < nums.length; i++ ) {
            System.out.print( nums[ i ] + " " ); 
            // ou autre(s) opération(s) avec nums[i]
        }
        System.out.println();
    }

    private static String[] jours = { "lundi", "mardi", "mercredi",
                        "jeudi", "vendredi", "samedi", "dimanche" };

    static void traverseWithForEach() {
        for ( String jour : jours ) { // se lit "For each jour in the array jours"
            System.out.print( jour + " " ); 
            // ou autre opération avec la valeur de l'élément
        }
        System.out.println();
    }
    
}
