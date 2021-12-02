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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
public class ProfesionalNominaController implements Initializable{
	Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombreEstudiante1;

    @FXML
    private TextField txtContraseniaEstudiante112;

    @FXML
    private TableView<?> tableEstudiantes1;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private TableColumn<?, ?> columnIdEstudiante1;

    @FXML
    private TextField txtContraseniaEstudiante12;

    @FXML
    private Button btnNuevoEstudiante1;

    @FXML
    private Button btnActualizarEstudiante1;

    @FXML
    private Label lblFecha;

    @FXML
    private TextField txtIdEstudiante1;

    @FXML
    private Label lblUserAdmin;

    @FXML
    private Button btnBorrarEstudiante1;

    @FXML
    private TextField txtBuscarEstudiante1;

    @FXML
    private Button btnNuevoInstructor;

    @FXML
    private TableColumn<?, ?> columnNombreEstudiante1;

    @FXML
    private Label lblHora;

    @FXML
    private TextField txtContraseniaEstudiante1;

    @FXML
    private Button btnCrearEstudiante1;

    @FXML
    void cerrarSesionActrion(ActionEvent event) {
    	main.mostrarVentanaLogging();

    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblFecha.setText(lblFecha.getText()+LocalDate.now(Clock.systemDefaultZone ()));
		lblHora.setText(lblHora.getText()+LocalTime.now());
		lblUserAdmin.setText("User: Profesional de nomina");
		
	}

	public void setAplicacion(Main main2) {
		this.main=main2;
		
	}

}
