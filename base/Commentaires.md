# Exemples de commentaires et de documentation

Les commentaires sont ignorés par `javac` quand on compile.

Ils sont là pour vous aider à vous rappeler ce que
vous avez fait/pensé et pour aider vos collèques
à comprendre votre code.

Dans le cours, c'est aussi pour montrer à
l'enseignant que vous avez compris ce que vous
avez fait.

## Documentation javadoc (`/** ...*/`)

Utilisé pour :
* les en-têtes de classe
* décrire les méthodes, leurs paramètres et leur valeur de retour
* décrire les champs d'une classe

>Ces commentaires spéciaux apparaissent en version formatée quand le curseur est sur le nom de la classe, du champ ou de la méthode qu'ils décrivent.

Un en-tête est toujours requis dans ce cours. Le reste de la documentation dépend de la nature du projet.

```java
package base;

/**
 * Commentaire de documentation (javadoc) utilisé pour l'en-tête.
 * <p>
 * En-tête classique qui fournit une description de la classe et donne
 * le nom de l'auteur de la classe (ou son identifiant GitHub) avec la
 * balise {@code @author}.
 * <p>
 * Vient toujours immédiatement avant la déclaration de la classe, donc
 * APRÈS la déclaration du package et des déclarations des classes
 * importées.
 * 
 * @author physcrowley ( 2022-11 )
 */
public class Commentaires {
}
```

## Explication (de ligne et de bloc)

La documentation est généralement *descriptive*.

Ces commentaires (de ligne et de bloc) sont généralement **explicatifs**.
        
### Commentaire de ligne (`// ...`)

Ces commentaires sont généralement placés :

* à la fin d'une ligne pour expliquer une déclaration de variable
    ```java
    int N = 100; // taille fixe du tableau
    int[] items = new int[ N ];
    ```
* juste devant une boucle ou une sélection (if-else) pour dire ce qu'ils font (la logique)
    ```java
    // passer à travers chaque item
    for (int i = 0; i < items.length; i++) { }
    ```

### Commentaires de bloc (`/* ... */`)

Ces commentaires ont la même utilité que les commentaires de ligne mais peuvent remplacer
une série de plusieurs commentaires de ligne si on sait que le commentaire débordera sur
plusieurs lignes.

```java
/* Cet algorithme applique la technique de Héron pour les
 * racines carrés, notamment en calculant à répétition une approximation
 * de la solution jusqu'à ce que l'écart entre les deux plus récents
 * résultats soit à la précision voulue 
 */
```
