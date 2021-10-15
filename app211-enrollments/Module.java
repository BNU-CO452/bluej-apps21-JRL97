
/**
 * A class that contains information regarding modules available across courses.
 *
 * @author Jessica Leach
 * @version 8/10/21
 */
public class Module
{
    // instance variables - replace the example below with your own

    private String code;
    private String title;
    public int credit; 
    

    /**
     * Constructor for objects of class Module
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
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + code +  " Module title: " 
                + title + " Module Credit: " + credit );
        System.out.println();
    }
    }

