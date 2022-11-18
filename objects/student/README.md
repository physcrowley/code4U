# Un exemple d'application qui utilise un objet

Ce package se rapproche du contenu d'un projet Java complet :
* des classes qui définissent des objets (`Student`)
* des classes pour tester les méthodes dans nos objets (`TestStudent`)
* une classe d'application qui utilise les objets (`SchoolApp`)

## Lire le code source

Pour connaître la structure et les fonctionnalités de l'objet, lire le code dans la classe `Student`.

Pour voir quelques exemples de **tests unitaires**, lire le code source dans la classe `TestStudent`. Cette classe inclut :
* une méthode qui teste chacune des méthodes dans la classe Student
* une méthode `main` qui appelle chacune des méthodes de test pour les lancer.

Pour voir la logique de l'application qui simule une année scolaire pour un élève, voir la classe `SchoolApp`. Cette classe inclut :
* des méthodes `private` qui rend le code dans `main` plus lisible en encapsulant les algorithmes pour les différentes parties du programme
* la méthode `main` qui est responsable de :
    * produire l'interface utilisateur (les print et les scan)
    * vérifier les valeurs saisies par l'utilisateur
    * structurer logiquement les appels de fonctions

## Pour compiler et lancer les programmes

### TestStudent
```powershell
javac .\objects\student\TestStudent.java | java objects.student.TestStudent
```

### SchoolApp
```powershell
javac .\objects\student\SchoolApp.java
java objects.student.SchoolApp
```