package prep;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Cette classe déclare plusieurs méthodes {@code static} qui sont utiles
 * dans une application de gestion de billets pour des événements.
 * 
 * @author physcrowley
 */
class BoxOffice {

    /** 
     * Met à jour la liste d'événements
     * @param n le nom de l'événement
     * @param c la capacité (nombre limite de billets) pour l'événement
     * @return l'Event créé (ou existant s'il existe déjà)
     */
    static Event createEvent( String n, int c )
    {
        for ( Event e : Event.list )
        {
            if ( e.name.equals( n ) )
            {
                System.out.println( "Un événement de ce nom existe déja : " + n );
                // retourner l'événement existant
                return e;
            }
        }
        
        // créé l'événement et lui assigner les valeurs
        Event e = new Event();
        e.name = n;
        e.capacity = c;

        // ajouter l'événement à la liste static (de la classe)
        Event.list.add( e );

        // retourner le nouvel événement
        return e;
    }

    /** Afficher les événements existant, incluant s'ils sont à capacité */
    static void showEvents()
    {
        System.out.println( "\nVoici la liste des événements à venir");
        for ( Event e : Event.list )
        {
            int available;
            if ( e.full ) available = 0;
            else available = e.capacity - e.tickets.size();
            
            System.out.println("   - " + e.name + " [" + available + "]" );

        }
    }

    /** 
     * Trouver un Event à partir de son nom
     * @return l'Event
     */
    static Event findEvent( String name )
    {
        for ( Event e : Event.list )
        {
            if ( name.equals( e.name ) ) return e;
        }
        // échec ... essaye avec le nom partiel
        for ( Event e : Event.list )
        {
            if ( e.name.contains(name) ) return e;
        }
        // échec
        return null;
    }

    /** Afficher le choix */
    static void showCart( Event e, String n, int q )
    {
        System.out.println( "Voici ce que vous avez choisi :" );
        System.out.println( "Événement : " + e.name );
        System.out.println( "Quantité : " + q );
        System.out.println( "Pour : " + n );
    }


    /** 
     * Vérifie si la capacité pour un événement est atteinte en comparant
     * le nombre de billets vendus avec la capacité de l'événement.
     * @return true l'événement est à pleine capacité
     */
    static boolean eventIsFull( Event e )
    {
        if ( e.tickets.size() == e.capacity )
        {
            return true;
        }
        return false;
    }


    /** 
     * Met à jour e.tickets et e.full
     * @param e l'événément pour lequel on achète un billet
     * @param p le nom du participant qui achète le billet
     * @return le nouveau billet ou {@code null} si e est à capacité 
     */
    static Ticket buyTicket( Event e, String p )
    {
        if ( e.full )
        {
            System.out.println( "Désolé, cet événement est à capacité." );
            return null; // aucun billet
        }

        // créer le nouveau billet
        Ticket t = new Ticket();
        t.event = e;
        t.participant = p;

        // ajouter le billet à la liste des billets vendus pour l'événement
        e.tickets.add( t );

        // mettre à jour le drapeau de capacité de l'événement
        e.full = eventIsFull( e );

        // retourner le nouveau billet
        return t;
    }


    /** Afficher les billets individuels dans un fichier ou à l'écran */
    static void printTickets( ArrayList<Ticket> tix )
    {
        // produire les billets
        StringBuilder output = new StringBuilder();
        for ( Ticket t : tix )
        {
            output.append( "------------------------------------------------------------\n");
            output.append( "  1 billet valide pour " + t.participant + "\n\n" );
            output.append( "  " + t.event.name + "\n" );
            output.append( "------------------------------------------------------------\n");
            output.append( "\n" );
        }

        try
        {
            // écrire le résultat dans un fichier
            String outFile = "./prep/billets.txt";
            FileWriter toFile = new FileWriter( new File( outFile ) );
            toFile.write( output.toString() );
            toFile.close();

            System.out.println( "Voir " + outFile + " pour vos billets." );
        }
        catch ( Exception e )
        {
            // écrire le résultat à l'écran en cas d'erreur
            System.out.println( "Erreur d'écriture au fichier. SVP imprimer cette page." );
            System.out.println( output );
        }        
    }
}
