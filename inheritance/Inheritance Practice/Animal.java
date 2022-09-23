public class Animal extends Family{
    String name;
    String unique_trait;

    Animal(String name_p, String trait_p, String famName_p, String className_p, String phylaName_p, String subphylaName_p){
        super(famName_p, className_p, phylaName_p, subphylaName_p);
        name = name_p;
        unique_trait = trait_p;
    }

    void PrintTrait(){
        System.out.println("Animal: " + name);
        System.out.println("        trait: " + unique_trait);
        super.PrintTrait();
    }
}
