# Préparation à l'orienté-objet

Ces exemples introduisent trois idées majeurs :

* **packages** - des emballages de classes (des dossiers) et comment ça influence les commandes `javac` et `java`
* **types** (ou struct ou record ) - des classes qui regroupent uniquement des variables (qu'on appelle des *champs*), nous permettant de décrire un nouveau type de données composé de types existants.
* **modules** - des classes qui regroupent des méthodes à être utilisées par d'autres classes

Le tout se fait en deux parties : simplifiée et réaliste.

## Simplifiée

Le package `prep.basic` inclut trois classes :
* `MyType` (l'exemple d'un nouveau type)
* `MyModule` (l'exemple d'un module)
* `Run` (la classe qui inclut la méthode `main` et qui ressemble aux programmes qu'on connaît déjà)

Ce package est très simple afin de rendre plus clair les idées.

>On lance ce projet avec le script `./runBasicPrep/ps1`. Vous pouvez ouvrir ce fichier pour lire les commentaires et voir les commandes javac et java.

## Réaliste

Le package `prep.realistic` inclut quatre classes :
* `Event` et `Ticket` (nouveaux types)
* `BoxOffice` (le module)
* `Run` (la classe qui inclut la méthode `main` et qui ressemble aux programmes qu'on connaît déjà)

Ce package est plus complexe dans sa structure mais montre comment on pourrait se servir des idées de types et de modules dans un projet qui fait quelque chose d'utile.

>On lance ce projet avec le script `./runRealisticPrep/ps1`. Vous pouvez ouvrir ce fichier pour lire les commentaires et voir les commandes javac et java.
