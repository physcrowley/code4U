# Testing

Ce package inclut des exemples de programmes et de classes pour les tester avec différents algorithmes.

## Instructions

Copier ce package dans votre propre dossier de pratique afin de résoudre les erreurs par les différents moyens proposés.

## Organisation

1. La classe `AlgosErreurs` **implémente** les méthodes utilisant le modèle de "modules", soit de classes contenant des méthodes `static` utiles.
    * Dans cet exemple, les méthodes sont expréssement conçues pour exposer les différents types d'erreurs
    * En général, ce genre de classe sera la base de la logique du programme.
2. La classe `TestAlgosErreurs` **teste** les méthodes d'`AlgoErreurs` individuellement pour vérifier qu'elles produisent des résultats valides.
    * Dans cet exemple, seulement 1 des tests est actif dans le code de démarrage pour réduire la quantité d'information à traiter durant l'apprentissage.
    * En général, 
        * les classes tests incluent une méthode `main` et s'appellent souvent `Test*.java` où * est le nom de la classe à tester.
        * lancent tous leurs tests en même temps
        * utilisent une bibliothèque spécialisée (JUnit) qui offre des outils pour créer des tests plus rapidement et robustement.

