package dad.javafx.hexagon;

import dad.javafx.geometria.shape.Hexagon;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class HexagonView extends GridPane {

	private Hexagon hexagonShape;
	private TextField radioText;
	private Label areaLabel;
	private Label perimetroLabel;

	public HexagonView(){
		super();
		
		radioText = new TextField();
		radioText.setPromptText("Radio");
		
		hexagonShape = new Hexagon();
		hexagonShape.setFill(Color.PURPLE);
		hexagonShape.setStrokeWidth(2);
		hexagonShape.setStroke(Color.BLACK);

		areaLabel = new Label("X");
		perimetroLabel = new Label("X");
		
		this.addRow(0, new Label("Radio: "), radioText);
		this.addRow(1, hexagonShape);
		this.addRow(2, new Label("Área: "), areaLabel);
		this.addRow(3, new Label("Perímetro: "), perimetroLabel);
		this.setAlignment(Pos.CENTER);
	}
	
	public Hexagon getHexagonShape() {
		return hexagonShape;
	}
	
	public TextField getRadioText() {
		return radioText;
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}
	
}
