# Encapsulation - exemple plus réaliste

Dans cet exemple, nous avons un objet qui représente un personnage dans un jeu, la classe `Player`. Cet objet inclut un champ qui spécifie son type et les types sont définis dans une autre classe, `Spawn`. Les types incluent chacun une arme et les armes sont définies dans la classe `Weapon`.

Tous ces objets ont des champs encapsulés, des constructeurs et des accesseurs.

La classe Player inclut aussi de méthodes mutateurs. Dans le diagramme de classe UML ci-dessous, le champ **types** est souligné pour indiquer que c'est un champ de classe (static) et non un champ d'instance.

![uml](player.png)
