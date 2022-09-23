class AnimalKingdom{
    Phyla phylaOne;
    Phyla phylaTwo;

    AnimalKingdom(){
        phylaOne = new Phyla("Arthropoda");
        phylaTwo = new Phyla("Chordata");
    }

    public static void main(String[] args){
        Animal wolf = new Animal("gray wolf", "teeth","wolf", "test", "chordata", "test");
        wolf.PrintTrait();
    }
}