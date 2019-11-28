
package Application.Controller;

import Application.Model.Model;
import Application.View.View;

//third step
public class Control {
    
    //The Controller exists between the view and the model.
    //It listens to events triggered by the view 
    
        private View view;
	private Model model;
	
	public Control(View view, Model model) {
		this.view = view;
		this.model = model;
	}
}
