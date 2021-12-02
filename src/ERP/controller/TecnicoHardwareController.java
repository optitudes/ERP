package ERP.controller;

import java.net.URL;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import ERP.Main;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class TecnicoHardwareController implements Initializable{
	Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCrearEstudiante;

    @FXML
    private Label lblFecha;

    @FXML
    private TextField txtIdEstudiante1;

    @FXML
    private TextField txtNombreEstudiante1;

    @FXML
    private Label lblUserAdmin;

    @FXML
    private Button btnNuevoEstudiante;

    @FXML
    private TextField txtContraseniaEstudiante;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private TextField txtIdEstudiante;

    @FXML
    private Label lblHora;

    @FXML
    private Button btnCrearEstudiante1;

    @FXML
    private TextField txtNombreEstudiante;

    @FXML
    void crearEstudianteAction(ActionEvent event) {

    }

    @FXML
    void cerrarSesionActrion(ActionEvent event) {
    	main.mostrarVentanaLogging();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblFecha.setText(lblFecha.getText()+LocalDate.now(Clock.systemDefaultZone ()));
		lblHora.setText(lblHora.getText()+LocalTime.now());
		lblUserAdmin.setText("User: Técnico en hardware");		
		
	}

	public void setAplicacion(Main main2) {
		this.main=main2;
		
	}

}
