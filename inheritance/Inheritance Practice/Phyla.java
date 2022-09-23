public class Phyla {
    String phylaName;
    String phylaTrait;

    Phyla(String name_p){
        phylaName = name_p;

        if(phylaName == "chordata"){
            phylaTrait = "has a notochord";
        }
        else if(phylaName == "arthropoda"){
            phylaTrait = "no notochord";
        }
    }

    void PrintTrait(){
        System.out.println("    Phyla: " + phylaName);
        System.out.println("        trait: " + phylaTrait);
    }

}
