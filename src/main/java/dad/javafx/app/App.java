package dad.javafx.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private AppController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		controller = new AppController();
		
		Scene scene = new Scene(controller.getRoot(), 320, 200);
		
		primaryStage.setTitle("Geometría");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
