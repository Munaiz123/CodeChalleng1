
import java.io.IOException;

public class SalesTaxes {

  public SalesTaxes(){

  }


  public String readFile(String fileName){
    return fileName;
  }

  public static void main(String[] args) throws IOException{

    // SalesTaxes class method of reading a file
    // SalesTaxes newReceipt = new SalesTaxes();
    // System.out.println(newReceipt.readFile(args[0]));

    ReadFile newFile = new ReadFile();
    newFile.parseString(args[0]);


  }
}
