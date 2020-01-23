# Sales Taxes (JAVA) #


## Installation ##

This code challenge was programmed in Java (version 13.0.1) using Visual Studio Code (VSC). In order to properly run this program you'll need to have the Java JDK  downloaded and installed. You can download the JDK for your particular machine [here](https://www.oracle.com/technetwork/java/javase/downloads/jdk13-downloads-5672538.html).


## Running the Program ##

Running the program is really easy! Open up the terminal and:

1. Compile all of the .java files first:
```javac SalesTaxes.java```

2. You'll notice that there is a folder called 'InputReceipts' that holds all three .txt inputs files. You can run the app with any of the three files and the program will print out your "receipt" in the terminal:
```java SalesTaxes InputReceipts/InputReceipt<#>.txt```


## Program Assumptions ##

In the implementation of the Sales Taxes code challenge, some of the assumptions that I make are:

* Input files will always follow a set pattern of:
```quantity - name - price```
* A 'Food' product will contain 'chocolate' in its name.
* A 'Medical' product will contain 'pill' in its name.
* A 'Book' product will contain 'book' in its name.
* A product will always be either imported or 'domestic' but never both.
* Price will always be positive.



## Program Design ##

The program's main method sits in ```SalesTaxes.Java``` , where you'll see that the method is divided into three phases: Parsing Input, Processing Input & Presenting Output.

#### Parsing Input ####
```ParseInputFile.java```, as the name suggests, parses the file by accepting an 'args[0]' parameter to create an ArrayList. The newly created ArrayList is then used to create an order.

#### Processing Input ####
It is in this phase that the bulk of the program lives, especially in the Order.java file. ```Order.java``` is responsible for creating all of the object instances as Product.java as the parent class & ```Book.java``` , ```Food.java``` and ```Medical.java``` as child classes that inherit class members from Product.java. Order.java is also responsible for calculating the tax and total for the import file.

#### Presenting Output ####
Lastly, the ```Receipt.java``` file is responsible for printing out the 'Receipt' back to the user. The Receipt class takes in a ArrayList and loops through it to calculate and print out each products' final price.


## Retrospective ##

