
module cl.duoc.gestionmaquinaria {

    requires javafx.controls;
    requires javafx.fxml;

    opens cl.duoc.gestionmaquinaria
            to javafx.fxml;

    opens cl.duoc.gestionmaquinaria.controller
            to javafx.fxml;

    exports cl.duoc.gestionmaquinaria;
}
