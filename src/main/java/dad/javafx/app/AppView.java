package dad.javafx.app;

import dad.javafx.circle.CircleController;
import dad.javafx.hexagon.HexagonController;
import dad.javafx.rectangle.RectanguloController;
import dad.javafx.triangle.TriangleController;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class AppView extends TabPane{

	public AppView() {
		super();
		
		RectanguloController rectanguloController = new RectanguloController();
		CircleController circuloController = new CircleController();
		TriangleController trianguloController = new TriangleController();
		HexagonController hexagonoController = new HexagonController();
		
		setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
		getTabs().add(new Tab("Rectángulo", rectanguloController.getRoot()));
		getTabs().add(new Tab("Círculo",  circuloController.getRoot()));
		getTabs().add(new Tab("Triángulo", trianguloController.getRoot()));
		getTabs().add(new Tab("Hexágono", hexagonoController.getRoot()));
	
	}
}
