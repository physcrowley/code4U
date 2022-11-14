package prep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 
 * Utilise les types {@link Event} et {@link Ticket} ainsi que le
 * module {@link BoxOffice} pour créer une application qui simule l'achat de
 * billets pour des événements.
 * 
 * @author physcrowley (2022-11)
 */
public class Run {

    /** Lecteur de console disponible à toutes les méthodes de la classe */
    static Scanner console = new Scanner( System.console().reader() );

    /** Liste des billets réservés */
    static List< Ticket > tickets = new ArrayList<>();

    /** 
     * Simule une application d'achat de billets pour des événements
     */
    public static void main(String[] args) 
    {
        System.out.println( "========== Maître des Billets ===========\n");
        createDefaultEvents();
        
        boolean admin = chooseMode();
        if ( admin ) editEvents();

        System.out.println( "\n~~~~~~~~~~~ Billeterie ~~~~~~~~~~~~" );
        buyTickets();
        System.out.println();
        if ( tickets.size() > 0 ) BoxOffice.printTickets( tickets );

        System.out.println( "\nMerci! À la prochaine!" );
    }

    
    /** Créer quelques événements par défaut */
    private static void createDefaultEvents()
    {
        BoxOffice.createEvent( "Spectacle de cuillères", 15 );
        BoxOffice.createEvent( "La magie de Newton", 50 );
    }


    /** 
     * Offre un choix de modes
     * @return true pour mode administrateur, false pour mode client
     */
    private static boolean chooseMode()
    {
        System.out.print( "Entrer en mode administrateur? [o/n] > ");
        String answer = console.nextLine();
        if ( answer.equalsIgnoreCase( "o" ) ) return true;
        if ( answer.equalsIgnoreCase( "n" ) ) return false;
        return chooseMode(); // récursif si aucune réponse valide
    }

    /** 
     * Utilise le module {@link BoxOffice} pour ajouter un événement directement
     * dans le champ static {@code Event.list}. 
     */
    private static void editEvents()
    {
        System.out.println( "Mode administrateur - ajout d'événements" );
        BoxOffice.showEvents();
        
        adminPrint( "Taper le nom d'un événement à ajouter ['q' pour quitter] > ");
        String name = console.nextLine();
        if ( name.equalsIgnoreCase( "q" ) ) return; // quitter
        
        adminPrint( "Entrer la capacité maximale de l'événement > " );
        int cap = console.nextInt();
        console.nextLine(); // jeter le retour de ligne
        
        BoxOffice.createEvent(name, cap);

        while (true) // répéter en cas de réponse invalide
        {
            adminPrint( "Ajouter un autre événement? [o/n]? > ");
            String another = console.nextLine();
            if ( another.equalsIgnoreCase( "n" ) ) return; // quitter
            if ( another.equalsIgnoreCase( "o" ) ) editEvents(); // récursif
        }
    }

    /** Ajoute un préfixe à {@code System.out.print}  */
    private static void adminPrint( String s )
    {
        String pre = "[admin] ";
        System.out.print( pre + s );
    }

    /** Afficher la liste des événements et donner l'option de réserver des billets */
    private static void buyTickets()
    {
        if ( Event.list.size() == 0 )
        {
            System.out.println( "Aucun événement à venir." );
            return; // quitter
        }
        
        BoxOffice.showEvents();

        String acheter = "";
        while ( !( acheter.equalsIgnoreCase("o") || acheter.equalsIgnoreCase("n") ) )
        {
            System.out.print( "\nVoulez-vous réserver des billets [o/n]? > ");
            acheter = console.nextLine();
        }
        if ( acheter.equalsIgnoreCase( "o" ) )
        {
            processTransaction();
            buyTickets(); // récursif jusqu'à ce que la réponse soit "n"
        }
        return; // cas de base ("n")
    }


    /** Obtenir les informations pour le choix des billets et traiter la réservation */
    private static void processTransaction()
    {
        // chosir un événement
        System.out.print( "Taper le nom de l'événement > " );
        String eventName = console.nextLine();
        Event e = BoxOffice.findEvent( eventName );
        if ( e == null )
        {
            System.out.println( "Choix invalide. Transaction annulée." );
            return; // quitter
        }
        if ( e.full )
        {
            System.out.println( "Il ne reste plus de billets" );
            return; // quitter
        }
        
        // choisir la quantité
        int remaining = e.capacity - e.tickets.size();
        System.out.println( "Combien de billets? (" + remaining + " restant) > " );
        int quantity = console.nextInt();
        console.nextLine(); // jeter le retour de ligne
        if ( quantity > remaining || quantity < 1 )
        {
            System.out.println( "Quantité invalide.");
            return; // quitter
        }

        // inscrire votre nom
        System.out.print( "Taper le nom à imprimer sur le billet > ");
        String buyerName = console.nextLine();

        // vérifier et traiter la commande
        BoxOffice.showCart( e, buyerName, quantity );
        System.out.print( "Confirmer la réservation de ces billets? [o/n] > ");
        if ( console.nextLine().equalsIgnoreCase( "o" ) ) 
        {
            for ( int i = 0; i < quantity; i++ ) 
            {
                tickets.add( BoxOffice.buyTicket( e, buyerName ) );
            }
        }
        else
        {
            System.out.println( "Transaction annulée." );
        }
    }
}
