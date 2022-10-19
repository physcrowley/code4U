# Commandes Java pour compiler et lancer base.Methods.
#
# USAGE : simplement taper `.\runBaseMethods.ps1` dans Powershell
# à partir de ce dossier
# 
#     Sur Bash ou Zsh, taper `chmod +x ./runBaseMethods.ps1` avant 
#     la première utilisation pour rendre le script exécutable.
#

javac ./base/Methods.java
java base.Methods

# Note : parce que la classe principale qu'on veut lancer se trouve dans un 
# sous-package, il faut spécifier le nom "pleinement qualifié" ou le nom complet 
# de la classe, soit [package].[Classe], dans ce cas base.Methods