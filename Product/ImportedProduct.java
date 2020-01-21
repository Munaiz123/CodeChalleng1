package Product;

public class ImportedProduct extends Product {
  boolean isImported = true;
  double importDuty = .05;

  public ImportedProduct(String name, double price, String type){
    super(name, price, type);
  }

  @Override
  public String toString(){
    return "Name: " + name + " Price: " + price + " Product Type: " + productType;
  }

  @Override
  public double calcPriceAfterTaxes(){
    priceAfterTaxes = price * ( 1 + salesTaxRate + importDuty);
    return priceAfterTaxes;
  }

}
