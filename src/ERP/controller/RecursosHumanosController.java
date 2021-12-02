package ERP.controller;

import java.net.URL;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import ERP.Main;
import ERP.model.TipoLogginEnum;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
public class RecursosHumanosController implements Initializable{
	Main main;
	
	   @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private ComboBox<TipoLogginEnum> comboCargoEmpleado;

	    @FXML
	    private TableColumn<?, ?> columnNombreEstudiante;

	    @FXML
	    private TableColumn<?, ?> columnIdEstudiante;

	    @FXML
	    private TextField txtNombreEstudiante2;

	    @FXML
	    private TextField txtNombreEstudiante1;

	    @FXML
	    private TableView<?> tableEstudiantes2;

	    @FXML
	    private TableView<?> tableEstudiantes;

	    @FXML
	    private TableView<?> tableEstudiantes1;

	    @FXML
	    private Button btnCerrarSesion;

	    @FXML
	    private Button btnNuevoEstudiante2;

	    @FXML
	    private Button btnActualizarEstudiante;

	    @FXML
	    private Button btnNuevoEstudiante1;

	    @FXML
	    private Button btnCrearEstudiante;

	    @FXML
	    private Label lblFecha;

	    @FXML
	    private TextField txtBuscarEstudiante2;

	    @FXML
	    private TextField txtIdEstudiante1;

	    @FXML
	    private Button btnBorrarEstudiante;

	    @FXML
	    private TextField txtBuscarEstudiante1;

	    @FXML
	    private TextField txtContraseniaEstudiante;

	    @FXML
	    private Label lblUser;

	    @FXML
	    private TextField txtBuscarEstudiante;

	    @FXML
	    private TextField txtContraseniaEstudiante1;

	    @FXML
	    private TextField txtContraseniaEstudiante112;

	    @FXML
	    private TextField txtContraseniaEstudiante111;

	    @FXML
	    private ComboBox<TipoLogginEnum> comboTipoEmpleadoAux;

	    @FXML
	    private TableColumn<?, ?> columnIdEstudiante2;

	    @FXML
	    private TableColumn<?, ?> columnIdEstudiante1;

	    @FXML
	    private TextField txtContraseniaEstudiante11;

	    @FXML
	    private Button btnActualizarEstudiante1;

	    @FXML
	    private Button btnNuevoEstudiante11;

	    @FXML
	    private Button btnNuevoEstudiante;

	    @FXML
	    private Button btnActualizarEstudiante2;

	    @FXML
	    private TextField txtIdEstudiante;

	    @FXML
	    private TableColumn<?, ?> columnNombreEstudiante2;

	    @FXML
	    private TableColumn<?, ?> columnNombreEstudiante1;

	    @FXML
	    private Button btnCrearEstudiante2;

	    @FXML
	    private Label lblHora;

	    @FXML
	    private ComboBox<TipoLogginEnum> comboTipoEmpleado;

	    @FXML
	    private Button btnCrearEstudiante1;

	    @FXML
	    private TextField txtNombreEstudiante;

	    @FXML
	    private Button btnActualizarEstudiante21;

	    @FXML
	    void cerrarSesionAction(ActionEvent event) {
	    	main.mostrarVentanaLogging();

	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	lblFecha.setText(lblFecha.getText()+LocalDate.now(Clock.systemDefaultZone ()));
	    	lblHora.setText(lblHora.getText()+LocalTime.now());
	    	lblUser.setText("User: Recursos humanos");
	    	ObservableList<TipoLogginEnum> listaTipos= FXCollections.observableArrayList() ;
	    	listaTipos.addAll(TipoLogginEnum.values());
	    	comboCargoEmpleado.getItems().addAll(listaTipos);
	    	comboTipoEmpleado.getItems().addAll(listaTipos);
	    	comboTipoEmpleadoAux.getItems().addAll(listaTipos);

	}
		public void setAplicacion(Main main2) {
			this.main=main2;
			
		}

}
