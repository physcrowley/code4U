# Préparation à la programmation orientée-objet

Ce package introduit quelques concepts de base à la programmation orienté-objet :

* La création de nouveaux **types** (parfois appelés struct ou record) : des classes simplement regroupant des informations utiles ensemble
* L'idée d'**objets** (ou **instances** de classes) qui ont chacun leurs copies des variables déclarées dans la **classe** qui définit le type
* L'idée de variables `static` - où liées directement à une classe et non à ses objets
* L'idée de **modules** qui regroupent des méthodes utiles pouvant être utilisées par d'autres classes (comme le module Math de la bibliothèque standard)
* L'idée de méthodes `static` - celles qui doivent être appelées en référant à la classe et non à ses objets.


>Aucune de ces classes - les types/struct/records ou les modules - ne contiennent de méthode `main`. Seulement une classe qui décrit la logique du programme inclut la méthode `main`.

## Types

Les classes suivantes définissent des types :
* `Event`
* `Ticket`

## Modules

La classe suivante définit un module :
* `BoxOffice`

## Application

La classe suivante inclut une méthode `main` pour utiliser tous ces outils. Elle inclut aussi quelques méthodes `private` pour rendre le code plus modulaire.
* `Run`

# Instructions 

## Lire
Ouvrir les différentes classes, notamment les 3 types, et lire le code source pour voir comment les choses sont structurées.

## Compiler et lancer le projet
Vous pouvez simultanément compiler et lancer le programme avec le script `.\prepRun.ps1`.
