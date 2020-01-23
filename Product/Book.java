package Product;

public class Book extends Product{

  String author;
  String publisher;
  String genre;

  double taxRate;
  double importDuty;
  double salesTax;


  /*   CONSTRUCTOR METHODS FOR BOOK CLASS  */
  public Book(String name, double price, boolean isImported, double salesTax){
    super(name, price, isImported, salesTax);
    if(isImported == true) this.importDuty = .05;
    else this.importDuty = 0;
  }


  @Override
  public double calcTaxRate(){
    this.taxRate = 1 + this.importDuty;
    return taxRate;

  }


  /* WROTE A SETTER METHODS TO DEMONSTRATE
  WHAT OTHER FUNCITONALITY A BOOK CLASS CAN HAVE */

  private void setAuthor(String authorName){
    this.author = authorName;
  }

  private void setPublisher(String publisherName){
    this.publisher = publisherName;
  }

  private void setGenre(String genreCategory){
    this.genre = genreCategory;
  }

}
