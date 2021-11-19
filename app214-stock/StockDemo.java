import java.util.Random;

/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random generator = new Random();

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Milk"));
        stock.add(new Product(102, "Chicken"));
        stock.add(new Product(103, "Apple Juice"));
        stock.add(new Product(104, "Bacon"));
        stock.add(new Product(105, "Cheddar Cheese"));
        stock.add(new Product(106, "Pasta"));
        stock.add(new Product(107, "Eggs"));
        stock.add(new Product(108, "Greek Yogurt"));
        stock.add(new Product(109, "Honey"));
        stock.add(new Product(110, "Apple"));
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    /**
     * Allows the stock demo to buy a randomly generated number of stocl for 
     * each product added into the stock demo.
     */
    private void buyProducts()
    {
        Product product;
        int quantity = 1;
        for(int id = 101; id <= 110; id++)
        {
           product = stock.findProduct(id); 
           if(product == null)
           {
               System.out.println("Product" + id + "Not Found");
           }
           else
           {
               quantity = generator.nextInt(20);
               stock.buyProduct(id, quantity);
           }
        }
    }

    /**
     * Allows the stock demo to sell an amount of the previouly bought stock 
     * for each product in a stocklist. 
     */
    private void sellProducts()
    {
       Product product;
        for(int id = 101; id <= 110; id++)
        {
           product = stock.findProduct(id); 
           if(product == null)
           {
               System.out.println("Product" + id + "Not Found");
           }
           else
           {
               stock.sellProduct(id);
           }
        } 
    }    
}