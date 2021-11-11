package dad.enviaremail;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {
	
	private Controller controller;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controller = new Controller();
		
		Scene scene = new Scene(controller.getEmailGrid(), controller.getEmailGrid().getPrefWidth(), controller.getEmailGrid().getPrefHeight());
		primaryStage.setTitle("Enviar email");
		primaryStage.getIcons().add(new Image("email-send-icon-32x32.png"));
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
