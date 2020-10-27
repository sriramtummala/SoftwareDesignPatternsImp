package AdapterPattern;

public class OilInLitre implements OilInLitreInterface {
    public Oil buyOil(double quantityInLitre) {
        System.out.println("Purchasing " + quantityInLitre + " litres of Oil");
        return new Oil(quantityInLitre);
    }
}