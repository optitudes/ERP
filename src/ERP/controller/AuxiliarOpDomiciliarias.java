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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class AuxiliarOpDomiciliarias implements Initializable{
	Main main;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> comboAuxiliar;

    @FXML
    private Label lblFecha;

    @FXML
    private TextField txtIdEstudiante1;

    @FXML
    private TextField txtIdEstudiante121;

    @FXML
    private Label lblUserAdmin;

    @FXML
    private TextField txtIdEstudiante12;

    @FXML
    private TextField txtIdEstudiante11;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Label lblHora;

    @FXML
    private TextField txtContraseniaEstudiante1;

    @FXML
    private Button btnNuevoEstudiante1;

    @FXML
    void cerrarSesionActrion(ActionEvent event) {
    	main.mostrarVentanaLogging();

    }
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblFecha.setText(lblFecha.getText()+LocalDate.now(Clock.systemDefaultZone ()));
		lblHora.setText(lblHora.getText()+LocalTime.now());
		lblUserAdmin.setText("User: Auxiliar operaciones domiciliarias");
		comboAuxiliar.getItems().addAll("Daniel","Pablo","Sebas","Alejandro");
		
		
	}

	public void setAplicacion(Main main2) {
		this.main=main2;
		
	}

}
