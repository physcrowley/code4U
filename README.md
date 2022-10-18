# Exemples de code pour le cours ICS4U
> version 2022-10

## Utilisation

<details>
    <summary><i>Cliquer pour voir les détails</i></summary>

Les exemples sont préparés pour téléchargement par les élèves du cours ICS4U de M. Crowley. 

Ces exemples sont complémentaires aux leçons présentées en classe et sont souvent la base des exercices.

* Cloner le répertoire sur votre ordinateur
* Si l'enseignant ajoute des nouveaux fichiers, simplement faire un Pull (cliquer sur le bouton synchroniser dans VS Code)
* Vous ne pouvez pas pousser vos changements dans ce dossier. Le partage se fait à sens unique.

</details>




## Structure

<details>
    <summary><i>Cliquer pour voir les détails</i></summary>

>Le terme `package` utilisé dans les prochains paragraphes veut essentiellement dire "sous-dossier". Un package est un emballage Java pour des sous-dossiers.

Des exemples de **classes uniques** se trouvent *dans le package "other"* et devraient être copiés et collés dans vos dossiers de projet (en ajustant la déclaration de `package` pour correspondre à votre structure de projet, au besoin). Ces classes contiennent toutes des méthodes `main` et sont autonomes (ne dépendent pas d'autres classes).

Des exemples de **projets orienté-objet** se trouvent *dans des packages nommés selon la nature du projet*. Généralement, seulement une des classes dans chaque package contiendra une méthode `main` pour lancer le programme. Les autres classes seront :

* des classes qui définissent des objets, des interfaces, des modules ou des structs
* quelques classes (aussi avec des méthodes `main`) pour tester ces objets, etc.

Il peut aussi y avoir des sous-packages dans les packages d'un projet orienté-objet.

</details>

## Projets Maven et "erreurs"

<details>
    <summary><i>Cliquer pour voir les détails</i></summary>

### Fausses alertes

Tous les projets Maven seront aussi inclus ici dans des sous-dossiers, comme s'ils étaient des packages. Parce qu'ils sont, en fait, des projets distincts, le Java Language Server interprète mal la structure globable du dossier, notamment en suggérant :

* qu'il faut changer les déclarations de package
* que plusieurs choses ne peuvent pas être "resolved to a type"

Ce sont toutes **des fausses alertes**!

### Solution

Ouvrez simplement le sous-dossier qui contient le projet Maven dans une nouvelle fenêtre VS Code. Le projet étant maintenant à la racine du dossier, tous les outils de construction automatique du projet fonctionneront comme prévu.

>Si **le problème persiste**, la configuration du workspace a été corrompu. Ouvrir le centre des commandes (Ctrl + Shift + P), taper "Clean...", choisir "Clean Java Language Server Workspace" et accepter de supprimer et recharger l'espace de travail.

### Liste des projets Maven

Ces sous-dossiers sont des projets Maven : `json`

</details>

## Modifier les exemples

C'est important de copier le package (dossier) au complet d'un exemple, idéalement avec l'explorateur de fichiers du système d'exploitation, et le coller dans votre propre projet. Vous pourrez alors les compiler et lancer comme décrit ci-dessous, tout en apportant les modifications demandées dans la pratique et les exercices.

## Compiler et lancer les programmes

<details>
    <summary><i>Cas général</i></summary>


Tous les programmes dans ce répertoire `code4U` sont structurés dans des packages.

Pour compiler un programme il faut inclure le chemin au package et utiliser `*.java` comme nom du fichier code source afin que tous les fichiers dans le package soient compilés. P. ex. pour le package `base` on ferait :

```bash
javac ./base/*.java
```
>S'il y a des sous-packages, il faut aussi ajouter le chemin à chaque sous-package dans cette commande, soit `javac [sous-package1]/*.java [sous-package2]/*.java [package]/*.java`

Ensuite pour lancer la classe principale (ou une classe test), il faut spécifier le nom "pleinement qualifié" (le nom complet) de la classe, soit `[package].[Classe]`. P. ex. : pour la classe principale "Run" dans le package "base" :

```bash
java base.Run
```

<details>
    <summary><i>Script Powershell</i></summary>

C'est aussi possible d'écrire ces deux commandes (javac et java) dans un script powershell (.ps1) et de lancer le script, p. ex. : le script "runBase.ps1". Lire les commentaires dans ce script pour connaître les détails. Si tenter de lancer le script donne un message d'erreur lié à l'Execution_Policy, lancer la commande Powershell suivante :

```powershell
Set-ExecutionPolicy -ExecutionPolicy Unrestricted -Scope CurrentUser
```

Vous aurez maintenant l'autorisation de lancer des scripts sur votre compte.

</details>
<p></p>

>**ATTENTION** : Toutes ces commandes sont lancées dans le Terminal à partir de **la racine du projet**. P.ex. si ce projet se trouve au chemin *~/Documents/code4U* sur le système, le terminal doit être dans ce dossier pour lancer les commandes.

</details>
<p></p>

<details>
    <summary><i>Projets Maven</i></summary>

> Si le sous-dossier du programme n'est pas un package mais plutôt un projet distinct Maven, simplement ouvrir le sous-dossier dans une nouvelle fenêtre et lancer le programme avec le bouton ou le mot `Run`.

</details>

## Répertoire

Cette section duplique le tableau des matières du [manuel du cours](https://bit.ly/manICS4U) tout en associant les packages et les classes spécifiques qui servent d'exemple pour chaque section.

### Revue

Le package `base` inclut ces éléments.

* Générale
* Commentaires et documentation
* Entrée/sortie
* Tableaux et String
* Fonctions et récursivité

### Tester les programmes

Le package `testing` inclut ces éléments.

* Résoudre les erreurs
* Vérifier l'algorithme

### Programmation orienté-objet

#### Préparation à l'orienté-objet

#### Objets

#### Héritage et polymorphisme

#### Structures de données utiles

#### Formats de fichier utiles