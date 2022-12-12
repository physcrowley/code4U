package base;

import java.util.Locale;
import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.console().reader());

        System.out.println("Entrer des pourcentages (avec .) séparées par des espaces.");
        System.out.println("Taper [Entrée] pour terminer.");

        double sum = 0, count = 0;
        String line = console.nextLine();

        Scanner input = new Scanner(line); // scanner le String
        input.useLocale(Locale.CANADA); // valeurs au format ##.#
        while (input.hasNext()) {
            sum += input.nextDouble();
            count++;
        }
        input.close();
        if (count > 0) {
            System.out.println("La moyenne est : " + sum / count);
        }
    }

}
