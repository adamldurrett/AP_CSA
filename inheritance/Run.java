public class Run {
    public static void main(String[] args){
        Mob mob = new Mob();
        Zombie zom = new Zombie();
        mob.sound();
        zom.printAttributes();
        zom.sound();
        Object husk = new Husk();
        husk = new Drowned();
        husk.printAttributes();
        husk.sound();
    }
}
