package dad.javafx.triangle;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class TriangleController {

	private TriangleModel model = new TriangleModel();
	private TriangleView root = new TriangleView();
	
	public TriangleController() {	
	
		Bindings.bindBidirectional(root.getHeightText().textProperty(), model.heightProperty(), new NumberStringConverter());
		
		Bindings.bindBidirectional(root.getBaseText().textProperty(), model.baseProperty(), new NumberStringConverter());
		
		root.getPerimetroLabel().textProperty().bind(model.perimetroProperty().asString());
	
		root.getAreaLabel().textProperty().bind(model.areaProperty().asString());
		
		root.getTriangleShape().baseProperty().bind(model.baseProperty());
		
		root.getTriangleShape().heightProperty().bind(model.heightProperty());
		
	}
	
	public TriangleView getRoot() {
		return root;
	}
	
}
