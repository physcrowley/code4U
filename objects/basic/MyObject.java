package objects.basic;

public class MyObject {
    //
    // Champs
    //

    String name;
    int health;
    double rating;

    //
    // Méthode constructeur
    // Cette méthode spéciale est appelée avec le mot-clé new
    //

    public MyObject( String n, int h, double r )
    {
        this.name = n;
        this.health = h;
        this.rating = r;
    }

    //
    // Méthodes pour manipuler les champs
    //

    void updateName( String n ) { this.name = n; }

    void takeDamage( int d )
    {
        this.health -= d; // équivalent à m.health = m.health - d
        if (this.health < 0)
        {
            this.health = 0;
            System.out.println( this.name + " is dead!" );
        }
        else
        {
            System.out.println( this.name + "'s health is " + this.health );
        }
    }

    boolean isDead() { return this.health == 0; }

    void healthBoost( int n )
    {
        if( !isDead() ) this.health += n;
        else System.out.println( "Can't bring them back to life." );
    }

    void updateRating( double d ) { this.rating += d; }

    void display()
    {
        System.out.println( this.name + ": health=" + this.health 
            +", rating="+ this.rating);
    }
}
