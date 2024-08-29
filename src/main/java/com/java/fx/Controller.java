package com.java.fx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class Controller implements Initializable {

    @FXML
    public Label ejemplo;

    public void cambio() {
        ejemplo.setText("Cambio desde controller");
    }

    @Bean
    String titulo(){
        return "Desde Controller";
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cambio();
    }
}
