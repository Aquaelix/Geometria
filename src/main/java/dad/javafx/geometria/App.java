package dad.javafx.geometria;

import dad.javafx.circle.CircleController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private CircleController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new CircleController();
		
		Scene scene = new Scene(controller.getRoot(), 320, 200);
		
		primaryStage.setTitle("InicioSesionMVC");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
