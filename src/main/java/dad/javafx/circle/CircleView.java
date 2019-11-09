package dad.javafx.circle;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleView extends GridPane {

	private Circle circuloShape;
	private TextField radioText;
	private Label areaLabel;
	private Label perimetroLabel;

	public CircleView(){
		super();
		
		radioText = new TextField();
		radioText.setPromptText("Radio");
		
		circuloShape = new Circle();
		circuloShape.setFill(Color.RED);
		circuloShape.setStrokeWidth(2);
		circuloShape.setStroke(Color.BLACK);

		areaLabel = new Label("X");
		perimetroLabel = new Label("X");
		
		this.addRow(0, new Label("Radio: "), radioText);
		this.addRow(1, circuloShape);
		this.addRow(2, new Label("Área: "), areaLabel);
		this.addRow(3, new Label("Perímetro: "), perimetroLabel);
		this.setAlignment(Pos.CENTER);
	}
	
	public Circle getCircleShape() {
		return circuloShape;
	}
	
	public TextField getAnchoText() {
		return radioText;
	}

	public TextField getAltoText() {
		return radioText;
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}
	
}
