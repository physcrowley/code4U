package prep;

/**
 * Exemple d'une classe qui ne contient que des champs de données. 
 * Dans certains langages ce type d'objet s'appelle un "record" ou 
 * un "struct".
 */
public class Struct {

    /** Le nom de l'élève */
    public String name;

    /** L'année scolaire, de 1 à 12 */
    public int schoolYear;

    /** La moyenne académique */
    public double average;

     /*
     * Mot-clé PUBLIC
     * 
     * Afin que les variables name, schoolYear et average soient accessibles
     * à des classes externes à Struct, il faut les déclarer `public`.
     * 
     * Voilà, c'est tout!
     * 
     * C'est la même chose pour les méthodes `public`.
     */

}
