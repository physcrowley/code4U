# Commandes Java pour compiler et lancer prep.Run. Les autres fichiers de code
# source dans le package prep seront également compilés.
#
# USAGE : simplement taper `.\testingRun.ps1` dans Powershell à partir de ce dossier
# 
#     Sur Bash ou Zsh, taper `chmod +x ./prepRun.ps1` avant la première utilisation 
#     pour rendre le script exécutable.
#

javac ./testing/*.java
java testing.TestAlgosErreurs
