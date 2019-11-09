package dad.javafx.hexagon;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class HexagonController {

	private HexagonModel model = new HexagonModel();
	private HexagonView root = new HexagonView();
	
	public HexagonController() {	
	
		Bindings.bindBidirectional(root.getRadioText().textProperty(), model.radioProperty(), new NumberStringConverter());
		
		root.getPerimetroLabel().textProperty().bind(model.perimetroProperty().asString());
	
		root.getAreaLabel().textProperty().bind(model.areaProperty().asString());
		
		root.getHexagonShape().radiusProperty().bind(model.radioProperty());
		
	}
	
	public HexagonView getRoot() {
		return root;
	}
	
}
