
package cl.duoc.gestionmaquinaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void init() {
        System.out.println("1. init(): preparando aplicación");
    }

    @Override
    public void start(Stage stage) throws IOException {

        System.out.println("2. start(): creando ventana");

        FXMLLoader loader = new FXMLLoader(
                App.class.getResource("principal.fxml")
        );

        Scene scene = new Scene(loader.load(), 850, 550);

        stage.setTitle("Sistema de Gestión de Maquinaria");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println("3. stop(): cerrando aplicación");
    }

    public static void main(String[] args) {
        System.out.println("0. main(): iniciando JavaFX");
        launch(args);
    }
}

