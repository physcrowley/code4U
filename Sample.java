// Classe abstraite : ne peut pas être instanciée
abstract class Animal {
    protected String nom;
    protected int age;
    
    // Constructeur pour les classes enfants
    Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    // Méthode concrète : implémentation fournie
    void dormir() {
        IO.println(nom + " dort paisiblement");
    }
    
    // Méthode abstraite : doit être implémentée par les enfants
    abstract void faireDuBruit();
    abstract void seDeplacer();
}

// Classe concrète qui hérite de Animal
class Chien extends Animal {
    private String race;
    
    Chien(String nom, int age, String race) {
        super(nom, age);  // Appel du constructeur parent
        this.race = race;
    }
    
    // Implémentation obligatoire des méthodes abstraites
    @Override
    void faireDuBruit() {
        IO.println(nom + " aboie : Ouaf! Ouaf!");
    }
    
    @Override
    void seDeplacer() {
        IO.println(nom + " court en remuant la queue");
    }
    
    // Méthode spécifique aux chiens
    void rapporterBalle() {
        IO.println(nom + " rapporte la balle");
    }
}

class Oiseau extends Animal {
    private boolean peutVoler;
    
    Oiseau(String nom, int age, boolean peutVoler) {
        super(nom, age);
        this.peutVoler = peutVoler;
    }
    
    @Override
    void faireDuBruit() {
        IO.println(nom + " chante : Cui cui!");
    }
    
    @Override
    void seDeplacer() {
        if (peutVoler) {
            IO.println(nom + " vole gracieusement");
        } else {
            IO.println(nom + " sautille sur le sol");
        }
    }
}



// Utilisation

/** Structure compatible avec JEP 512 afin de garder l'exemple dans un seul fichier Java*/
void main() {
    // Animal animal = new Animal("Test", 1); // ERREUR: classe abstraite
    
    Chien rex = new Chien("Rex", 3, "Labrador");
    Oiseau tweety = new Oiseau("Tweety", 1, true);
    
    // Polymorphisme : traiter les objets comme des Animals
    Animal[] animaux = {rex, tweety};
    
    for (Animal animal : animaux) {
        IO.println("\n--- " + animal.nom + " ---");
        animal.faireDuBruit();
        animal.seDeplacer();
        animal.dormir();
    }
}
