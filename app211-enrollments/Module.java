
/**
 * A class that contains information regarding modules available across courses.
 *
 * @author Jessica Leach
 * @version 8/10/21
 */
public class Module
{
    // instance variables 

    private String code;
    private String title;
    public int credit; 
    

    /**
     * Constructor for objects of class Module, it initialises the module code
     * and the module title.
     */
    public Module(String code, String title)
    {
       // initialise instance variables
        this.code = code;
        this.title= title;
        credit = 0;
    }

    /**
     * Methods for returning values
     *
    */
    public String getCode()
    {
        return this.code;
        
    }
    
    public String getTitle()
    {
        return this.title;
        
    }
    
    public int getCredit()
    {
        return this.credit;
        
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
      /**
     * Print the details of the module including code, title and credit.
     */
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code +  " Module title: " 
                + title + " Module Credit: " + credit );
        System.out.println();
    }
    }

