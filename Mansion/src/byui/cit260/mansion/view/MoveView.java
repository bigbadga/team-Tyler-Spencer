/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mansion.view;

/**
 *
 * @author che11_000
 */
public class MoveView extends View{

    
            

       public MoveView(){
           super("Where do you want to go? "
                +"\nPlease enter a direction you want to move. (ei, west=W) "
           
           );
       }
    
    
    @Override
    public boolean doAction(String value) {
        
      
        
    
    value=value.toUpperCase();
     switch (value) {
            case "W":
               
                this.moveSpace();
                break;
               case "E":
                
                this.moveSpace();
                break;
               case "N":
                
                this.moveSpace();
                break;
               case "S":
                
                this.moveSpace();
                break;
               default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
     }
     return false;
    }
     
     private void moveSpace() {
     MoveSpaceView movespace = new MoveSpaceView();
        movespace.display();
    
    }
    
    
    
    
   
    
}
