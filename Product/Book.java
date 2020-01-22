package Product;

public class Book extends Product{

  String author;
  String publisher;
  String genre;

  double salesTax;

  public Book(String name, double price, boolean isImported, double salesTax){
    super(name, price, isImported, salesTax);
  }

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
