package objects.student;

import java.util.HashMap;
import java.util.Map;

public class Student {

    //
    // ATTRIBUTS / PROPRIÉTÉS / CHAMPS DE LA CLASSE
    //

    String name;
    int id;
    Map<String, Double> courses; // clé : nom du cours, valeur : moyenne
    double average;

    //
    // CONSTRUCTEURS DE LA CLASSE
    // Ces méthodes spéciales initialisent les champs quand un
    // objet est déclaré avec le mot-clé `new`
    //

    public Student( String n, int id )
    {
        this.name = n;
        this.id = id;
        this.courses = new HashMap<String, Double>(); // vide
        this.average = 0.0;
    }

    //
    // MÉTHODES DE LA CLASSE
    //

    void addCourse( String c )
    {
        if ( ! this.courses.containsKey(c) ) // pas déjà présent
        {
            this.courses.put( c, 0.0 );
            System.out.println( "Ajouté : " + c + " à l'horaire de " + this.name );
        }
        else 
        {
            System.out.println( "Le cours " + c + " est déjà à l'horaire de " + this.name );
        }
    }

    void updateCourseGrade( String c, double g )
    {
        if ( this.courses.containsKey(c) ) // présent
        {
            this.courses.replace( c, g ); // remplace la valeur existante
            System.out.println( "Mis à jour : " + c + " : " + g );
            
            // appel de la méthode privée pour mettre à jour la moyenne globale
            updateAverage(); 
        }
        else 
        {
            System.out.println( "Le cours " + c 
            + " n'est pas dans l'horaire de " + this.name );
        }
    }

    /** 
     * Une méthode privée est seulement utilisée par les autres méthodes de la 
     * classe. C'est une méthode d'appui.
     */
    private void updateAverage()
    {
        if (this.courses.size() == 0 ) // vide
        {
            return; // ne fait rien
        }
        // calcule la moyenne et l'assigner à average
        double sum = 0.0;
        for (double grade : this.courses.values() ) 
        {
            sum += grade;
        }
        this.average =  sum / this.courses.size();
    }


    /** 
     * Méthode spéciale qui convertit l'objet en texte pour affichage
     * lorsqu'on l'imprime.
     */
    @Override
    public String toString()
    {
        String s = 
            String.format( "%s\n    ID : %08d, Moyenne : %.1f, Cours : %s", 
            this.name, this.id, this.average, this.courses.keySet().toString() );
        return s;
    }

}
