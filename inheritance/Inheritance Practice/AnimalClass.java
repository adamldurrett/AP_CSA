public class AnimalClass extends Subphyla{
    String classTrait;
    String className;

    AnimalClass(String className_p, String phylaName_p, String subphylaName_p){
        super(phylaName_p, subphylaName_p);
        className = className_p;

        if(className=="test"){
            classTrait = "class trait test";
        }else if(className == "lobster"){
            classTrait = "lobster trait";
        }
    }

    void PrintTrait(){
        System.out.println("    Class: " + className);
        System.out.println("        trait: " + classTrait);
        super.PrintTrait();
    }
}
