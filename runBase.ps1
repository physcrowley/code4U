# Commandes Java pour compiler et lancer base.Run. Les autres fichiers de code
# source dans le package base seront également compilés.
#
# USAGE : simplement taper `.\runBase.ps1` dans Powershell à partir de ce dossier
# 
#     Sur Bash ou Zsh, taper `chmod +x ./runBase.ps1` avant la première utilisation 
#     pour rendre le script exécutable.
#

javac ./base/*.java
java base.Run

# Note 1 : si tous les fichiers sont déjà compilés, c'est plus vite de simplement
# lancer `java base.RunBase` au lieu de lancer ce script

# Note 2 : parce que la classe principale qu'on veut lancer se trouve dans un 
# sous-package, il faut spécifier le nom "pleinement qualifié" ou le nom complet 
# de la classe, soit [package].[Classe], dans ce cas base.Run