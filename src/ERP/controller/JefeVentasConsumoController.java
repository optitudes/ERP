package ERP.controller;

import java.net.URL;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import ERP.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class JefeVentasConsumoController implements Initializable {

	Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblFecha;

    @FXML
    private TextField txtIdEstudiante121;

    @FXML
    private Button btnNuevoEstudiante11;

    @FXML
    private TextField txtIdEstudiante111;

    @FXML
    private Button btnNuevoEstudiante112;

    @FXML
    private Button btnNuevoEstudiante111;

    @FXML
    private TextField txtIdEstudiante11;

    @FXML
    private Label lblUser;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Label lblHora;

    @FXML
    void cerrarSesionActrion(ActionEvent event) {
    	main.mostrarVentanaLogging();

    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblFecha.setText(lblFecha.getText()+LocalDate.now(Clock.systemDefaultZone ()));
		lblHora.setText(lblHora.getText()+LocalTime.now());
		lblUser.setText("User: Jefe de ventas y consumo");

	}
	public void setAplicacion(Main main2) {
		this.main=main2;
		
	}

}
