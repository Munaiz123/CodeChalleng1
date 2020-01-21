package Product;

public class ImportedProduct extends Product {
  boolean isImported = true;
  double importDuty = .05;

  public ImportedProduct(String name, double productPrice, String type){
    super(name, productPrice, type);
  }

  @Override
  public String toString(){
    return "Name: " + name + " Price: " + price + " Product Type: " + productType;
  }

  @Override
  public double calcPriceAfterTaxes(){
    priceAfterTaxes = price * salesTaxRate * importDuty;
    return priceAfterTaxes;
  }

}
