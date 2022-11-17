public class Static {
    public static void main(String[] args) {
        Obj a = new Obj("A");
        System.out.println( a.name + " " + a.count );
        Obj b = new Obj("B");
        System.out.println( b.name + " " + b.count );
        System.out.println( a.name + " " + a.count );
        System.out.println( "Obj "  + Obj.count );
    }
}

class Obj{
    static int count = 0; // appartient à la classe
    String name;

    Obj( String s )
    {
        count++;
        this.name = s;
    }
}
