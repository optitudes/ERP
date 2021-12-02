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
public class AuxiliarSacController implements Initializable{
	Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombreEstudiante1;

    @FXML
    private TextField txtIdEstudiante121;

    @FXML
    private TextField txtIdEstudiante122;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private TextField txtNombreEstudiante11;

    @FXML
    private Button btnNuevoEstudiante1;

    @FXML
    private Button btnCrearEstudiante;

    @FXML
    private Label lblFecha;

    @FXML
    private TextField txtIdEstudiante1;

    @FXML
    private Label lblUserAdmin;

    @FXML
    private TextField txtContraseniaEstudiante;

    @FXML
    private TextField txtContraseniaEstudiante1;

    @FXML
    private TextField txtIdEstudiante111;

    @FXML
    private TextField txtIdEstudiante112;

    @FXML
    private TextField txtContraseniaEstudiante11;

    @FXML
    private TextField txtNombreEstudiante112;

    @FXML
    private TextField txtNombreEstudiante111;

    @FXML
    private Button btnNuevoEstudiante11;

    @FXML
    private Button btnNuevoEstudiante;

    @FXML
    private TextField txtIdEstudiante12;

    @FXML
    private Button btnNuevoEstudiante111;

    @FXML
    private TextField txtIdEstudiante11;

    @FXML
    private TextField txtIdEstudiante;

    @FXML
    private Label lblHora;

    @FXML
    private Button btnCrearEstudiante1;

    @FXML
    private TextField txtNombreEstudiante;

    @FXML
    void Radicado(ActionEvent event) {

    }

    @FXML
    void cerrarSesionActrion(ActionEvent event) {
    	main.mostrarVentanaLogging();

    }
	public void setAplicacion(Main main) {
		this.main=main;
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblFecha.setText(lblFecha.getText()+LocalDate.now(Clock.systemDefaultZone ()));
		lblHora.setText(lblHora.getText()+LocalTime.now());
		lblUserAdmin.setText("User: Auxiliar SAC");		
		
	}

}
