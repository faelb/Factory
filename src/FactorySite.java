public class FactorySite {

    public static void main(String[] args){

    Shoe shoe = ShoeFactory.getShoe("nono");
    shoe.whatAreYou();

    shoe = ShoeFactory.getShoe("sport");
    shoe.whatAreYou();


    }
}
