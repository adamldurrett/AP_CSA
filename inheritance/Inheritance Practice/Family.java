class Family extends AnimalClass{
    String familyName;
    String familyTrait;
    Family(String famName_p, String className_p, String phylaName_p, String subphylaName_p){
        super(className_p, phylaName_p, subphylaName_p);
        familyName = famName_p;
        
        if(familyName=="shark"){
            familyTrait = "its a shark";
        }
        if(familyName=="wolf"){
            familyTrait = "howls";
        }
    }


    void PrintTrait(){
        System.out.println("    family: " + familyName);
        System.out.println("        trait: " + familyTrait);
        super.PrintTrait();
    }
}