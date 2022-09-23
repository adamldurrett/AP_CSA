public class Subphyla extends Phyla {
    String subphylaName;
    String subphylaTrait;
    Subphyla(String phylaName_p, String subphylaName_p){
        super(phylaName_p);
        subphylaName = subphylaName_p;

        if(subphylaName=="test"){
            subphylaTrait = "subphyla test trait";
        }
        else{
            subphylaTrait = "not subphyla test trait"; 
        }
    }

    void PrintTrait(){
        System.out.println("    Subphyla: " + subphylaName);
        System.out.println("        trait: " + subphylaTrait);
        super.PrintTrait();
    }
}
