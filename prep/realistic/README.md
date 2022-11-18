# prep.realistic

Ce package approfondit les concepts de **types** et de **modules**, notamment :

* L'idée de champs `static` - où liés directement à une classe et non à ses objets. 


## Types

Les classes suivantes définissent des types :
* `Event` - les champs nécessaire pour décrire un événement
    * des **champs d'instance** (chaque objet de type Event aura sa propre copie) : `name`, `capacity`, `tickets`, `full`
    * un **champ de classe** (lié à la classe et non ses objets) : `list`, la liste de tous les événements créés par le programme.
* `Ticket` - les champs nécessaires pour décrire un billet
    * les champs d'instance `name` et `event`

## Module

La classe suivante définit un module :
* `BoxOffice` - les méthodes : `createEvent`, `showEvents`, `findEvent`, `eventIsFull`, `showCart`, `buyTicket`, `printTickets`

## Application

La classe suivante inclut une méthode `main` pour utiliser tous ces outils. Elle inclut aussi quelques méthodes `private` pour rendre le code plus modulaire.
* `Run` - structure l'application de billeterie en utilisant dans un ordre logique les méthodes de `BoxOffice`

# Instructions 

## Lire
Ouvrir les différentes classes et lire le code source pour voir comment les choses sont structurées.

## Compiler et lancer le projet
Vous pouvez simultanément compiler et lancer le programme avec le script `.\prepRealisticRun.ps1`.
