# Introduction aux objets

Ce package inclut une introduction aux objets, incluant :

* La distinction entre **classe**, **objet** et **instance**
* Le contenu de classes qui forment des objets
* La création d'objets dans un programme

## Liens avec la préparation à l'orienté-objet

Si vous avez trouvé que la séparation des champs et des méthodes dans deux classes séparées - un type et un module - était maladroit et lourd, ce qu'on voit ici sera recomfortant!

Les objets typiques incluent les champs et les méthodes qui les gérent dans la même classe. Ils sont donc une combinaison d'un type et d'un module spécialisé pour gérer le type.

## Distinctions

Voir [la vidéo de Objects First With Java](https://www.youtube.com/watch?v=CPUaTT0Xoo4) pour une courte introduction aux termes 

* classe
* objet
* instance

## Lire le code source

Pour connaître la structure et les fonctionnalités de l'objet qu'on définit, lire la classe `MyObject`. Cette classe inclut :
* le champs de l'objet
* une méthode spéciale qui s'appelle le **constructeur**
* d'autres méthodes pour manipuler les champs de l'objet

Pour voir comment des objets sont créés à partir de la classe `MyObject`, lire la classe `App`. Cette classe contient :
* la méthode `main` qui structure un programme semblable à ce que nous connaissons déjà, tout en déclarant des variables de type `MyObject`.

## Pour compiler et lancer le programme

```powershell
javac .\objects\basic\App.java
java objects.basic.App
```
