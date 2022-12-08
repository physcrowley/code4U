interface Attack {
    public void attack(); // aucune implémentation
}

class SwordAttack implements Attack {
    public void attack() {
        System.out.println( "Coup d'épée!!!" );
    }
}

class MagicAttack implements Attack {
    public void attack() {
        System.out.println( "Boule de feu!!" );
    }
}

class FistAttack implements Attack {
    public void attack() {
        System.out.println( "Coup de poing!!" );
    }
}

class Player {
    private Attack attack;
    private String type;
    public Player( String t ) { setType( t ); }
    public void setType( String t ) { 
        type = t;
        setAttack(); 
    }
    private void setAttack() {
        if ( type.equals("knight") ) attack = new SwordAttack();
        else if ( type.equals("mage") ) attack = new MagicAttack();
        else if ( type.equals("ninja") ) attack = new FistAttack();
    }
    public String type() { return type; }
    public void attack() { attack.attack(); }
}

public class Test {
    public static void main( String[] args ) {
        Player sir = new Player("knight");
        Player gandalf = new Player("mage");
        Player bruce = new Player("ninja");
        sir.attack();     // "Coup d'épée!!!"
        gandalf.attack(); // "Boule de feu!!"
        bruce.attack();   // "Coup de poing!!"
    }
}