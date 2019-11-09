package dad.javafx.rectangle;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectanguloController {

	private RectanguloModel model = new RectanguloModel();
	private RectanguloView root = new RectanguloView();
	
	public RectanguloController() {	
	
		Bindings.bindBidirectional(root.getAltoText().textProperty(), model.altoProperty(), new NumberStringConverter());
		
		Bindings.bindBidirectional(root.getAnchoText().textProperty(), model.anchoProperty(), new NumberStringConverter());
		
		root.getPerimetroLabel().textProperty().bind(model.perimetroProperty().asString());
	
		root.getAreaLabel().textProperty().bind(model.areaProperty().asString());
		
		root.getRectanguloShape().widthProperty().bind(model.anchoProperty());
		
		root.getRectanguloShape().heightProperty().bind(model.altoProperty());
		
	}
	
	public RectanguloView getRoot() {
		return root;
	}
	
}
