package other;

/**
 * Classe simple pour montrer l'utilisation du paramètre {@code args} de la
 * méthode
 * main.
 * <p>
 * USAGE : compiler et lancer à partir de la racine du projet avec les commandes
 * suivantes : {@code javac ./other/Args.java} et
 * {@code java other.Args [nombres séparés par des espaces]}
 * 
 * @author physcrowley (2022-10)
 */
class Args {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vous devez spécifier des nombres séparés par des espaces.");
        } else {
            int sum = 0;
            for (String s : args) {
                sum += Integer.parseInt(s);
            }
            System.out.println("La somme est " + sum);
        }
    }
}