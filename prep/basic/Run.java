package prep.basic;

public class Run {
    public static void main(String[] args) {
        
        // Créer des variables de mon nouveau type
        MyType a = new MyType(); // le mot-clé new crée un objet de ce type
        a.name = "elf";
        a.health = 100;
        a.rating = 82.5;

        MyType b = new MyType();
        b.name = "wizard";
        b.health = 65;
        b.rating = 93.7;

        // Afficher leurs informations
        MyModule.display( a );
        MyModule.display( b );

        // Leur assigner des points de dommage
        MyModule.takeDamage( a, 43 );
        MyModule.takeDamage( b, 72 );

        // Vérifier s'ils sont mort
        System.out.println( "Dead?" );
        System.out.println( a.name + " "  + MyModule.isDead( a ) );
        System.out.println( b.name + " "  + MyModule.isDead( b ) );
    }
}
