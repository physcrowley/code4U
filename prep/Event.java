package prep;

import java.util.ArrayList;

/**
 * Cette classe regroupe les informations associées aux événements, soit :
 * le nom de l'événement et sa capacité, une liste des billets vendus et
 * un drapeau indiquant si l'événement est à capacité.
 * <p>
 * Un exemple de type / struct / record contenant juste des variables de classe
 * (autrement appelées des champs).
 * 
 * Ce type inclut un champ déclaré STATIC. C'est un champ qui appartient à la
 * classe et non aux objets de type Event. 
 * 
 */
class Event 
{

    //
    // Champ STATIC - associée directement à la classe et non à ses objets
    //

    /** Liste de tous les événements */
    static ArrayList<Event> list = new ArrayList<>();

    
    //
    // Champs liés aux objets / instances de la classe
    //
    // Chaque objet de type Event a une copie de ces variables
    // qui contiennent des valeurs qui sont propres à cet objet.
    //
    
    /** Nom de l'événement */
    String name;

    /** Nombre de billets disponibles */
    int capacity;

    /** Liste de tous les billets vendus pour l'événement. */
    ArrayList<Ticket> tickets = new ArrayList<>();

    /** Drapeu à changer quand l'événement atteint sa capacité */
    boolean full = false;

}
