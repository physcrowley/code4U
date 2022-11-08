# Introduction aux objets

Ce package inclut une introduction aux objets, incluant :

* La distinction entre **classe**, **objet** et **instance**
* Le contenu de classes qui forment des objets
* La création d'objets dans un programme


## Distinctions

Voir [la vidéo de Objects First With Java](https://www.youtube.com/watch?v=CPUaTT0Xoo4) pour une courte introduction aux termes 

* classe
* objet
* instance

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

## Du nouveau 🌟 : Un peu sur les HashMap

La classe `Student` inclut un nouvel objet de la bibliothèque standard : un `Map`, concrètement un `HashMap`.

Les caractéristiques des maps, aussi appelés des dictionnaires, sont que les entrées sont des paires **clé : valeur**. La clé peut être n'importe quel type de donnée. On l'utilise pour faire référence à la valeur, qui peut aussi être n'importe quel type de donnée.

Voici [un bref tutoriel sur W3Schools](https://www.w3schools.com/java/java_hashmap.asp).
