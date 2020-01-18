import java.io.IOException;

public class SalesTaxes {

  public SalesTaxes(){

  }

  public String readFile(String fileName){
    return fileName;
  }

  public static void main(String[] args) throws IOException{

    ParseInputFile newFile1 = new ParseInputFile();
    // ParseInputFile newFile2 = new ParseInputFile();
    // ParseInputFile newFile3 = new ParseInputFile();

    System.out.println("InputReceipt 1:"+ newFile1.parseFile(args[0]));
    // System.out.println("InputReceipt 2:"+ newFile2.parseString(args[1]));
    // System.out.println("InputReceipt 3:"+ newFile3.parseString(args[2]));
  }
}
