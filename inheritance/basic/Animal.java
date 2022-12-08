package inheritance.basic;

public class Animal {
    private String name;
    private int legs;

    public Animal( String n, int legs ) { 
        name = n;
        this.legs = legs; 
    }

    public String name() { return name; }
    public int legs() { return legs; }

    public void eat() {
        System.out.println("eat");
    }
    public void speak() {
        System.out.println("speak");
    }
}
