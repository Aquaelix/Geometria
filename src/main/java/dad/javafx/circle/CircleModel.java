package dad.javafx.circle;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class CircleModel {

	private DoubleProperty radio = new SimpleDoubleProperty();

	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	
	public CircleModel() {
		area.bind(radio.multiply(2).multiply(Math.PI));
		perimetro.bind(radio.multiply(radio).multiply(Math.PI));
		
	}

	public final DoubleProperty radioProperty() {
		return this.radio;
	}
	

	public final double getRadio() {
		return this.radioProperty().get();
	}
	

	public final void setRadio(final double ancho) {
		this.radioProperty().set(ancho);
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
