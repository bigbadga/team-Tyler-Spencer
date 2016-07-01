package byui.cit260.mansion.view;
import byui.cit260.mansion.control.BackpackControl;
import exception.BackpackControlException;
import java.util.Scanner;

/**
 *
 * @author che11_000
 */
public class AgefunctionView extends View{
    
     
    private String agefunction;
    public AgefunctionView(){
        super (  "\nThis is one of the IDs you got from suspects.   "
              + "\n"
              + "\n                                                            "
              + "\n------------------------------------------------------------"
              + "\n|                  Person Identification                   |"
              + "\n------------------------------------------------------------"
              + "\n| Name: Bryan Cook     G: Male                             |"
              + "\n| Birthday:73-5-16                                         |"
              + "\n| Country: Nigra (found in 1905)                        |"
              + "\n------------------------------------------------------------"
              + "\nWhat is this suspect's age?"
              + "\n(calculate the age or press Q to quit.)");
                      
    }
    
    

    public boolean doAction(String value) {
        // convert choice to long number
        long age=Long.parseLong(value);
        
        // call calcAge and pass the date and puntry years
        
        try{
        boolean answer=BackpackControl.checkAge(73, 1905, age );
        } catch(Throwable msg){
        System.out.println(msg.getMessage());
        msg.printStackTrace();
        
        }finally{
        System.out.close();
        }
        // if age returned is negative
        
       // if (answer==true){ 
        //System.out.println("\n*** This is right, the age will now be stored in the suspect files.***");
        
       // }
        //else {
        //System.out.println("\n*** Please try again.***");
        
        //}   
                
        return true;
    }
}
    //}
   

    
        
    
    
