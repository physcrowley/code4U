import base.*;

public class RunBase {
    public static void main(String[] args) {
        int val = 9;
        System.out.println("Boucle");
        Recursion.loop( val );
        System.out.println("Recursivité");
        Recursion.recurse( val );
    }
}
