
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Name
 * @version 0.1
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("add"))
        {
            addProduct();   
        }
        else if(choice.equals("remove"))
        {
            removeProduct();   
        }
        return false;
    }
   
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    private void addProduct()
    {
        System.out.println("Adding a new Product");
        System.out.println();
        
        int id = reader.getInt("Please Enter a Product ID > ");
        String name = reader.getString("Please enter the product name > ");
        
        
      
        Product checkproduct = stock.findProduct(id);
        
         if(checkproduct != null)
        {
            System.out.println("Error : Item Already Exists");
        }
        else
        {
            Product product = new Product(id, name);
            stock.add(product);
            System.out.println("Item Successfully Added");
        }
        stock.print();
    }
    
    private void removeProduct()
    {
        System.out.println("Remove a Product");
        System.out.println();
        
        int id = reader.getInt("Please Enter a Product ID > ");
        String name = reader.getString("Please enter the product name > ");
        
        Product product = stock.findProduct(id);
        
        if(product !=null)
        {
            stock.remove(id);
            System.out.println("Successfully Removed Item");
        }
        else
        {
            System.out.println("Error : Could Not Find Item");
        }
        stock.print();
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Jessica Leach");
        System.out.println("********************************");
    }
}