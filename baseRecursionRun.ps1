# Commandes Java pour compiler et lancer base.Recursion.
#
# USAGE : simplement taper `.\baseRecursionRun.ps1` dans Powershell
# à partir de ce dossier
# 
#     Sur Bash ou Zsh, taper `chmod +x ./baseRecursionRun.ps1` avant 
#     la première utilisation pour rendre le script exécutable.
#

javac ./base/Recursion.java
java base.Recursion

# Note : parce que la classe principale qu'on veut lancer se trouve dans un 
# sous-package, il faut spécifier le nom "pleinement qualifié" ou le nom complet 
# de la classe, soit [package].[Classe], dans ce cas base.Recursion