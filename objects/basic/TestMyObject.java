package objects.basic;

public class App {
    public static void main(String[] args) {
        // Créer des variables de mon nouveau type
        MyObject a = new MyObject("elf", 100, 82.5); 
        MyObject b = new MyObject("wizard", 65, 93.7); 

        // Afficher leurs informations
        a.display();
        b.display();

        // Ajuster leurs noms
        a.updateName("MegaElf");
        b.updateName("SlimWizard");

        // Ajuster leurs cotes de performance
        a.updateRating(-5);
        b.updateRating(5);

        // Leur assigner des points de dommage
        a.takeDamage( 43 );
        b.takeDamage( 72 );

        // Leur assigner une capsule de santé
        a.healthBoost(15);
        b.healthBoost(15);

        // Vérifier s'ils sont mort
        System.out.println( "Dead?" );
        System.out.println( a.name + " "  + a.isDead() );
        System.out.println( b.name + " "  + b.isDead() );

        // Afficher leurs informations une dernière fois
        a.display();
        b.display();
    }
    
}
