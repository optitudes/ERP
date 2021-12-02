package ERP.controller;

import java.net.URL;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import ERP.Main;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class JefeServicioClienteController implements Initializable{

	Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtIdEstudiante1211;

    @FXML
    private TextField txtNombreEstudiante1;

    @FXML
    private TextField txtIdEstudiante121;

    @FXML
    private TextField txtIdEstudiante111;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private TextField txtNombreEstudiante11;

    @FXML
    private TextField txtContraseniaEstudiante11;

    @FXML
    private Button btnNuevoEstudiante1;

    @FXML
    private Label lblFecha;

    @FXML
    private TextField txtIdEstudiante1;

    @FXML
    private TextField txtNombreEstudiante111;

    @FXML
    private Button btnNuevoEstudiante11;

    @FXML
    private Label lblUserAdmin;

    @FXML
    private TextField txtIdEstudiante12;

    @FXML
    private TextField txtIdEstudiante11;

    @FXML
    private Label lblHora;

    @FXML
    private TextField txtContraseniaEstudiante1;

    @FXML
    private Button btnCrearEstudiante1;

    @FXML
    void Radicado(ActionEvent event) {

    }

    @FXML
    void cerrarSesionActrion(ActionEvent event) {
    	main.mostrarVentanaLogging();
    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblFecha.setText(lblFecha.getText()+LocalDate.now(Clock.systemDefaultZone ()));
		lblHora.setText(lblHora.getText()+LocalTime.now());
		lblUserAdmin.setText("User: Jefe servicio al cliente");
		
	}

	public void setAplicacion(Main main) {
		this.main=main;
		
	}

}
