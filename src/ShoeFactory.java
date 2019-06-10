public class ShoeFactory {

    public static Shoe getShoe(String s) {
        Shoe chosenshoe = null;
        if (s.equalsIgnoreCase("casual")) {
            chosenshoe = new Casualshoe();
        }else
        if (s.equalsIgnoreCase("sport")) {
            chosenshoe = new Sportshoe();
        }else
        if (s.equalsIgnoreCase("nono")) {
            chosenshoe = new Sandals();
        }

        return chosenshoe;
    }

}