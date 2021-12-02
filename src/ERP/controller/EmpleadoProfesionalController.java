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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
public class EmpleadoProfesionalController implements Initializable {

	Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> columnNombreEstudiante;

    @FXML
    private TableColumn<?, ?> columnIdEstudiante;

    @FXML
    private TableView<?> tableEstudiantes;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private TextField txtContraseniaEstudiante11;

    @FXML
    private Button btnActualizarEstudiante;

    @FXML
    private Button btnCrearEstudiante;

    @FXML
    private Label lblFecha;

    @FXML
    private Button btnBorrarEstudiante;

    @FXML
    private Label lblUserAdmin;

    @FXML
    private Button btnNuevoEstudiante;

    @FXML
    private TextField txtContraseniaEstudiante;

    @FXML
    private TextField txtIdEstudiante;

    @FXML
    private TextField txtBuscarEstudiante;

    @FXML
    private TextField txtContraseniaEstudiante2;

    @FXML
    private Label lblHora;

    @FXML
    private TextField txtContraseniaEstudiante1;

    @FXML
    private TextField txtNombreEstudiante;

    @FXML
    void cerrarSesionActrion(ActionEvent event) {
    	main.mostrarVentanaLogging();

    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblFecha.setText(lblFecha.getText()+LocalDate.now(Clock.systemDefaultZone ()));
		lblHora.setText(lblHora.getText()+LocalTime.now());
		lblUserAdmin.setText("User: Empleado profesional");
		
	}

	public void setAplicacion(Main main) {
		this.main=main;
		
	}

}
