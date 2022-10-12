# Commandes Java pour compiler et lancer RunBase
# usage : simplement taper .\runbase.ps1 dans Powershell à partir de ce dossier

javac ./base/*.java RunBase.java
java RunBase

# Note : si tous les fichiers sont déjà compilés, c'est plus vite de simplement
# lancer `java RunBase` au lieu de lancer ce script