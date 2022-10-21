# Testing

Ce package inclut des exemples de programmes et de classes pour les tester avec différents algorithmes.

## Instructions

Copier ce package dans votre propre dossier de pratique afin de résoudre les erreurs par les différents moyens proposés.

## Organisation générale

L'organisation générale est :

1. Classe qui contient des méthodes implémentant différents algorithmes. En programmation orientée-objet, ces classes seront les objets. 
    * **Dans ces exemples** cette class `AlgosErreurs` déclare des méthodes `static` alors les classes au nos. 2 et 3 n'ont pas besoin de créer d'objets.
2. Classe qui rassemblent les algorithmes et l'interface utilisateur du programme. Cette classe inclut une méthode `main` et s'appelle souvent `*Driver.java` ou `*App.java`.
    * **Dans ces exemples** axés sur les tests, il n'y a pas de classe de cette catégorie
3. Classe qui test les méthodes individuellement pour vérifier qu'elles produisent des résultats valides. Ces classes incluent aussi une méthode `main` et s'appellent souvent `Test*.java`.
    * **Dans ces exemples** il y a la classe `TestAlgosErreurs`
