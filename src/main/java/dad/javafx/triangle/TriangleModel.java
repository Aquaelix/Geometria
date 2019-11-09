package dad.javafx.triangle;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class TriangleModel {

	private DoubleProperty base = new SimpleDoubleProperty();
	private DoubleProperty height = new SimpleDoubleProperty();

	private ReadOnlyDoubleWrapper perimetro = new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper area = new ReadOnlyDoubleWrapper();
	
	public TriangleModel() {
		area.bind(base.multiply(height).divide(2));
		perimetro.bind(base.add((height.multiply(height).add(base.divide(2).multiply(base).divide(2))).multiply(2)));
		
		//c=raiz cuadrada de h^2 y base^2/2
		//calcular una hipotenusa y multiplicarla por 2
	}

	public final DoubleProperty baseProperty() {
		return this.base;
	}
	

	public final double getAncho() {
		return this.baseProperty().get();
	}
	

	public final void setAncho(final double ancho) {
		this.baseProperty().set(ancho);
	}
	

	public final DoubleProperty heightProperty() {
		return this.height;
	}
	

	public final double getAlto() {
		return this.heightProperty().get();
	}
	

	public final void setAlto(final double alto) {
		this.heightProperty().set(alto);
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
