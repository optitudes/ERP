package ERP.controller;

import java.net.URL;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.ResourceBundle;

import ERP.Main;
import ERP.model.ActivosFijos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PsicologoController implements Initializable {
	Main main;

	ActivosFijos activosFijos;

	ArrayList<ActivosFijos> listaActivos= new ArrayList<ActivosFijos>();
	ObservableList<ActivosFijos> listaActivosData = FXCollections.observableArrayList();
	@FXML
	private ResourceBundle resources;

	@FXML
    private URL location;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private ComboBox<String> comboEstado;

    @FXML
    private TableColumn<ActivosFijos, String> columnIdEstudiante11;

    @FXML
    private TextField txtContraseniaEstudiante11;

    @FXML
    private TableColumn<ActivosFijos, String> columnNombreActivoFijo;

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
    private Label lblHora;

    @FXML
    private TableView<ActivosFijos> tableActivosFijos;

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
		lblUserAdmin.setText("User: Psicologo");
		comboEstado.getItems().addAll("Espera","Aceptado","Rechazado");
		
		setActivoTable();
		
		
	}

	private void setActivoTable() {
		this.columnNombreActivoFijo.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.columnIdEstudiante11.setCellValueFactory(new PropertyValueFactory<ActivosFijos,String>("iD"));

	}
		public void setAplicacion(Main mainAux) {
		this.main=mainAux;
		setDatosQuemados();
		tableActivosFijos.getItems().clear();

		tableActivosFijos.setItems(listaActivosData);
		
		
		
	}

	private void setDatosQuemados() {
		
		activosFijos= new ActivosFijos("David", "1001");
		listaActivos.add(activosFijos);
		activosFijos= new ActivosFijos("José", "1002");
		listaActivos.add(activosFijos);
		activosFijos= new ActivosFijos("Daniel", "1003");
		listaActivos.add(activosFijos);
		
		listaActivosData.addAll(listaActivos);
	}

	}