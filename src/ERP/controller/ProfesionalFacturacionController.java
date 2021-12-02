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
public class ProfesionalFacturacionController implements Initializable {

	Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtIdEstudiante1211;

    @FXML
    private TextField txtIdEstudiante1112;

    @FXML
    private TextField txtIdEstudiante1212;

    @FXML
    private TableColumn<?, ?> columnNombreEstudiante11;

    @FXML
    private TextField txtContraseniaEstudiante121;

    @FXML
    private TextField txtIdEstudiante121;

    @FXML
    private TextField txtIdEstudiante1111;

    @FXML
    private TextField txtIdEstudiante122;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private TextField txtNombreEstudiante11;

    @FXML
    private TextField txtBuscarEstudiante11;

    @FXML
    private Button btnNuevoEstudiante1;

    @FXML
    private Button btnBorrarEstudiante11;

    @FXML
    private Label lblFecha;

    @FXML
    private TextField txtIdEstudiante1;

    @FXML
    private Button btnCrearEstudiante11;

    @FXML
    private Label lblUserAdmin;

    @FXML
    private TableView<?> tableEstudiantes11;

    @FXML
    private Button btnActualizarEstudiante11;

    @FXML
    private TextField txtContraseniaEstudiante1121;

    @FXML
    private TextField txtIdEstudiante1221;

    @FXML
    private TextField txtIdEstudiante111;

    @FXML
    private TextField txtContraseniaEstudiante111;

    @FXML
    private TextField txtContraseniaEstudiante11;

    @FXML
    private TableColumn<?, ?> columnIdEstudiante11;

    @FXML
    private TextField txtIdEstudiante12111;

    @FXML
    private TextField txtIdEstudiante13;

    @FXML
    private Button btnNuevoEstudiante11;

    @FXML
    private TextField txtIdEstudiante12;

    @FXML
    private Button btnNuevoEstudiante111;

    @FXML
    private TextField txtIdEstudiante11;

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
		lblUserAdmin.setText("User: Profesional de facturación");		
		
	}
	public void setAplicacion(Main main2) {
		this.main=main2;
		
	}

}
