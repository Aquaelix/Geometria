package dad.javafx.hexagon;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class HexagonModel {

	private DoubleProperty radio = new SimpleDoubleProperty();
	
	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	
	public HexagonModel() {
		area.bind(perimetro.multiply(Math.sqrt(3)).multiply(radio).divide(4));
		perimetro.bind(radio.multiply(6));
		
		/*
		area hexagono = perimetro * raiz cuadrada de 3 * radio entre 4
		perimetro hexagono = lado (radio) * 6
		*/
	}

	public final DoubleProperty radioProperty() {
		return this.radio;
	}
	

	public final double getRadio() {
		return this.radioProperty().get();
	}
	

	public final void setRadio(final double radio) {
		this.radioProperty().set(radio);
	}

	public final javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}
	

	public final double getPerimetro() {
		return this.perimetroProperty().get();
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}
	

	public final double getArea() {
		return this.areaProperty().get();
	}
	
	
}
