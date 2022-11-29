# Encapsulation

En programmation orientée objet, le concept d'encapsulation vise à protéger les données en les déclarant `private` dans la classe tout en définissant des méthodes publiques pour les modifier ou pour y accéder. Bref :

* les **champs** de la classe sont `private`
* il y a des méthodes `public` pour accéder aux champs (nommées **accesseurs**) et pour modifier les champs (appelées **mutateurs**)

## Pourquoi?

C'est la responsabilité de la classe d'assurer que les valeurs des champs seront dans des intervalles acceptables qui ne feront pas planter le programme. Si n'importe quelle autre classe peut simplement déclarer une instance de notre classe, p. ex. : `A x = new A();`, et ensuite se mettre à directement modifier les valeurs des champs, p. ex. : `x.name = "Steve"; x.age = -32;`, la classe qui définit l'objet perd la possibilité d'assurer que les valeurs sont valides. Chaque classe devra alors développer du code pour valider ces valeurs, ce qui est une gaspille de temps et une source probable d'erreurs et d'incohérence dans le code.

En rendant les champs `private` et en créant des méthodes `public` qui se chargent de modifier leurs valeurs (mutateurs) ou de retourner leur valeur (accesseurs), la classe peut s'assurer de faire les validations nécessaires. Ainsi, tous les objets créés à partir de cette classe bénéficient de la validation standard, rendant l'ensemble du code plus fiable et facile à corriger s'il y a des problèmes - il faut seulement modifier la classe qui définit l'objet.

## Contexte pour l'exemple

Dans cet exemple la classe `Circle` définit un objet géométrique qui contient quelques champs qui sont interreliées.

Les mutateurs s'assurent que les valeurs assignées aux champs sont valides et que les valeurs des champs dépendants sont mis à jour convenablement.

Les accesseurs rendent les valeurs de chaque champ disponibles publiquement.

La classe `CircleGenerator` produit plusieurs objets de type Circle et utilise ses mutateurs et accesseurs.

## Pour compiler et lancer le programme

### CircleGenerator
```powershell
javac ./encapsulation/basic/CircleGenerator.java
java encapsulation.basic.CircleGenerator
```