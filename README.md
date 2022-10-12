# Exemples de code pour le cours ICS4U
> version 2022-10

## Utilisation

Les exemples sont préparés pour téléchargement par les élèves du cours ICS4U de M. Crowley. 

Ces exemples sont complémentaires aux leçons présentées en classe et sont souvent la base des exercices.

* Cloner le répertoire sur votre ordinateur
* Si l'enseignant ajoute des nouveaux fichiers, simplement faire un Pull (cliquer sur le bouton synchroniser dans VS Code)
* Vous ne pouvez pas pousser vos changements dans ce dossier. Le partage se fait à sens unique.

## Structure

Des exemples de **classes uniques** se trouvent *à la racine de ce dossier* et devraient être copiés et collés dans vos dossiers de projet (en ajoutant la déclaration de `package` de votre projet, au besoin).

Des exemples de **projets orienté-objet** se trouvent *dans des sous-dossiers* et devraient être ouverts comme dossier racine dans votre éditeur de code afin de respecter les déclarations de package dans chacun des projets.

## Ouvrir et lancer les programmes

L'idéal est toujours d'ouvrir le package voulu à sa racine.

Pour compiler et lancer des programmes où les fichiers se trouvent dans différents packages ou sous-packages, il faut inclure chaque package dans la commande javac, p. ex. pour lancer le programme `RunBase`, il faut d'abord le compiler comme ceci :

```bash
javac *.java ./base/*.java
```
ensuite on peut le lancer comme d'habitude avec :

```bash
java RunBase
```