package jOptionPaneProjects;
 

 
public class InputDialog6c {
 
    public static void main(String[] args) {
 
        Object[] options = {2, "No", 5.6, true};
        Object l = JOptionPane.showInputDialog(null, "Just pick something already!", 
                "Mix & Match", JOptionPane.ERROR_MESSAGE, null, options, options[0]);
 
        if(l instanceof Integer){
            System.out.println("You picked an Integer!");
        }else if(l instanceof String){
            System.out.println("You picked a String!");
        }else if(l instanceof Double){
            System.out.println("You picked a Double!");
        }else if(l instanceof Boolean){
            System.out.println("You picked a Boolean!");
        }
 
    }
 /*
  * import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
  * 
  */


}
