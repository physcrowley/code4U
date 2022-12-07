public class Static {
    public static void main(String[] args) {
        Obj a = new Obj("A");
        System.out.println( a.name + ", " + a.id + " de " + Obj.count );
        
        Obj b = new Obj("B");
        System.out.println( b.name + ", " + b.id + " de " + Obj.count );
        System.out.println( a.name + ", " + a.id + " de " + Obj.count );
    }
}

class Obj{
    static int count = 0; // appartient à la classe
    String name;
    int id;

    Obj( String s )
    {
        count++;
        this.name = s;
        this.id = count;
    }
}
