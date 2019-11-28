

package Application;

import Application.Controller.Control;
import Application.Model.Model;
import Application.View.View;


//here Application start
public class Run {
    
    
    public static void main(String [] args)
    {
        
    }
    
    public static void runApp() {
		Model model = new Model();
		View view = new View(model);
		Control controller = new Control(view, model);
	}
}
