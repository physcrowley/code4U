package encapsulation.basic;

public class CircleGenerator {
    public static void main(String[] args) {
        Circle blue = new Circle(1, "bleu");
        Circle red = new Circle(5, "rouge");

        showCircle(blue);
        showCircle(red);

        blue.setColour("cyan");
        red.setColour("bourgogne");

        blue.setR( red.getR() + 2 );

        showCircle(blue);
        showCircle(red);
    }

    private static void showCircle( Circle c ) {
        System.out.printf("%s: r=%.2f, aire=%.2f, périmètre=%.2f\n",
           c.getColour(), c.getR(), c.getA(), c.getP() );
    }
    
}
