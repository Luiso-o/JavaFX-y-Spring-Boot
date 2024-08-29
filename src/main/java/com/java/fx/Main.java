package com.java.fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main extends Application {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		var context = SpringApplication.run(Main.class);
		var fxml = new FXMLLoader(getClass().getResource("/Main.fxml"));
		var scene = new Scene(fxml.load());

		String titulo = context.getBean("titulo", String.class);

		stage.setTitle(titulo);
		stage.setScene(scene);
		stage.show();
	}
}
