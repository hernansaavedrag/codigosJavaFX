
package cl.duoc.gestionmaquinaria.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalController {

    @FXML
    private void abrirRegistro() {

        try {
            // 1. Cargar el formulario de registro
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource(
                            "/cl/duoc/gestionmaquinaria/registro.fxml"
                    )
            );

            // 2. Crear una Scene con el formulario
            Scene scene = new Scene(loader.load());

            // 3. Crear una segunda ventana
            Stage ventanaRegistro = new Stage();

            // 4. Configurar la ventana
            ventanaRegistro.setTitle(
                    "Registro de maquinaria"
            );

            ventanaRegistro.setScene(scene);

            // 5. Configurar como ventana modal
            ventanaRegistro.initModality(
                    Modality.APPLICATION_MODAL
            );

            // 6. Mostrar y esperar a que se cierre
            ventanaRegistro.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

