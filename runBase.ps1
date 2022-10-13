# Commandes Java pour compiler et lancer RunBase. Les fichiers de code source dans
# le package base seront également compilés.
#
# USAGE : simplement taper `.\runbase.ps1` dans Powershell à partir de ce dossier
# 
#     Sur Bash ou Zsh, taper `chmod +x ./runBase.ps1` avant la première utilisation 
#     pour rendre le script exécutable.
#

javac ./base/*.java RunBase.java
java RunBase

# Note : si tous les fichiers sont déjà compilés, c'est plus vite de simplement
# lancer `java RunBase` au lieu de lancer ce script