package dad.javafx.circle;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class CircleController {

	private CircleModel model = new CircleModel();
	private CircleView root = new CircleView();
	
	public CircleController() {	
	
		Bindings.bindBidirectional(root.getAltoText().textProperty(), model.radioProperty(), new NumberStringConverter());
		
		root.getPerimetroLabel().textProperty().bind(model.perimetroProperty().asString());
	
		root.getAreaLabel().textProperty().bind(model.areaProperty().asString());
		
		root.getCircleShape().radiusProperty().bind(model.radioProperty());
		
	}
	
	public CircleView getRoot() {
		return root;
	}
	
}
