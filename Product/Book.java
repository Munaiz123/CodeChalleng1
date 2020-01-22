package Product;

public class Book extends Product{

  String author;
  String publisher;
  String genre;



  public Book(String name, double price, boolean isImported){
    super(name, price, isImported);
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
