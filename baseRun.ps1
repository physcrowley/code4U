# Commandes Java pour compiler et lancer les classes dans le package base.
#
# USAGE : taper `./baseRun.ps1 [NomDeLaClasse]` dans Powershell
# à partir de ce dossier. P. ex. : `./baseRun.ps1 Equals` ou `./baseRun.ps1 Methods`
# 
#     Sur Bash ou Zsh, utiliser plutôt la version `baseRun.sh` qui contient
#     la syntaxe appropriée pour traiter les arguments Linux/MacOS
#

# former les arguments pour javac et java
$file = "./base/" + $args[0] + ".java"
$class = "base." + $args[0]
# appeler les commandes javac et java
javac $file
java $class

# Note : parce que la classe principale qu'on veut lancer se trouve dans un 
# sous-package, il faut spécifier le nom "pleinement qualifié" ou le nom complet 
# de la classe, soit [package].[Classe], p.ex. `base.Methods` ou `base.Recursion`.