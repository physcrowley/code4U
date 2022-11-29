package encapsulation.basic;

public class Circle {

    //
    // Champs privés
    //

    private double radius, area, perimeter;
    private String colour;

    //
    // Méthodes accesseurs publiques
    //

    public double getR() { return radius; }
    public double getA() { return area; }
    public double getP() { return perimeter; }
    public String getColour() { return colour; }

    //
    // Méthodes mutateurs publiques
    //

    public void setColour( String c ) { colour = c; }

    public void setR( double r ) {
        // valider le rayon
        if ( r >= 0 ) { radius = r; }
        else {
            System.out.println( "Rayon invalide. Fixé à 0.0");
            radius = 0; 
        }

        // modifier les valeurs des champs dépendants
        // (ces champs n'ont pas de mutateurs puisque leurs
        // valeurs dépendent entièrement de la valeur de radius)
        area      = Math.PI * radius * radius;
        perimeter = Math.PI * 2 * radius;
    }

    //
    // Méthode constructeur publique
    //

    public Circle( double r, String c ) {
        // utiliser le mutateur engage toute la validation
        // et les calculs dépendants
        setR( r );

        // assignation directe, équivalente à l'utilisation
        // de son mutateur
        colour = c;
    }
    
}
