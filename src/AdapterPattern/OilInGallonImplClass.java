package AdapterPattern;

public class OilInGallonImplClass extends OilInLitre implements OilInGallonInterface {
    @Override
    public Oil buyOilInGallon(double quantityinGallon) {
        double quantityInLitres = convertGallonToLitre(quantityinGallon);
        return buyOil(quantityInLitres);
    }

    private double convertGallonToLitre(double gallonQuantity) {
        return gallonQuantity * 3.78541;
    }
}
