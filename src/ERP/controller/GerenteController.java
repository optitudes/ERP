package ERP.controller;

import java.net.URL;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.ResourceBundle;

import ERP.Main;
import ERP.model.ActivosFijos;
import ERP.model.Admin;
import ERP.model.Cronograma;
import ERP.model.Nomina;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class GerenteController implements Initializable {

	Main main;

	ActivosFijos activosFijos;
	Admin        admin;
	Cronograma   cronograma;
	Nomina       nomina;
	
	ArrayList<ActivosFijos> listaActivos= new ArrayList<ActivosFijos>();
	ArrayList<Admin> listaAdmins= new ArrayList<Admin>();
	ArrayList<Cronograma> listaCronogramas= new ArrayList<Cronograma>();
	ArrayList<Nomina> listaNominas= new ArrayList<Nomina>();
	
	ObservableList<ActivosFijos> listaActivosData = FXCollections.observableArrayList();
	ObservableList<Admin> listaAdminsData = FXCollections.observableArrayList();
	ObservableList<Cronograma> listaCronogramasData = FXCollections.observableArrayList();
	ObservableList<Nomina> listaNominasData = FXCollections.observableArrayList();



    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Cronograma> tableCronograma;

    @FXML
    private TextField txtIdEstudiante1111;

    @FXML
    private TableColumn<Cronograma, String> columnFechaFinalCronograma;

    @FXML
    private TextField txtNombreEstudiante11;

    @FXML
    private TableColumn<Nomina, String> columnPagadoNomina;

    @FXML
    private TableColumn<Admin, String> columnIdAdmin;

    @FXML
    private Button btnBorrarEstudiante11;

    @FXML
    private Label lblFecha;

    @FXML
    private TableColumn<Cronograma, String> columnFechaInicioCronograma;

    @FXML
    private TextField txtIdEstudiante1;

    @FXML
    private Button btnCrearEstudiante11;

    @FXML
    private TextField txtIdEstudiante11111;

    @FXML
    private TextField txtBuscarEstudiante1;

    @FXML
    private TableView<Nomina> tableNomina;

    @FXML
    private TextField txtContraseniaEstudiante1121;

    @FXML
    private TableColumn<Nomina, String> columnIDNomina;

    @FXML
    private TableColumn<Nomina, String> colunSalarioPagarNomina;

    @FXML
    private TableColumn<Admin, String> columnNombreAdmin;

    @FXML
    private TextField txtContraseniaEstudiante11;

    @FXML
    private TextField txtContraseniaEstudiante12;

    @FXML
    private Button btnActualizarEstudiante1;

    @FXML
    private TextField txtIdEstudiante11;

    @FXML
    private Label lblHora;

    @FXML
    private Button btnCrearEstudiante1;

    @FXML
    private TableView<ActivosFijos> tableActivosFijos;

    @FXML
    private TableColumn<Cronograma, String> columnDescripcionCronograma;

    @FXML
    private TextField txtContraseniaEstudiante121;

    @FXML
    private TextField txtNombreEstudiante1;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private TableColumn<Nomina, String> columnNombreNomina;

    @FXML
    private TextField txtBuscarEstudiante11;

    @FXML
    private Button btnNuevoEstudiante1;

    @FXML
    private Label lblUserAdmin;

    @FXML
    private Button btnBorrarEstudiante1;

    @FXML
    private Button btnNuevoInstructor;

    @FXML
    private Button btnActualizarEstudiante11;

    @FXML
    private TextField txtContraseniaEstudiante1;

    @FXML
    private TableView<Admin> tableRegistroAdmins;

    @FXML
    private TextField txtContraseniaEstudiante112;

    @FXML
    private TextField txtIdEstudiante111;

    @FXML
    private TextField txtContraseniaEstudiante111;

    @FXML
    private Button btnNuevoEstudiante1112;

    @FXML
    private Button btnNuevoEstudiante1111;

    @FXML
    private TableColumn<ActivosFijos, String> columnIdEstudiante11;

    @FXML
    private TableColumn<ActivosFijos, String> columnNombreActivoFijo;

    @FXML
    private TableColumn<Nomina, String> columnSalarioNomina;

    @FXML
    private Button btnNuevoEstudiante11;

    @FXML
    private Button btnNuevoEstudiante111;

    @FXML
    private TableColumn<Nomina, String> columnDiasTrabajadosNomina;


    @FXML
    void cerrarSesionActrion(ActionEvent event) {
    	main.mostrarVentanaLogging();

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblFecha.setText(lblFecha.getText()+LocalDate.now(Clock.systemDefaultZone ()));
		lblHora.setText(lblHora.getText()+LocalTime.now());
		lblUserAdmin.setText("User: Gerente");
		
		setAdminTable();
		setCronogramaTable();
		setNominaTable();
		setActivoTable();
		
		
	}

	private void setActivoTable() {
		this.columnNombreActivoFijo.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.columnIdEstudiante11.setCellValueFactory(new PropertyValueFactory<>("iD"));

	}

	private void setAdminTable() {
		this.columnNombreAdmin.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.columnIdAdmin.setCellValueFactory(new PropertyValueFactory<>("iDD"));

	}

	private void setNominaTable() {
		this.columnDiasTrabajadosNomina.setCellValueFactory(new PropertyValueFactory<>("diasTrabajados"));
		this.columnIDNomina.setCellValueFactory(new PropertyValueFactory<>("iD"));
		this.columnNombreNomina.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		this.columnSalarioNomina.setCellValueFactory(new PropertyValueFactory<>("salario"));
		this.colunSalarioPagarNomina.setCellValueFactory(new PropertyValueFactory<>("salarioPagar"));
		this.columnPagadoNomina.setCellValueFactory(new PropertyValueFactory<>("pagado"));


	}

	private void setCronogramaTable() {
		this.columnDescripcionCronograma.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
		this.columnFechaFinalCronograma.setCellValueFactory(new PropertyValueFactory<>("fechaFinal"));
		this.columnFechaInicioCronograma.setCellValueFactory(new PropertyValueFactory<>("fechaInicio"));

		
	}

	public void setAplicacion(Main mainAux) {
		this.main=mainAux;
		setDatosQuemados();
		tableActivosFijos.getItems().clear();
		tableCronograma.getItems().clear();
		tableNomina.getItems().clear();
		tableRegistroAdmins.getItems().clear();

		tableActivosFijos.setItems(listaActivosData);
		tableCronograma.setItems(listaCronogramasData);
		tableNomina.setItems(listaNominasData);
		tableRegistroAdmins.setItems(listaAdminsData);
		
		
		
	}

	private void setDatosQuemados() {
		
		activosFijos= new ActivosFijos("Muebles", "1001");
		listaActivos.add(activosFijos);
		activosFijos= new ActivosFijos("Vehiculos", "1002");
		listaActivos.add(activosFijos);
		activosFijos= new ActivosFijos("Maquinaria", "1003");
		listaActivos.add(activosFijos);
		
		listaActivosData.addAll(listaActivos);

		admin= new Admin("Marcos", "2001");
		listaAdmins.add(admin);
		admin= new Admin("Juan", "2002");
		listaAdmins.add(admin);
		admin= new Admin("Alejandro", "2003");
		listaAdmins.add(admin);

		listaAdminsData.addAll(listaAdmins);
		
		cronograma= new Cronograma("29-11-2021", "29-12-2021","Implementación de nuevos"
				+ " negocios con el sena");
		listaCronogramas.add(cronograma);
			
		cronograma= new Cronograma("01-01-2022", "17-02-2022","Balance general de la empresa");
		listaCronogramas.add(cronograma);
			
		cronograma= new Cronograma("29-4-2022", "02-6-2022","Analisis del entorno de la organización ");
		listaCronogramas.add(cronograma);
		
		listaCronogramasData.addAll(listaCronogramas);
		
		nomina= new Nomina("3001","Javier", "29", "980.000", "1'240.000", "No");
		listaNominas.add(nomina);
		nomina= new Nomina("3002","Cristian", "30", "1'000.000", "1'400.000", "Si");
		listaNominas.add(nomina);
		nomina= new Nomina("3003","Yair", "29", "980.000", "1'240.000", "No");
		listaNominas.add(nomina);
		
		listaNominasData.addAll(listaNominas);
	}

}
