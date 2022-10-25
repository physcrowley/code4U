package base;

/**
 * COMMENTAIRE DE DOCUMENTATION - ou JAVADOC (/** ... ) 
 * 
 * Ce texte apparaît quand vous passez votre curseur sur le nom de la classe. On s'en 
 * sert surtout pour écrire l'en-tête d'un programme en incluant :
 * <ul>
 *   <li>une description du programme</li>
 *   <li>l'identifiant de l'auteur et la date</li>
 * </ul>
 * <p>
 * On peut aussi écrire du javadoc pour les méthodes et les champs d'une classe.
 * 
 * @author physcrowley ( 2022-10 )
 * 
 */    // fin du javadoc avec */

public class Commentaires { // tout code en Java est placé dans une classe

    //
    // À l'intérieur des classes on peut trouver seulement
    // deux choses :
    //    * des méthodes (qu'on appelle aussi des fonctions)
    //    * des propriétés (qu'on appelle aussi des champs ou des variables de classe)
    //
    // NOTAMMENT : on ne peut pas écrire des instructions directement dans la
    // classe... il faut les placer dans une méthode (comme main)
    //

    public static void main(String[] args) { // méthode principale de tout programme
        
        //
        // COMMENTAIRE DE LIGNE (// ...)
        //
        // Ces commentaires sont généralement placés :
        //
        // * à la fin d'une ligne pour expliquer une déclaration de variable
            
            int N = 100; // taille fixe du tableau
            int[] items = new int[ N ];
        
        // * juste devant une boucle ou une sélection pour dire ce qu'ils 
        //   font (la logique)

            // passer à travers chaque item
            for (int i = 0; i < items.length; i++) { }

        //

        /*
         * COMMENTAIRE DE BLOC (/* ... )
         *  
         * Les commentaires sont ignorés par javac quand on compile.
         * 
         * Ils sont là pour vous aider à vous rappeler ce que
         * vous avez fait/pensé et pour aider vos collèques
         * à comprendre votre code.
         * 
         * Dans le cours, c'est aussi pour montrer à
         * l'enseignant que vous avez compris ce que vous
         * avez fait.
         *  
         */    // fin du commentaire de bloc avec */

         /* Cet algorithme applique la technique de Héron pour les
          * racines carrés, notamment en calculant à répétition une approximation
          * de la solution jusqu'à ce que l'écart entre les deux plus récents
          * résultats soit à la précision voulue 
          */
        int e = 0; // pour éviter d'entrer dans une boucle (vide) infinie
        while ( e > 0.001 ) {
            
        }

    }
    
}
