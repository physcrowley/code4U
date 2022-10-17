package json;

/**
 * Classe bidon pour l'exemple de Json dans {@link json.App}
 */
public class ProjectObject {
    //
    // Champs
    //
    private String name;
    private int num;
    private boolean isWhatever;

    //
    // Constructeur
    //
    public ProjectObject( String s, int n, boolean b ) {
        name = s;
        num = n;
        isWhatever = b;
    }

    //
    // Accesseurs
    //
    public String getName() { return name; }
    public int getNum() { return num; }
    public boolean getIsWhatever() { return isWhatever; }

}
