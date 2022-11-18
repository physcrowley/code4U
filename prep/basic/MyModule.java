package prep.basic;

/**
 * Une classe regroupant des méthodes utiles à d'autres classes
 * <p>
 * La déclaration {@code static} indique que ce sont des méthodes
 * qui appartiennent à la classe MyModule. Il faut donc les 
 * appeler comme {@code MyModule.display(a) }, soit suivant le
 * nom de la classe. C'est pareil comme les méthodes dans le
 * module Math, p. ex. : {@code Math.sin(0.5)}.
 */
public class MyModule {
    /** Afficher les informations d'un objet MyType */
    static void display( MyType m )
    {
        System.out.println( m.name + ": health=" + m.health 
            +", rating="+ m.rating);
    }

    /** Réduire les point de santé d'un objet MyType */
    static void takeDamage( MyType m, int d )
    {
        m.health -= d; // équivalent à m.health = m.health - d
        if (m.health < 0)
        {
            m.health = 0;
            System.out.println( m.name + " is dead!" );
        }
        else
        {
            System.out.println( m.name + "'s health is " + m.health );
        }
    }

    /** Vérifie si un objet MyType a encore des points de santé */
    static boolean isDead( MyType m )
    {
        return m.health == 0;
    }
}
