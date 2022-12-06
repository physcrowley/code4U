# Encapsulation - exemple plus réaliste

Dans cet exemple, nous avons un objet qui représente un personnage dans un jeu, la classe `Player`. Cet objet inclut un champ qui spécifie son type et les types sont définis dans une autre classe, `Spawn`. Les types incluent chacun une arme et les armes sont définies dans la classe `Weapon`.

Tous ces objets ont des champs encapsulés, des constructeurs et des accesseurs.

La classe Player inclut aussi de méthodes mutateurs. Dans le diagramme de classe UML ci-dessous, le champ **types** est souligné pour indiquer que c'est un champ de classe (static) et non un champ d'instance. Les trois classes sont aussi liés par une ligne parce que la classe Player inclut des objets de type Spawn et la classe Spawn inclut des objets de type Weapon.

![uml](./player%20copy.png)

## Code intéressant

À part les exemples plus détaillés d'encapsulation dans les trois classes ci-dessus, il y a aussi quelques éléments de code nouveau à explorer.

### bloc static {}

Dans la classe `Player` on veut s'assurer que les types de joueurs possibles sont connues d'avance, avant de créer une instance. Cette classe a donc une liste static qui s'appelle types. Afin d'ajouter des valeurs à cette liste, on a utilisé un bloc static :
```java
static {
    types.add(...);
    ...
}
```
Vous pouvez lire le commentaire de bloc dans le code source pour plus de détails.

### Méthode equals() personnalisée

Pour comparer nos nouveaux types, il faut utiliser la méthode equals() parce que ce ne sont pas simplement des valeurs primitives comme des int, des double ou des boolean. Une méthode par défaut existe, mais une méthode personnalisé pour le type Weapon a été écrite.

Vous pouvez lire le commentaire de bloc dans le code source pour plus de détails.

## Pour compiler et lancer le programme

Le programme test est définie dans la classe TestPlayer. Utiliser les commandes suivantes

```powershell
javac .\encapsulation\realistic\TestPlayer.java
java encapsulation.realistic.TestPlayer
```

>À l'heure actuelle, le test n'est pas très complet. Essaie d'ajouter d'autres instructions pour tester la santé, la puissance, la découverte d'une arme, le changement d'arme, etc.

