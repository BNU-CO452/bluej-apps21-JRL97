
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
        credit = 15;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
        
        System.out.println(" Module Code: " + code + " : " 
                + title + " Credit " + credit );
        System.out.println();
    }
    }

