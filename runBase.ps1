# Commandes Java pour compiler et lancer RunBase
#
# USAGE : simplement taper `.\runbase.ps1` dans Powershell à partir de ce dossier
# 
# sur Bash ou Zsh, taper d'abord `chmod +x ./runBase.ps1` pour rendre le script exécutable
#

javac ./base/*.java RunBase.java
java RunBase

# Note : si tous les fichiers sont déjà compilés, c'est plus vite de simplement
# lancer `java RunBase` au lieu de lancer ce script