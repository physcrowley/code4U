# Commandes Java pour compiler et lancer les classes dans le package base.
#
# USAGE : taper `./baseRun.sh [NomDeLaClasse]` dans bash ou zsh
# à partir de ce dossier. P. ex. : `./baseRun.sh Equals` ou `./baseRun.sh Methods`
# 
# Avant la première utilisation, taper `chmod +x ./baseRun.sh`  
# pour rendre le script exécutable.
#

# former les arguments pour javac et java
file="./base/$1.java"
class="base.$1"
# appeler les commandes javac et java
javac $file
java $class

# Note : parce que la classe principale qu'on veut lancer se trouve dans un 
# sous-package, il faut spécifier le nom "pleinement qualifié" ou le nom complet 
# de la classe, soit [package].[Classe], p.ex. `base.Methods` ou `base.Recursion`.