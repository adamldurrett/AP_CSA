class Zombie extends Mob{

    Zombie(){
        super("zombie", 5);
    }

    void sound(){
        System.out.println("BRAAINNSS");
    }

    void cry(){
        System.out.println("wahh");
    }
}