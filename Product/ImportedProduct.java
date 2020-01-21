package Product;

public class ImportedProduct extends Product {
  boolean isImported = true;
  double importDuty = .05;

  public ImportedProduct(String productName, double productPrice, Categoory type){
    super(productName, productPrice, type);
  }

  @Override
  public double calcPriceAfterTaxes(){
    priceAfterTaxes = price * salesTaxRate * importDuty;
    return priceAfterTaxes;
  }

}
