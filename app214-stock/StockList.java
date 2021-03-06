import java.util.ArrayList;
import java.util.Random;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;
    
    private Random generator = new Random();

    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product == null)
        {
            System.out.println(product + " NOT FOUND ");
        }
        else
        {
            product.increaseQuantity(amount);
            System.out.println("Bought " + amount + " " + product);
        }
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for (Product product : stock)
        {
            if(product.getID() == productID)
                return product;
        }
        return null;
    }
    
    
    /**
     * Sell one of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID)
    {
        Product product = findProduct(productID);
        int soldStock = generator.nextInt(20);
        if(product != null) 
        {
            if(product.getQuantity() > 0 && product.getQuantity() >= soldStock)
            {
                product.decreaseQuantity(soldStock);
                System.out.println("Sold " + soldStock + " of " + product);
                // printout message
            }
            else
            {
                System.out.println("Not Enough of " + product + " Stock to Sell. ");
                // printout message
            }
        }
        else
        {
            System.out.println("Could Not Find Product: " + product);
            // printout message
        }
    }    

    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Jessica's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
    
    /**
     * Remove a product from the stock list using its ID number.
     */
    public void remove(int productID) 
    {
        Product item = findProduct(productID); 
        
        stock.remove(item);
        System.out.println("Item Removed" + item.getName()); 
    }
    
    /**
     * Print items in the stock list that have a stock value of less than 3.
     */
    public void printLowStock(int amount)
    {
        for (Product product : stock)
        {
        if(product.getQuantity()<amount)
            System.out.println(product);
        }
    }
}