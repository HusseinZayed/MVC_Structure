
package Application.View;

import Application.Model.Model;
import javax.swing.JFrame;

 //second step
public class View extends JFrame {
    
    //insert all forms here and desgin
    //and desgin interfce to model
    
    private Model model;

	public View(Model model) {
            
		super("MVC Demo");
		this.model = model;
	}
}
