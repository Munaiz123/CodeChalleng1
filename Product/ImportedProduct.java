package Product;

public class ImportedProduct extends Product {
  boolean isImported = true;
  double importDuty = .05;

  public ImportedProduct(String productName, double productPrice){
    super(productName, productPrice);
  }

}
