package dad.javafx.triangle;

import dad.javafx.geometria.shape.Triangle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class TriangleView extends GridPane {

	private Triangle trianguloShape;
	private TextField baseText;
	private TextField heightText;
	private Label areaLabel;
	private Label perimetroLabel;

	public TriangleView(){
		super();
		
		baseText = new TextField();
		baseText.setPromptText("Base");
		
		heightText = new TextField();
		heightText.setPromptText("Altura");
		
		trianguloShape = new Triangle();
		trianguloShape.setFill(Color.GREEN);
		trianguloShape.setStrokeWidth(2);
		trianguloShape.setStroke(Color.BLACK);

		areaLabel = new Label("X");
		perimetroLabel = new Label("X");
		
		this.addRow(0, new Label("Base: "), baseText);
		this.addRow(1, new Label("Altura: "), heightText);
		this.addRow(2, trianguloShape);
		this.addRow(3, new Label("Área: "), areaLabel);
		this.addRow(4, new Label("Perímetro: "), perimetroLabel);
		this.setAlignment(Pos.CENTER);
	}
	
	public Triangle getTriangleShape() {
		return trianguloShape;
	}
	
	public TextField getBaseText() {
		return baseText;
	}

	public TextField getHeightText() {
		return heightText;
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}
	
}
