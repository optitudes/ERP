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
import ERP.model.TipoLogginEnum;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class AdminController implements Initializable{

	Main main;

	ActivosFijos activosFijos;
	Admin        admin;
	
	ArrayList<ActivosFijos> listaActivos= new ArrayList<ActivosFijos>();
	ArrayList<Admin> listaAdmins= new ArrayList<Admin>();
	
	ObservableList<ActivosFijos> listaActivosData = FXCollections.observableArrayList();
	ObservableList<Admin> listaAdminsData = FXCollections.observableArrayList();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombreEstudiante1;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private Button btnActualizarEstudiante;

    @FXML
    private TableColumn<Admin, String> columnIdAdmin;

    @FXML
    private Button btnNuevoEstudiante1;

    @FXML
    private Button btnCrearEstudiante;

    @FXML
    private Label lblFecha;

    @FXML
    private TextField txtIdEstudiante1;

    @FXML
    private Button btnBorrarEstudiante;

    @FXML
    private Label lblUserAdmin;

    @FXML
    private Button btnBorrarEstudiante1;

    @FXML
    private TextField txtBuscarEstudiante1;

    @FXML
    private TextField txtContraseniaEstudiante;

    @FXML
    private TextField txtBuscarEstudiante;

    @FXML
    private TableView<Admin> tableRegistroAdmins;

    @FXML
    private TextField txtContraseniaEstudiante1;

    @FXML
    private TextField txtContraseniaEstudiante112;

    @FXML
    private TextField txtContraseniaEstudiante111;

    @FXML
    private ComboBox<TipoLogginEnum> comboTipoAcceso;

    @FXML
    private TableColumn<Admin, String> columnNombreAdmin;

    @FXML
    private TableColumn<ActivosFijos, String> columnIdEstudiante11;

    @FXML
    private TextField txtContraseniaEstudiante11;

    @FXML
    private TableColumn<ActivosFijos, String> columnNombreActivoFijo;

    @FXML
    private Button btnNuevoEstudiante;

    @FXML
    private TextField txtIdEstudiante;

    @FXML
    private Button btnAcceder;

    @FXML
    private Label lblHora;

    @FXML
    private TableView<ActivosFijos> tableActivosFijos;

    @FXML
    private Button btnCrearEstudiante1;

    @FXML
    private TextField txtNombreEstudiante;



    @FXML
    void accederAction(ActionEvent event) {
    	if(comboTipoAcceso.getValue()!=null)
    	{
    		TipoLogginEnum tipoLog=(TipoLogginEnum) comboTipoAcceso.getValue();

    		switch(tipoLog)
    		{
    		case GERENTE:main.cargarVistaGerente();
						 break;
			case ADMINISTRADOR:main.cargarVistaAdministrador();
						 break;
			case PSICOLOGO:main.cargarVistaPsicologo();
						 break;
			case DIRECTOR_RECURSOS_HUMANOS :main.cargarVistaDirectorRecursosHumanos();
						break;
			case JEFE_FNB :main.cargarVistaJefeFNB();
						break;
			case JEFE_VENTAS_Y_CONSUMO :main.cargarVistaJefeVentasConsumo();
						break;
			case EMPLEADO_PROFESIONAL :main.cargarVistaEmpleadoProfesional();
						break;
			case JEFE_SERVICIO_AL_CLIENTE :main.cargarVistaJefeServicioCliente();
						break;
			case GESTOR_SERVICIO_CLIENTE :main.cargarVistaGestorServicioCliente();
						break;
			case AUXILAR_SAC :main.cargarVistaAuxiliarSac();
						break;
			case AUXILIAR_OPERACIONES_DOMICILIARIAS :main.cargarVistaAuxiliarOperacionesDomiciliarias();
						break;
			case PROFESIONAL_DE_FACTURACION :main.cargarVistaProfesionalFacturacion();
						break;
			case AUXILIAR_FACTURACION :main.cargarVistaAuxiliarFacturacion();
						break;
			case PROFESIONAL_NOMINA :main.cargarVistaProfesionalNomina();
						break;
			case COORDINADOR_SAC :main.cargarVistaCoordinadorSac();
						break;
			case JEFE_MANTENIMIENTO :main.cargarVistaJefeMantenimiento();
						break;
			case INGENIERO_GASODUCTO :main.cargarVistaIngenieroGasoducto();
						break;
			case AUXILIAR_GASODUCTO :main.cargarVistaAuxiliarGasoducto();
						break;
			case TECNICO_HARDWARE :main.cargarVistaTecnicoHardware();
						break;
			case TECNICO_SOFTWARE :main.cargarVistaTecnicoSoftware();
						break;
			case INGENIERO_SISTEMAS :main.cargarVistaIngenieroSistemas();
						break;
			case PLANEACION :main.cargarVistaPlaneacion();
						break;
			case GESTOR_CALL_CENTER :main.cargarVistaGestorCallCenter();
						break;
			}
			
		}else{
			mostrarMensaje("Error logging","tipo de acceso no seleccionado", ""
					+ "No se ha seleccionado un tipo de acceso...", AlertType.ERROR);
			
		}
    }

    @FXML
    void cerrarSesionActrion(ActionEvent event) {

    }
    public void mostrarMensaje(String titulo, String header, String contenido, AlertType alertType) {

    	Alert alert = new Alert(alertType);
    	alert.setTitle      (titulo);
    	alert.setHeaderText (header);
    	alert.setContentText(contenido);
    	alert.showAndWait   ();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		lblFecha.setText(lblFecha.getText()+LocalDate.now(Clock.systemDefaultZone ()));
		lblHora.setText(lblHora.getText()+LocalTime.now());
		lblUserAdmin.setText("User: Gerente");
		ObservableList<TipoLogginEnum> listaTipos= FXCollections.observableArrayList() ;
		listaTipos.addAll(TipoLogginEnum.values());
		comboTipoAcceso.getItems().addAll(listaTipos);

		setAdminTable();
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

	public void setAplicacion(Main mainAux) {
		this.main=mainAux;
		setDatosQuemados();
		tableActivosFijos.getItems().clear();
		tableRegistroAdmins.getItems().clear();

		tableActivosFijos.setItems(listaActivosData);
		tableRegistroAdmins.setItems(listaAdminsData);
		
		
		
	}

	private void setDatosQuemados() {
		
		activosFijos= new ActivosFijos("Provevor de caldas", "4001");
		listaActivos.add(activosFijos);
		activosFijos= new ActivosFijos("Proveedor de risaralda", "4002");
		listaActivos.add(activosFijos);
		activosFijos= new ActivosFijos("Proveedor del quindio", "4003");
		listaActivos.add(activosFijos);
		
		listaActivosData.addAll(listaActivos);

		admin= new Admin("Marcos", "2001");
		listaAdmins.add(admin);
		admin= new Admin("Juan", "2002");
		listaAdmins.add(admin);
		admin= new Admin("Alejandro", "2003");
		listaAdmins.add(admin);

		listaAdminsData.addAll(listaAdmins);
		
}
}
