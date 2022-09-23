class Mob{
    String name;
    int health;

    Mob(){
        name = "mob";
        health = 1;
    }

    Mob(int health_p, String name_p, String flavor){
        System.out.println(flavor);
    }

    Mob(String name_p, int health_p){
        name = name_p;
        health = health_p;
    }

    void sound(){
        System.out.println("mob");
    }

    void printAttributes(){
        System.out.println("name: " + name + ", health: " + health);
    }
}