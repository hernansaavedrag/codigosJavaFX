
package cl.duoc.gestionmaquinaria.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistroController {

    @FXML
    private Button btnCancelar;

    @FXML
    private ComboBox<String> cmbTipo;

    @FXML
    private Label lblPeso;

    @FXML
    private TextField txtPeso;

    @FXML
    private CheckBox chkMantencion;

    @FXML
    private CheckBox chkCertificacion;

    @FXML
    private Label lblCapacidadBalde;

    @FXML
    private TextField txtCapacidadBalde;

    @FXML
    private void initialize() {

        // Cargar las opciones del ComboBox
        cmbTipo.getItems().addAll(
                "Excavadora",
                "Cargador Frontal"
        );

        // Al comenzar, no mostrar campos específicos
        cambiarTipo();
    }

    @FXML
    private void cambiarTipo() {

        String tipo = cmbTipo.getValue();

        boolean esExcavadora =
                "Excavadora".equals(tipo);

        boolean esCargador =
                "Cargador Frontal".equals(tipo);

        // Campos exclusivos de Excavadora
        lblPeso.setVisible(esExcavadora);
        lblPeso.setManaged(esExcavadora);

        txtPeso.setVisible(esExcavadora);
        txtPeso.setManaged(esExcavadora);

        chkMantencion.setVisible(esExcavadora);
        chkMantencion.setManaged(esExcavadora);

        chkCertificacion.setVisible(esExcavadora);
        chkCertificacion.setManaged(esExcavadora);

        // Campos exclusivos de Cargador Frontal
        lblCapacidadBalde.setVisible(esCargador);
        lblCapacidadBalde.setManaged(esCargador);

        txtCapacidadBalde.setVisible(esCargador);
        txtCapacidadBalde.setManaged(esCargador);
    }

    @FXML
    private void cancelar() {

        Stage ventana = (Stage)
                btnCancelar.getScene().getWindow();

        ventana.close();
    }
}
