package dad.javafx.rectangle;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class RectanguloView extends GridPane {

	private Rectangle rectanguloShape;
	private TextField anchoText;
	private TextField altoText;
	private Label areaLabel;
	private Label perimetroLabel;

	public RectanguloView(){
		super();
		
		anchoText = new TextField();
		anchoText.setPromptText("Ancho");
		
		altoText = new TextField();
		altoText.setPromptText("Alto");
		
		rectanguloShape = new Rectangle();
		rectanguloShape.setFill(Color.rgb(0, 162, 232));
		rectanguloShape.setStrokeWidth(2);
		rectanguloShape.setStroke(Color.BLACK);

		areaLabel = new Label("X");
		perimetroLabel = new Label("X");
		
		this.addRow(0, new Label("Ancho: "), anchoText);
		this.addRow(1, new Label("Alto: "), altoText);
		this.addRow(2, rectanguloShape);
		this.addRow(3, new Label("Área: "), areaLabel);
		this.addRow(4, new Label("Perímetro: "), perimetroLabel);
		this.setAlignment(Pos.CENTER);
	}
	
	public Rectangle getRectanguloShape() {
		return rectanguloShape;
	}
	
	public TextField getAnchoText() {
		return anchoText;
	}

	public TextField getAltoText() {
		return altoText;
	}

	public Label getAreaLabel() {
		return areaLabel;
	}

	public Label getPerimetroLabel() {
		return perimetroLabel;
	}
	
}
