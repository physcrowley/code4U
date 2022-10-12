class Args
{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("tu dois spécifier des nombres séparés par des espaces.");
        }
        else {
            int sum = 0;
            for ( String s : args )
            {
                sum += Integer.parseInt( s );
            }
            System.out.println("La somme est " + sum );
        }
    }
}