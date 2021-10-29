import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock and Nicholas Day
 * @version 0.1 11/Sep/2020
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    
    public ArrayList<Module> modules;
    
    private String code;
    private String title;
    
    private Grades finalGrade;
     
    /** A constructor that acts as a shortcut for creating a course object 
     * without needing to enter any details. 
     */
    public Course()
    {
        this("BT1CTG1", "BSc (Hons) Computing");
    }
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        
        createModules();
    }

    /**
     * Create four modules and add them to the
     * modules list for testing purposes.  These
     * must be your four modules.
     */
    public void createModules()
    {
        Module moduleCO452 = new Module("CO452" , "Programming Concepts");
        addModule(moduleCO452); 
        
        Module moduleCO454 = new Module("CO454" , "Digital Technologies and Professional Practice");
        addModule(moduleCO454); 
        
        Module moduleCO456 = new Module("CO456" , "Web Development");
        addModule(moduleCO456); 
        
        Module moduleCO450 = new Module("CO450" , "Computer Architectures");
        addModule(moduleCO450); 
    }
    
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
    /**
     * 
     */
    public Grades convertToGrade(int mark)
    {
        Grades grade = Grades.NS;
        
        if(mark > Grades.B.getValue()) 
        {
            return Grades.A;     
        }
        else if(mark > Grades.C.getValue())
        {
            return Grades.B;
        }
        else if (mark > Grades.D.getValue())
        {
            return Grades.C;
        }
        else if (mark > Grades.F.getValue())
        {
            return Grades.D;
        }
        else if (mark > Grades.NS.getValue())
        {
            return Grades.F;
        }
        else
            return Grades.NS;
    }
    
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int total = 0; 
        int finalMark = 0;
        
        for(ModuleMark mark : marks)
        {
          total = total + mark.getValue();  
        }
        
        finalMark = total / MAXN_MODULES;
        finalGrade = convertToGrade(finalMark);
        
        return finalGrade;
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        //System.out.println();
        
        printModules();
    }
    
    /**
     * Print the course's four modules
     */
    public void printModules()
    {
        System.out.println("Course Modules");
        System.out.println("--------------");
        System.out.println();
        for (Module module : modules)
        {
            module.print();
            module.printCredit();
        }
    }
}
