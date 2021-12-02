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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class JefeFNBController implements Initializable{

	Main main;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> columnNombreEstudiante;

    @FXML
    private TableColumn<?, ?> columnNombreEstudiante11;

    @FXML
    private TableColumn<?, ?> columnIdEstudiante;

    @FXML
    private TextField txtContraseniaEstudiante121;

    @FXML
    private TextField txtIdEstudiante1111;

    @FXML
    private TableView<?> tableEstudiantes;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private TextField txtNombreEstudiante11;

    @FXML
    private TextField txtBuscarEstudiante11;

    @FXML
    private Button btnActualizarEstudiante;

    @FXML
    private Button btnBorrarEstudiante11;

    @FXML
    private Button btnCrearEstudiante;

    @FXML
    private Label lblFecha;

    @FXML
    private Button btnCrearEstudiante11;

    @FXML
    private Button btnBorrarEstudiante;

    @FXML
    private Label lblUser;

    @FXML
    private TableView<?> tableEstudiantes11;

    @FXML
    private TextField txtBuscarEstudiante;

    @FXML
    private Button btnActualizarEstudiante11;

    @FXML
    private TextField txtContraseniaEstudiante1121;

    @FXML
    private TextField txtContraseniaEstudiante1;

    @FXML
    private TextField txtContraseniaEstudiante112;

    @FXML
    private TextField txtIdEstudiante111;

    @FXML
    private TextField txtContraseniaEstudiante111;

    @FXML
    private ComboBox<String> comboTipoContraro;

    @FXML
    private TextField txtContraseniaEstudiante11;

    @FXML
    private TableColumn<?, ?> columnIdEstudiante11;

    @FXML
    private Button btnNuevoEstudiante11;

    @FXML
    private Button btnNuevoEstudiante;

    @FXML
    private TextField txtIdEstudiante11;

    @FXML
    private TextField txtIdEstudiante;

    @FXML
    private Label lblHora;

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
		lblUser.setText("User: Jefe FNB");
		comboTipoContraro.getItems().addAll("A termino fijo","Término indefinido","Obra y labor");
		
	}

	public void setAplicacion(Main main2) {
		this.main=main2;
		
	}

}
